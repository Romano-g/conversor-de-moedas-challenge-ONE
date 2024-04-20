package models;

import java.text.DecimalFormat;

public class CurrencyClass {
	private String currentCurrency;
	private Double valueInArs;
	private Double valueInBob;
	private Double valueInBrl;
	private Double valueInClp;
	private Double valueInCop;
	private Double valueInUsd;

	DecimalFormat df = new DecimalFormat("#,##0.00");


	public CurrencyClass(Currency currency) {
		this.currentCurrency = currency.baseCode();
		this.valueInArs = currency.conversionRates().get("ARS");
		this.valueInBob = currency.conversionRates().get("BOB");
		this.valueInBrl = currency.conversionRates().get("BRL");
		this.valueInClp = currency.conversionRates().get("CLP");
		this.valueInCop = currency.conversionRates().get("COP");
		this.valueInUsd = currency.conversionRates().get("USD");
	}

	public Double getValueInArs() {
		return valueInArs;
	}

	public Double getValueInBob() {
		return valueInBob;
	}

	public Double getValueInBrl() {
		return valueInBrl;
	}

	public Double getValueInClp() {
		return valueInClp;
	}

	public Double getValueInCop() {
		return valueInCop;
	}

	public Double getValueInUsd() {
		return valueInUsd;
	}

	@Override
	public String toString() {
		return "\nMoeda base: " + currentCurrency +
				"\n------------------------------------------------------------" +
				"\nValor em Pesos Argentinos: " + df.format(valueInArs) +
				"\nValor em Bolivianos: " + df.format(valueInBob) +
				"\nValor em Reais: " + df.format(valueInBrl) +
				"\nValor em Pesos Chilenos: " + df.format(valueInClp) +
				"\nValor em Pesos Colombianos: " + df.format(valueInCop) +
				"\nValor em Dólares: " + df.format(valueInUsd) +
				"\n------------------------------------------------------------";
	}
}
