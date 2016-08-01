package com.xyd.http.request;

public class LoanRequest extends AbstractRequest {

	private Integer clientId;
	private Integer cardId;
	private float loanSum;
	private Integer deadline;
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

	public float getLoanSum() {
		return loanSum;
	}

	public void setLoanSum(float loanSum) {
		this.loanSum = loanSum;
	}

	public Integer getDeadline() {
		return deadline;
	}

	public void setDeadline(Integer deadline) {
		this.deadline = deadline;
	}

	public String getTransactionPassword() {
		return transactionPassword;
	}

	public void setTransactionPassword(String transactionPassword) {
		this.transactionPassword = transactionPassword;
	}

}
