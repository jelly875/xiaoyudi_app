package com.xyd.http.request;

public class RepayLoanRequest extends AbstractRequest {

	private Integer clientId;
	private Integer cardId;
	private Integer repaymentId;
	private Integer type;
	private String transactionPassword;

	public Integer getClientId() {
		return clientId;
	}

	public void setClientId(Integer clientId) {
		this.clientId = clientId;
	}

	public Integer getCardId() {
		return cardId;
	}

	public void setCardId(Integer cardId) {
		this.cardId = cardId;
	}

	public Integer getRepaymentId() {
		return repaymentId;
	}

	public void setRepaymentId(Integer repaymentId) {
		this.repaymentId = repaymentId;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getTransactionPassword() {
		return transactionPassword;
	}

	public void setTransactionPassword(String transactionPassword) {
		this.transactionPassword = transactionPassword;
	}

}
