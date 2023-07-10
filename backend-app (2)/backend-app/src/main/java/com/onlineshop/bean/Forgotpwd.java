package com.onlineshop.bean;

public class Forgotpwd {
	private String confirmpassword;
	private String emailid;
	private String password;
	
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid=emailid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getConfirmPassword() {
		return password;
	}
	public void setConfirmPassword(String password) {
		this.confirmpassword = password;
	}
	@Override
	public String toString() {
		return "forgotpwd [emailid=" + emailid + ", password=" + password + ", confirmpassword=" + confirmpassword + "];";
	}
	
}
