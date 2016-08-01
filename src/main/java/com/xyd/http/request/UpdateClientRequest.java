package com.xyd.http.request;

import com.xyd.bean.ClientBean;

public class UpdateClientRequest extends AbstractRequest{

	private ClientBean clientBean;

	public ClientBean getClientBean() {
		return clientBean;
	}

	public void setClientBean(ClientBean clientBean) {
		this.clientBean = clientBean;
	}
	
}
