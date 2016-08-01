package com.xyd.http.request;

public class UpdateLoginPasswordRequest extends AbstractRequest {

	private Integer clientId;
	private String oldLoginPassword;
	private String newLoginPassword;

	public Integer getClientId() {
		return clientId;
	}

	public void setClientId(Integer clientId) {
		this.clientId = clientId;
	}

	public String getOldLoginPassword() {
		return oldLoginPassword;
	}

	public void setOldLoginPassword(String oldLoginPassword) {
		this.oldLoginPassword = oldLoginPassword;
	}

	public String getNewLoginPassword() {
		return newLoginPassword;
	}

	public void setNewLoginPassword(String newLoginPassword) {
		this.newLoginPassword = newLoginPassword;
	}

}
