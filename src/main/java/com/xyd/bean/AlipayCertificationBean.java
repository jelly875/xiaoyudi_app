package com.xyd.bean;

import java.io.Serializable;

public class AlipayCertificationBean implements Serializable{

	private static final long serialVersionUID = -8356416808409881621L;
	private Integer id;
	private Integer certificationStatus;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCertificationStatus() {
		return certificationStatus;
	}

	public void setCertificationStatus(Integer certificationStatus) {
		this.certificationStatus = certificationStatus;
	}

}
