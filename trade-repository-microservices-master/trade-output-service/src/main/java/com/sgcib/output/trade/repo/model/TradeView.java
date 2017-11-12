package com.sgcib.output.trade.repo.model;

import java.math.BigDecimal;
/**
 * Class which will hold the needed information for the backoffice to view
 * @author Nanda
 *
 */
public class TradeView {
	
	private TradeDetails tradeDetails;	
	private BigDecimal exposure;	
	private String counterParty;
	private String settlementMode;
	private BigDecimal profit;	
	private BigDecimal loss;
	
	public TradeDetails getTradeDetails() {
		return tradeDetails;
	}
	public void setTradeDetails(TradeDetails tradeDetails) {
		this.tradeDetails = tradeDetails;
	}
	public BigDecimal getExposure() {
		return exposure;
	}
	public void setExposure(BigDecimal exposure) {
		this.exposure = exposure;
	}
	public String getCounterParty() {
		return counterParty;
	}
	public void setCounterParty(String counterParty) {
		this.counterParty = counterParty;
	}
	public String getSettlementMode() {
		return settlementMode;
	}
	public void setSettlementMode(String settlementMode) {
		this.settlementMode = settlementMode;
	}
	public BigDecimal getProfit() {
		return profit;
	}
	public void setProfit(BigDecimal profit) {
		this.profit = profit;
	}
	public BigDecimal getLoss() {
		return loss;
	}
	public void setLoss(BigDecimal loss) {
		this.loss = loss;
	}
	
	

}
