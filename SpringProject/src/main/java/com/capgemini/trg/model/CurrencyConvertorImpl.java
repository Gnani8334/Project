package com.capgemini.trg.model;

public class CurrencyConvertorImpl  implements CurrencyConvertor{
	private double exchangeRate;
	public CurrencyConvertorImpl()
	{
		
	}

	public double getExchangeRate() {
		return exchangeRate;
	}

	public void setExchangeRate(double exchangeRate) {
		this.exchangeRate = exchangeRate;
	}

	public CurrencyConvertorImpl(double exchangeRate) {
		super();
		this.exchangeRate = exchangeRate;
	}

	@Override
	public double dollarsToRupee(double dollars) {
		// TODO Auto-generated method stub
		return dollars*		this.exchangeRate;
	}

}
