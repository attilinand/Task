package com.sgcib.output.trade.repo.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sgcib.output.trade.repo.feign.client.AccountClient;
import com.sgcib.output.trade.repo.model.Account;
import com.sgcib.output.trade.repo.model.Customer;
import com.sgcib.output.trade.repo.model.CustomerType;
import com.sgcib.output.trade.repo.model.TradeView;
import com.sgcib.output.trade.repo.transformation.service.TradeFetchService;
/**
 * Controller class which has all the end points
 * @author Nanda
 *
 */
@RestController
public class TradeRepoOutputServiceController {
	
	@Autowired
	private AccountClient accountClient;
	
	@Autowired
	private TradeFetchService tradeFetchService;
	
	protected Logger logger = Logger.getLogger(TradeRepoOutputServiceController.class.getName());
	
	private List<Customer> customers;
	
	public TradeRepoOutputServiceController() {
		customers = new ArrayList<>();
		customers.add(new Customer(1, "12345", "Sachin tendulkar", CustomerType.INDIVIDUAL));
		customers.add(new Customer(2, "12346", "Roger Federer", CustomerType.INDIVIDUAL));
		customers.add(new Customer(3, "12347", "Albert Einstein", CustomerType.INDIVIDUAL));
		customers.add(new Customer(4, "12348", "Mohammad Ali", CustomerType.INDIVIDUAL));
	}
	
	
	@RequestMapping("/customers")
	public List<Customer> findAll() {
		logger.info("Customer.findAll()");
		return customers;
	}
	
	@RequestMapping("/customers/{id}")
	public Customer findById(@PathVariable("id") Integer id) {
		logger.info(String.format("Customer.findById(%s)", id));
		Customer customer = customers.stream().filter(it -> it.getId().intValue()==id.intValue()).findFirst().get();
		List<Account> accounts =  accountClient.getAccounts(id);
		customer.setAccounts(accounts);
		return customer;
	}
	
	@RequestMapping("/customers/get")
	public TradeView getTradeData() {
		logger.info("getTradeData");
		return tradeFetchService.fetchTradeFromDb(null, null, "RISK");
	}
	
}
