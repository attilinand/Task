package com.sgcib.input.trade.repo.controller;

import static org.mockito.MockitoAnnotations.initMocks;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.sgcib.input.trade.repo.TradeRepoInputServiceApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = TradeRepoInputServiceApplication.class)
@WebAppConfiguration
public class TradeInputServiceControllerTest {
	
	@InjectMocks
	private TradeRepoInputServiceController tradeInputServiceController;

	private MockMvc mockMvc;

	@Before
	public void setup() {
		initMocks(this);
		this.mockMvc = MockMvcBuilders.standaloneSetup(tradeInputServiceController).build();
	}

	@Test
	public void shouldSaveCurrentRecipientSettings() throws Exception {

		mockMvc.perform(get("/accounts/" + "1"))
		.andExpect(jsonPath("$.number").value("1"))
		.andExpect(status().isOk());
	}

}
