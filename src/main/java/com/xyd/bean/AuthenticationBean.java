package com.xyd.bean;

import java.io.Serializable;

public class AuthenticationBean implements Serializable {

	private static final long serialVersionUID = -4900873624515823819L;
	private Integer id;
	private String realName;
	private String idCard;
	private String email;
	private String degree;
	private boolean isMarried;
	private String gender;
	private String familyAddress;

	private String profession;
	private String salaryRange;
	private String companyName;
	private String companyProvince;
	private String companyCity;
	private String companyDetailAddress;
	private String companyPhone;

	private String firstContactsType;
	private String firstContactsName;
	private String firstContactsPhone;
	private String secondContactsType;
	private String secondContactsName;
	private String secondContactsPhone;
	private String thirdContactsType;
	private String thirdContactsName;
	private String thirdContactsPhone;
	private Integer certificationStatus;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
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

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public boolean isMarried() {
		return isMarried;
	}

	public void setMarried(boolean isMarried) {
		this.isMarried = isMarried;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getFamilyAddress() {
		return familyAddress;
	}

	public void setFamilyAddress(String familyAddress) {
		this.familyAddress = familyAddress;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public String getSalaryRange() {
		return salaryRange;
	}

	public void setSalaryRange(String salaryRange) {
		this.salaryRange = salaryRange;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyProvince() {
		return companyProvince;
	}

	public void setCompanyProvince(String companyProvince) {
		this.companyProvince = companyProvince;
	}

	public String getCompanyCity() {
		return companyCity;
	}

	public void setCompanyCity(String companyCity) {
		this.companyCity = companyCity;
	}

	public String getCompanyDetailAddress() {
		return companyDetailAddress;
	}

	public void setCompanyDetailAddress(String companyDetailAddress) {
		this.companyDetailAddress = companyDetailAddress;
	}

	public String getCompanyPhone() {
		return companyPhone;
	}

	public void setCompanyPhone(String companyPhone) {
		this.companyPhone = companyPhone;
	}

	public String getFirstContactsType() {
		return firstContactsType;
	}

	public void setFirstContactsType(String firstContactsType) {
		this.firstContactsType = firstContactsType;
	}

	public String getFirstContactsName() {
		return firstContactsName;
	}

	public void setFirstContactsName(String firstContactsName) {
		this.firstContactsName = firstContactsName;
	}

	public String getFirstContactsPhone() {
		return firstContactsPhone;
	}

	public void setFirstContactsPhone(String firstContactsPhone) {
		this.firstContactsPhone = firstContactsPhone;
	}

	public String getSecondContactsType() {
		return secondContactsType;
	}

	public void setSecondContactsType(String secondContactsType) {
		this.secondContactsType = secondContactsType;
	}

	public String getSecondContactsName() {
		return secondContactsName;
	}

	public void setSecondContactsName(String secondContactsName) {
		this.secondContactsName = secondContactsName;
	}

	public String getSecondContactsPhone() {
		return secondContactsPhone;
	}

	public void setSecondContactsPhone(String secondContactsPhone) {
		this.secondContactsPhone = secondContactsPhone;
	}

	public String getThirdContactsType() {
		return thirdContactsType;
	}

	public void setThirdContactsType(String thirdContactsType) {
		this.thirdContactsType = thirdContactsType;
	}

	public String getThirdContactsName() {
		return thirdContactsName;
	}

	public void setThirdContactsName(String thirdContactsName) {
		this.thirdContactsName = thirdContactsName;
	}

	public String getThirdContactsPhone() {
		return thirdContactsPhone;
	}

	public void setThirdContactsPhone(String thirdContactsPhone) {
		this.thirdContactsPhone = thirdContactsPhone;
	}

	public Integer getCertificationStatus() {
		return certificationStatus;
	}

	public void setCertificationStatus(Integer certificationStatus) {
		this.certificationStatus = certificationStatus;
	}

}
