package com.xyd.bean;

import java.io.Serializable;
import java.util.Date;

public class RepaymentBean implements Serializable {

	private static final long serialVersionUID = 7410011027005927834L;

	private Integer id;
	private LoanBean loan;
	private CardBean card;
	private Date actualRepayDate;
	private float actualRepayment;
	private Integer status;
	private String memo;
	private Integer overdue;
	private float lateFees;
	private ClientBean client;
	private Integer type;
	
	private Integer overdueStatus;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LoanBean getLoan() {
		return loan;
	}

	public void setLoan(LoanBean loan) {
		this.loan = loan;
	}

	public CardBean getCard() {
		return card;
	}

	public void setCard(CardBean card) {
		this.card = card;
	}

	public Date getActualRepayDate() {
		return actualRepayDate;
	}

	public void setActualRepayDate(Date actualRepayDate) {
		this.actualRepayDate = actualRepayDate;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public Integer getOverdue() {
		return overdue;
	}

	public void setOverdue(Integer overdue) {
		this.overdue = overdue;
	}

	public ClientBean getClient() {
		return client;
	}

	public void setClient(ClientBean client) {
		this.client = client;
	}

	public float getLateFees() {
		return lateFees;
	}

	public void setLateFees(float lateFees) {
		this.lateFees = lateFees;
	}

	public float getActualRepayment() {
		return actualRepayment;
	}

	public void setActualRepayment(float actualRepayment) {
		this.actualRepayment = actualRepayment;
	}

	public Integer getOverdueStatus() {
		return overdueStatus;
	}

	public void setOverdueStatus(Integer overdueStatus) {
		this.overdueStatus = overdueStatus;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

}
