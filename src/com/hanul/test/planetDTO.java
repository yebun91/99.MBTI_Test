package com.hanul.test;

public class planetDTO {
	private int num;
	private String name, describe;
	
	
	public planetDTO() {}
	
	public planetDTO(int num, String name, String describe) {
		super();
		this.num = num;
		this.name = name;
		this.describe = describe;
	}
	
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescribe() {
		return describe;
	}
	public void setDescribe(String describe) {
		this.describe = describe;
	}
	
	

}
