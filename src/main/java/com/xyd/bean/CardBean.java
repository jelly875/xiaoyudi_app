package com.xyd.bean;

import java.io.Serializable;

public class CardBean implements Serializable {

	private static final long serialVersionUID = 7974296463253701121L;

	private Integer id;
	private String cardNumber;
	private String bankName;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

}
