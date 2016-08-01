package com.xyd.http.request;

public class AddBankCardRequest extends AbstractRequest {

	private Integer clientId;
	private String realName;
	private String cardNumber;
	private String bankName;
	private String reservePhone;

	public Integer getClientId() {
		return clientId;
	}

	public void setClientId(Integer clientId) {
		this.clientId = clientId;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getReservePhone() {
		return reservePhone;
	}

	public void setReservePhone(String reservePhone) {
		this.reservePhone = reservePhone;
	}

}
