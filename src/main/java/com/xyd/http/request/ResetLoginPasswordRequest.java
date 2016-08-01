package com.xyd.http.request;

public class ResetLoginPasswordRequest extends AbstractRequest{
	private String phone;
	private String newLoginPassword;

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getNewLoginPassword() {
		return newLoginPassword;
	}

	public void setNewLoginPassword(String newLoginPassword) {
		this.newLoginPassword = newLoginPassword;
	}

}
