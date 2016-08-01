package com.xyd.http.response;

import java.io.Serializable;

import com.xyd.api.Constants;

public class ResponseBean implements Serializable{

	private static final long serialVersionUID = -4586383340146682904L;
	private Integer rc;
	private Object content;
	
	public ResponseBean(){}
	
	public ResponseBean(Integer rc,Object content){
		this.rc = rc;
		this.content = content;
	}
	
	public ResponseBean(Integer rc) {
		this.rc = rc;
		this.content = null;
	}
	
	public ResponseBean(Object content) {
		this.rc = Constants.SUCCESS_CODE;
		this.content = content;
	}
	
	public Integer getRc() {
		return rc;
	}
	public void setRc(Integer rc) {
		this.rc = rc;
	}
	public Object getContent() {
		return content;
	}
	public void setContent(Object content) {
		this.content = content;
	}
	
	
}
