package com.arrow.trade.util;

import lombok.ToString;

@ToString
public enum ContextDataEnumStatus {

	OPEN("Open"), CLOSED("Closed");

	private String string;

	private ContextDataEnumStatus(String string) {
		this.string = string;
	}

}
