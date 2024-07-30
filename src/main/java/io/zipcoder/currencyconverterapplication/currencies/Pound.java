package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class Pound implements ConvertableCurrency {
    @Override
    public double getExchangeRate() {
        return CurrencyType.POUND.getRate();
    }

    @Override
    public double convert(double amount, ConvertableCurrency toCurrency) {
        return amount * (toCurrency.getExchangeRate() / this.getExchangeRate());
    }

    @Override
    public CurrencyType getCurrencyType() {
        return CurrencyType.POUND;
    }
}
