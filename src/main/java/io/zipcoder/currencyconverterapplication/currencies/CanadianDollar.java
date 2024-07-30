package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class CanadianDollar implements ConvertableCurrency {
    @Override
    public double getExchangeRate() {
        return CurrencyType.CANADIAN_DOLLAR.getRate();
    }

    @Override
    public double convert(double amount, ConvertableCurrency toCurrency) {
        return amount * (toCurrency.getExchangeRate() / this.getExchangeRate());
    }

    @Override
    public CurrencyType getCurrencyType() {
        return CurrencyType.CANADIAN_DOLLAR;
    }
}
