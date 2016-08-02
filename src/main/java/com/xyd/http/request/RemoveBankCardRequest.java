package com.xyd.http.request;

public class RemoveBankCardRequest extends AbstractRequest{

	private Integer cardId;

	public Integer getCardId() {
		return cardId;
	}

	public void setCardId(Integer cardId) {
		this.cardId = cardId;
	}
}
