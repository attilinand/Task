package com.sgcib.output.trade.repo.exceptions;

import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(org.springframework.http.HttpStatus.NOT_FOUND)
public class TradeOutputServiceException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public TradeOutputServiceException(String pesel) {
		super("No such customer: " + pesel);
	}
	
}
