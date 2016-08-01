package com.xyd.bean;

import java.io.Serializable;

public class VCodeBean implements Serializable {

	private static final long serialVersionUID = 3754132891654971676L;

	private Integer id;
	private String number;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

}
