package com.venkat.microservice.currencyexchangeservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyExchangeController {

	@Autowired
	private Environment environment;

	@Autowired
	private ExchangeRateRepository repository;

	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public ExchangeRate retrieveExchangeRate(@PathVariable String from, @PathVariable String to) {
		ExchangeRate exchangeRate = repository.findByfromCurrencyAndToCurrency(from, to);
		exchangeRate.setPort(Integer.parseInt(environment.getProperty("local.server.port")));
		return exchangeRate;
	}

}
