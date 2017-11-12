package com.sgcib.output.trade.repo.transformation.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgcib.output.trade.repo.feign.client.AccountClient;
import com.sgcib.output.trade.repo.model.TradeDetails;
import com.sgcib.output.trade.repo.model.TradeView;
/**
 *Class which will return the needed tradeView based on the format required 
 * @author Nanda
 *
 */
@Service
public class TradeFetchServiceImpl implements TradeFetchService {

	/**
	 * /**
	 * Method which will return the trade view which is the response needed from the back office with adequate details
	 * using feign client
	 * @param tradeId
	 * @param backOffice
	 * @param formatType
	 */
	@Override
	public TradeView fetchTradeUsingFeign(String tradeId,String backOffice, String formatType) {			
		TradeDetails tradeDetails= new TradeDetails();
		TradeView tradeView= new TradeView();
		tradeView.setTradeDetails(tradeDetails);
		if(formatType.equals("RISK")){
			tradeView.setExposure(BigDecimal.valueOf(15000));
			return tradeView;
		}else if(formatType.equals("P&L")){
			tradeView.setLoss(BigDecimal.valueOf(1000));
			tradeView.setProfit(BigDecimal.valueOf(2000));
			return tradeView;
		}else if(formatType.equals("VAR")){
			tradeView.setSettlementMode("SWI");
			tradeView.setProfit(BigDecimal.valueOf(2000));
			return tradeView;
		}
		return tradeView;
	}

	/**
	 * 
	 * Method which will return the trade view which is the response needed from the back office with adequate details
	 * from DB
	 * @param tradeId
	 * @param backOffice
	 * @param formatType
	 */
	@Override
	public TradeView fetchTradeFromDb(String tradeDetails, String backOffice, String formatType) {
		TradeDetails tradeDetailsFromDB= new TradeDetails();
		TradeView tradeView= new TradeView();
		tradeView.setTradeDetails(tradeDetailsFromDB);
		if(formatType.equals("RISK")){
			tradeView.setExposure(BigDecimal.valueOf(15000));
			return tradeView;
		}else if(formatType.equals("P&L")){
			tradeView.setLoss(BigDecimal.valueOf(1000));
			tradeView.setProfit(BigDecimal.valueOf(2000));
			return tradeView;
		}else if(formatType.equals("VAR")){
			tradeView.setSettlementMode("SWI");
			tradeView.setProfit(BigDecimal.valueOf(2000));
			return tradeView;
		}
		return tradeView;
	}
	
	

}
