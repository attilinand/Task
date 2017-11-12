package com.sgcib.input.trade.repo.service;

import com.sgcib.input.trade.repo.model.TradeDetails;
/**
 * 
 * @author Nanda
 *
 */
public interface TradeInputService {
	
	/**
	 * 
	 * @param tradeDetails
	 */
	void saveTrade(TradeDetails tradeDetails);

}
