package io.zipcoder.currencyconverterapplication;

public interface ConvertableCurrency {
    default Double convert(CurrencyType currencyType) {
        return Double.MAX_VALUE;
    }

    double getExchangeRate();

    //Method to convert an amount from this currency to another currency
    double convert(double amount, ConvertableCurrency toCurrency);
    CurrencyType getCurrencyType();
}
