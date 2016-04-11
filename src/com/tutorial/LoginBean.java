package com.tutorial;

public class LoginBean {
	private String name;
    private String password;
	private String day;
    public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public LoginBean(){
    	
    }
    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
