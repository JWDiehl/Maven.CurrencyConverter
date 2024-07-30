package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class SingaporeDollar implements ConvertableCurrency {
    @Override
    public double getExchangeRate() {
        return CurrencyType.SINGAPORE_DOLLAR.getRate();
    }

    @Override
    public double convert(double amount, ConvertableCurrency toCurrency) {
        return amount * (toCurrency.getExchangeRate() / this.getExchangeRate());
    }

    @Override
    public CurrencyType getCurrencyType() {
        return CurrencyType.SINGAPORE_DOLLAR;
    }
}
