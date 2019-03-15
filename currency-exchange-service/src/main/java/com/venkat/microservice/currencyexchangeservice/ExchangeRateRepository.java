package com.venkat.microservice.currencyexchangeservice;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ExchangeRateRepository extends JpaRepository<ExchangeRate, Long>{
	ExchangeRate findByfromCurrencyAndToCurrency(String fromCurrency, String toCurrency);
}
