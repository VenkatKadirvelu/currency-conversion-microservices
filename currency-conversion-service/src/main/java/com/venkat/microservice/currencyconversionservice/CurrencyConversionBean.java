package com.venkat.microservice.currencyconversionservice;

import java.math.BigDecimal;

public class CurrencyConversionBean {

	private Long Id;
	private String from;
	private String to;
	private BigDecimal conversionRate;
	private BigDecimal quantity;
	private BigDecimal convertedAmount;
	private int port;
	
	public CurrencyConversionBean() {

	}
	
	public CurrencyConversionBean(Long id, String fromCurrency, String toCurrency, BigDecimal conversionRate,
			BigDecimal quantity, BigDecimal convertedAmount, int port) {
		super();
		Id = id;
		this.from = fromCurrency;
		this.to = toCurrency;
		this.conversionRate = conversionRate;
		this.quantity = quantity;
		this.convertedAmount = convertedAmount;
		this.port = port;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getFromCurrency() {
		return from;
	}

	public void setFromCurrency(String fromCurrency) {
		this.from = fromCurrency;
	}

	public String getToCurrency() {
		return to;
	}

	public void setToCurrency(String toCurrency) {
		this.to = toCurrency;
	}

	public BigDecimal getConversionRate() {
		return conversionRate;
	}

	public void setConversionRate(BigDecimal conversionRate) {
		this.conversionRate = conversionRate;
	}

	public BigDecimal getQuantity() {
		return quantity;
	}

	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getConvertedAmount() {
		return convertedAmount;
	}

	public void setConvertedAmount(BigDecimal convertedAmount) {
		this.convertedAmount = convertedAmount;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}
	
	
	
	
}
