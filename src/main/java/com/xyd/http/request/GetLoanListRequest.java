package com.xyd.http.request;

public class GetLoanListRequest extends AbstractRequest{

	private Integer clientId;
	private Integer status;

	public Integer getClientId() {
		return clientId;
	}

	public void setClientId(Integer clientId) {
		this.clientId = clientId;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

}
