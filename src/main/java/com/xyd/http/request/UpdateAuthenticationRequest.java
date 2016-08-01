package com.xyd.http.request;

import com.xyd.bean.AuthenticationBean;

public class UpdateAuthenticationRequest extends AbstractRequest{

	private AuthenticationBean bean;

	public AuthenticationBean getBean() {
		return bean;
	}

	public void setBean(AuthenticationBean bean) {
		this.bean = bean;
	}
	
}
