package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class CanadianDollar implements ConvertableCurrency {

    @Override
    public Double convert(CurrencyType currencyType) {
        if (currencyType == CurrencyType.CANADIAN_DOLLAR) {
            return 1.0;
        }

        return currencyType.getRate() / CurrencyType.CANADIAN_DOLLAR.getRate();
    }

    @Override
    public CurrencyType getCurrencyType() {
        return CurrencyType.CANADIAN_DOLLAR;
    }
}