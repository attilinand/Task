package com.sgcib.input.trade.repo.exceptions;

import org.springframework.web.bind.annotation.ResponseStatus;
/**
 * 
 * @author Nanda
 *
 */
@ResponseStatus(org.springframework.http.HttpStatus.NOT_FOUND)
public class TradeInputServiceException extends Exception {
	
	private static final long serialVersionUID = 1L;

	public TradeInputServiceException(String accountNumber) {
		super("No such account: " + accountNumber);
	}
	
}
