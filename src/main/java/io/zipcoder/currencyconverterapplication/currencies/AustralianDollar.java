package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class AustralianDollar implements ConvertableCurrency {

    //Returns the exchange rate of Australian Dollar to the Universal Currency
    @Override
    public double getExchangeRate() {
        return CurrencyType.AUSTRALIAN_DOLLAR.getRate();
    }

    //Converts the amount from Australian Dollar to the target currency
    @Override
    public double convert(double amount, ConvertableCurrency toCurrency) {
        return amount * (toCurrency.getExchangeRate() / this.getExchangeRate());
    }

    @Override
    public CurrencyType getCurrencyType() {
        return CurrencyType.AUSTRALIAN_DOLLAR;
    }
}
