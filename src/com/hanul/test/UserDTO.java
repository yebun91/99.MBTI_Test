package com.hanul.test;

public class UserDTO {
	private String id, pw, name;
	private int score;
	
	
	public UserDTO() {

	}
	
	public UserDTO(String id, String pw, String name, int score) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.score = score;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}

}
