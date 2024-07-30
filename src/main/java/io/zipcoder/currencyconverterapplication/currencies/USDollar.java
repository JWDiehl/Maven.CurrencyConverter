package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class USDollar implements ConvertableCurrency {

    @Override
    public Double convert(CurrencyType currencyType) {
        if (currencyType == CurrencyType.US_DOLLAR) {
            return 1.0;
        }

        return currencyType.getRate() / CurrencyType.US_DOLLAR.getRate();
    }

    @Override
    public CurrencyType getCurrencyType() {
        return CurrencyType.US_DOLLAR;
    }
}
