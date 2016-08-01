package com.xyd.http.request;

public class CreateClientRequest extends AbstractRequest{
	private String phone;
	private String loginPassword;
	private String transactionPassword;
	private String invitationPhone;

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getLoginPassword() {
		return loginPassword;
	}

	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}

	public String getTransactionPassword() {
		return transactionPassword;
	}

	public void setTransactionPassword(String transactionPassword) {
		this.transactionPassword = transactionPassword;
	}

	public String getInvitationPhone() {
		return invitationPhone;
	}

	public void setInvitationPhone(String invitationPhone) {
		this.invitationPhone = invitationPhone;
	}

}
