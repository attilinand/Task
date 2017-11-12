package com.sgcib.output.trade.repo.transformation.service;

import com.sgcib.output.trade.repo.model.TradeView;

/**
 * 
 * @author Nanda
 *
 */
public interface TradeFetchService {
	
	/**
	 * Method which will get the Trade view based on the type and backoffice and format type using feign client 
	 * @param tradeId
	 * @param backOffice
	 * @param formatType
	 * @return
	 */
     TradeView fetchTradeUsingFeign(String tradeId, String backOffice,String formatType);	
     
     /**
 	 * Method which will get the Trade view based on the type and backoffice and format type from DB
 	 * @param tradeId
 	 * @param backOffice
 	 * @param formatType
 	 * @return
 	 */
      TradeView fetchTradeFromDb(String tradeId, String backOffice,String formatType);	

}
