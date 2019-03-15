package com.venkat.microservice.currencyexchangeservice;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ExchangeRate {

	@Id
	private Long id;
	private String fromCurrency;
	private String toCurrency;
	private BigDecimal conversionRate;
	private int port;

	public ExchangeRate() {

	}

	public ExchangeRate(Long id, String from, String to, BigDecimal conversionRate) {
		super();
		this.id = id;
		this.fromCurrency = from;
		this.toCurrency = to;
		this.conversionRate = conversionRate;
	}

	public Long getId() {
		return id;
	}

	public String getFrom() {
		return fromCurrency;
	}

	public String getTo() {
		return toCurrency;
	}

	public BigDecimal getConversionRate() {
		return conversionRate;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

}
