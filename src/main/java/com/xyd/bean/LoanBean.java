package com.xyd.bean;

import java.io.Serializable;
import java.util.Date;

public class LoanBean implements Serializable {

	private static final long serialVersionUID = -200970173473703611L;

	private Integer id;
	private float loanSum;
	private float actualSum;
	private Integer deadline;
	private Date createDate;
	private Date finalRepayDate;
	private Integer status;
	private ClientBean client;
	private CardBean card;
	private float serviceFee;
	private float interestFee;
	private RateBean rate;
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getDeadline() {
		return deadline;
	}

	public void setDeadline(Integer deadline) {
		this.deadline = deadline;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getFinalRepayDate() {
		return finalRepayDate;
	}

	public void setFinalRepayDate(Date finalRepayDate) {
		this.finalRepayDate = finalRepayDate;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public ClientBean getClient() {
		return client;
	}

	public void setClient(ClientBean client) {
		this.client = client;
	}

	public CardBean getCard() {
		return card;
	}

	public void setCard(CardBean card) {
		this.card = card;
	}

	public float getLoanSum() {
		return loanSum;
	}

	public void setLoanSum(float loanSum) {
		this.loanSum = loanSum;
	}

	public float getActualSum() {
		return actualSum;
	}

	public void setActualSum(float actualSum) {
		this.actualSum = actualSum;
	}

	public float getServiceFee() {
		return serviceFee;
	}

	public void setServiceFee(float serviceFee) {
		this.serviceFee = serviceFee;
	}

	public float getInterestFee() {
		return interestFee;
	}

	public void setInterestFee(float interestFee) {
		this.interestFee = interestFee;
	}

	public RateBean getRate() {
		return rate;
	}

	public void setRate(RateBean rate) {
		this.rate = rate;
	}

	
}
