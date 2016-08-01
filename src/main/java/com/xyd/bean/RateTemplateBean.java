package com.xyd.bean;

import java.io.Serializable;

public class RateTemplateBean implements Serializable {

	private static final long serialVersionUID = 3010433055957127733L;

	private Integer id;
	private float interestRate;
	private float serviceRate;
	private float overdueRate;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public float getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(float interestRate) {
		this.interestRate = interestRate;
	}

	public float getServiceRate() {
		return serviceRate;
	}

	public void setServiceRate(float serviceRate) {
		this.serviceRate = serviceRate;
	}

	public float getOverdueRate() {
		return overdueRate;
	}

	public void setOverdueRate(float overdueRate) {
		this.overdueRate = overdueRate;
	}

}
