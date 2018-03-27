package com.ht.model;

import java.util.Set;

public class ImageResult {
	
	private String name;
	private Set<Integer> keyset;
	private String uniquekey;
	private String tip;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<Integer> getKeyset() {
		return keyset;
	}
	public void setKeyset(Set<Integer> keyset) {
		this.keyset = keyset;
	}
	public String getUniquekey() {
		return uniquekey;
	}
	public void setUniquekey(String uniquekey) {
		this.uniquekey = uniquekey;
	}
	public String getTip() {
		return tip;
	}
	public void setTip(String tip) {
		this.tip = tip;
	}
	@Override
	public String toString() {
		return "ImageResult [name=" + name + ", keyset=" + keyset + ", uniquekey=" + uniquekey + ", tip=" + tip + "]";
	}
	public ImageResult(String name, Set<Integer> keyset, String uniquekey, String tip) {
		super();
		this.name = name;
		this.keyset = keyset;
		this.uniquekey = uniquekey;
		this.tip = tip;
	}
	public ImageResult() {
		super();
	}
	
	
	
}
