package com.main.babble.vo;

import lombok.Data;

@Data
public class InitialPageVO {

	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
