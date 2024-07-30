package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

import java.util.Currency;

public class Franc implements ConvertableCurrency {
    @Override
    public double getExchangeRate() {
        return CurrencyType.FRANC.getRate();
    }

    @Override
    public double convert(double amount, ConvertableCurrency toCurrency) {
        return amount * (toCurrency.getExchangeRate() / this.getExchangeRate());
    }

    @Override
    public CurrencyType getCurrencyType() {
        return CurrencyType.FRANC;
    }
}
