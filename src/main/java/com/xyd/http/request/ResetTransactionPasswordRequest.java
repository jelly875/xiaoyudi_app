package com.xyd.http.request;

public class ResetTransactionPasswordRequest extends AbstractRequest {

	private String phone;
	private String realName;
	private String idCard;
	private String newTransactionPassword;

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getIdCard() {
		return idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public String getNewTransactionPassword() {
		return newTransactionPassword;
	}

	public void setNewTransactionPassword(String newTransactionPassword) {
		this.newTransactionPassword = newTransactionPassword;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
