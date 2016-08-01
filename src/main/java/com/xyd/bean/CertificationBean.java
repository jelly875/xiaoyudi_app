package com.xyd.bean;

import java.io.Serializable;

public class CertificationBean implements Serializable {

	private static final long serialVersionUID = -8509452585772665949L;
	private Integer id;
	private AlipayCertificationBean alipayCertification;
	private AuthenticationBean authentication;
	private PhoneCertificationBean phoneCertification;
	private SelfieCertificationBean selfieCertification;
	private ClientBean clientBean;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public AlipayCertificationBean getAlipayCertification() {
		return alipayCertification;
	}

	public void setAlipayCertification(AlipayCertificationBean alipayCertification) {
		this.alipayCertification = alipayCertification;
	}

	public AuthenticationBean getAuthentication() {
		return authentication;
	}

	public void setAuthentication(AuthenticationBean authentication) {
		this.authentication = authentication;
	}

	public PhoneCertificationBean getPhoneCertification() {
		return phoneCertification;
	}

	public void setPhoneCertification(PhoneCertificationBean phoneCertification) {
		this.phoneCertification = phoneCertification;
	}

	public SelfieCertificationBean getSelfieCertification() {
		return selfieCertification;
	}

	public void setSelfieCertification(SelfieCertificationBean selfieCertification) {
		this.selfieCertification = selfieCertification;
	}

	public ClientBean getClientBean() {
		return clientBean;
	}

	public void setClientBean(ClientBean clientBean) {
		this.clientBean = clientBean;
	}

}
