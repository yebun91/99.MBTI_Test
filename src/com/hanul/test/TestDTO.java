package com.hanul.test;

public class TestDTO {
	private int num;
	private String ex, select1, select2, select3, select4, select5;
	private int result;
	
	
	public TestDTO() {};
	
	public TestDTO(int num, String ex, String select1, String select2, String select3, String select4, String select5,
			int result) {
		super();
		this.num = num;
		this.ex = ex;
		this.select1 = select1;
		this.select2 = select2;
		this.select3 = select3;
		this.select4 = select4;
		this.select5 = select5;
		this.result = result;
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

	public String getSelect3() {
		return select3;
	}

	public void setSelect3(String select3) {
		this.select3 = select3;
	}

	public String getSelect4() {
		return select4;
	}

	public void setSelect4(String select4) {
		this.select4 = select4;
	}

	public String getSelect5() {
		return select5;
	}

	public void setSelect5(String select5) {
		this.select5 = select5;
	}

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}
	
	

}
