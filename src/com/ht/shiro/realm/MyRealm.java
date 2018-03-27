package com.ht.shiro.realm;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

import com.ht.model.Login;
import com.ht.model.RoleJurisdiction;
import com.ht.service.LoginService;
import com.ht.service.UserService;




public class MyRealm extends AuthorizingRealm{
	@Autowired HttpSession session;
	@Autowired HttpServletRequest request;
	
	@Autowired 
	private UserService userServiceImpl;
	
	@Autowired
	private LoginService loginServiceImpl;
	//控制权限
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		//1. 从PrincipalCollection中获取登录用户的信息
		Object principal=principals.getPrimaryPrincipal();
		
		//获得登录的用户信息
		Login login=(Login) session.getAttribute("user");
		
		//根据用户的角色id查询该用户拥有的权限
		List<RoleJurisdiction> list=userServiceImpl.seluserrolejurisdiction(login.getRid());
		//2. 利用登录的用户的信息来获取当前用户的角色或权限(可能需要查询数据库)
		Set<String> roles =new HashSet<>();
		for (int i = 0; i < list.size(); i++) {
			roles.add(list.get(i).getJurl());
		}
		
		//3. 创建SimpleAuthorizationInfo 并设置其 roles属性
		SimpleAuthorizationInfo info=new SimpleAuthorizationInfo(roles);
		
		//4. 返回SimpleAuthorizationInfo 对象
		return info;

	}
	
	
	//控制登入
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		
		//获得账号密码令牌里的账号
		Object username=token.getPrincipal();
		String usernames=(String) username;
		
		//获得账号密码令牌里的密码
		//String password = new String((char[])token.getCredentials());
		//System.out.println("密码是："+password);
		
		//查询数据库中的用户信息
		Login login=loginServiceImpl.sellogin(usernames);
		
		//验证账号密码是否匹配
		//第一个参数token里面的 Object类型的用户名  第二个参数 数据库加密后的密码  第三个参数  以用户名作为盐值  第四个参数 固定值
 		AuthenticationInfo info=new SimpleAuthenticationInfo(username, login.getPassword(), ByteSource.Util.bytes(username),this.getName() );
	
		return info;
	}
}
