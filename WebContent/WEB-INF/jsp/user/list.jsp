<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags"%>  

<% String path=request.getContextPath(); %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=path %>/">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>这是list.jsp</h3>

用户:${user.username} <a href="logout">退出</a>   <br>

<shiro:hasRole name="adduser">
<a href="user/toadd">新增</a>
<br/>
</shiro:hasRole>
				
<table border="1">
			<tr>
				<td>编号</td><td>姓名</td><td>年龄</td><td>性别</td><td>创建时间</td><td>操作</td>
			</tr>
			
			<c:forEach items="${list }" var="user">
			<tr>
				<td>${user.uid }</td>
				<td>${user.uname }</td>
				<td>${user.age }</td>
				<td>${user.sex }</td>
				<td>${user.createtime }</td>
				<td>
				<shiro:hasRole name="updateuser">
				<a href="user/openUserEdit/${user.uid }">修改用户</a>|
				</shiro:hasRole>
				
				<shiro:hasRole name="deleteuser">
				<a href="user/delete/${user.uid }">删除用户</a>
				</shiro:hasRole>
				</td>
			</tr>
			</c:forEach>
		</table>



</body>
</html>