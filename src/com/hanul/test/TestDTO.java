package com.hanul.test;

public class TestDTO {
	private int num;
	private String ex, select1, select2;
	
	
	public TestDTO() {};
	
	public TestDTO(int num, String ex, String select1, String select2) {
		super();
		this.num = num;
		this.ex = ex;
		this.select1 = select1;
		this.select2 = select2;

	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getEx() {
		return ex;
	}

	public void setEx(String ex) {
		this.ex = ex;
	}

	public String getSelect1() {
		return select1;
	}

	public void setSelect1(String select1) {
		this.select1 = select1;
	}

	public String getSelect2() {
		return select2;
	}

	public void setSelect2(String select2) {
		this.select2 = select2;
	}


}
