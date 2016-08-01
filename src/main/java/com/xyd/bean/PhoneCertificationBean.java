package com.xyd.bean;

import java.io.Serializable;

public class PhoneCertificationBean implements Serializable {

	private static final long serialVersionUID = -536068002817353085L;
	private Integer id;
	private String phone;
	private Integer certificationStatus;

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

	public Integer getCertificationStatus() {
		return certificationStatus;
	}

	public void setCertificationStatus(Integer certificationStatus) {
		this.certificationStatus = certificationStatus;
	}

}
