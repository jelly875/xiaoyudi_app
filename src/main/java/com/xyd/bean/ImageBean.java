package com.xyd.bean;

import java.io.Serializable;

public class ImageBean implements Serializable {

	private static final long serialVersionUID = 6178696921009855704L;

	private Integer id;
	private String path;
	private String name;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
