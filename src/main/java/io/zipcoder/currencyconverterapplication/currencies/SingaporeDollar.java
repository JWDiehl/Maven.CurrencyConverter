package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class SingaporeDollar implements ConvertableCurrency {

    @Override
    public Double convert(CurrencyType currencyType) {
        if (currencyType == CurrencyType.SINGAPORE_DOLLAR) {
            return 1.0;
        }

        return currencyType.getRate() / CurrencyType.SINGAPORE_DOLLAR.getRate();
    }

    @Override
    public CurrencyType getCurrencyType() {
        return CurrencyType.SINGAPORE_DOLLAR;
    }
}