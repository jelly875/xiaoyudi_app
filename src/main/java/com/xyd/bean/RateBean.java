package com.xyd.bean;

import java.io.Serializable;

public class RateBean implements Serializable{

	private static final long serialVersionUID = 5171540032219118656L;
	private Integer id;
	private float currInterestRate;
	private float currServiceRate;
	private float currOverdueRate;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public float getCurrInterestRate() {
		return currInterestRate;
	}

	public void setCurrInterestRate(float currInterestRate) {
		this.currInterestRate = currInterestRate;
	}

	public float getCurrServiceRate() {
		return currServiceRate;
	}

	public void setCurrServiceRate(float currServiceRate) {
		this.currServiceRate = currServiceRate;
	}

	public float getCurrOverdueRate() {
		return currOverdueRate;
	}

	public void setCurrOverdueRate(float currOverdueRate) {
		this.currOverdueRate = currOverdueRate;
	}

}
