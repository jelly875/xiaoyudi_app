package com.xyd.http.response;

public abstract class AbstractResponse {
	private Integer returnCode = 0;

	public Integer getReturnCode() {
		return returnCode;
	}

	public void setReturnCode(Integer returnCode) {
		this.returnCode = returnCode;
	}

	
}
