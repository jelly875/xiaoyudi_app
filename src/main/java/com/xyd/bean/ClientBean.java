package com.xyd.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

public class ClientBean implements Serializable {

	private static final long serialVersionUID = -3850815798436344894L;

	private Integer id;
	private String realName;
	private String gender;
	private String idCard;
	private String email;
	private String companyAddress;
	private String familyAddress;
	private String phone;
	private String loginPassword;
	private BigDecimal creditLimit;
	private BigDecimal currentLimit;
	private RateTemplateBean rateTemplate;
	private List<CardBean> cardList;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getLoginPassword() {
		return loginPassword;
	}

	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}

	public BigDecimal getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(BigDecimal creditLimit) {
		this.creditLimit = creditLimit;
	}

	public BigDecimal getCurrentLimit() {
		return currentLimit;
	}

	public void setCurrentLimit(BigDecimal currentLimit) {
		this.currentLimit = currentLimit;
	}

	public RateTemplateBean getRateTemplate() {
		return rateTemplate;
	}

	public void setRateTemplate(RateTemplateBean rateTemplate) {
		this.rateTemplate = rateTemplate;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getIdCard() {
		return idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCompanyAddress() {
		return companyAddress;
	}

	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}

	public String getFamilyAddress() {
		return familyAddress;
	}

	public void setFamilyAddress(String familyAddress) {
		this.familyAddress = familyAddress;
	}

	public List<CardBean> getCardList() {
		return cardList;
	}

	public void setCardList(List<CardBean> cardList) {
		this.cardList = cardList;
	}

	


}
