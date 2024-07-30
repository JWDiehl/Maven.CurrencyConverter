package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class USDollar implements ConvertableCurrency {
    @Override
    public double getExchangeRate() {
        return CurrencyType.US_DOLLAR.getRate();
    }

    @Override
    public double convert(double amount, ConvertableCurrency toCurrency) {
        double amountInUniversal = amount / this.getExchangeRate(); //Convert to universal currency
        return amountInUniversal * toCurrency.getExchangeRate(); //Convert from universal currency to target currency
    }

    @Override
    public CurrencyType getCurrencyType() {
        return CurrencyType.US_DOLLAR;
    }
}
