package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class Pound implements ConvertableCurrency {

    @Override
    public Double convert(CurrencyType currencyType) {
        if (currencyType == CurrencyType.POUND) {
            return 1.0;
        }

        return currencyType.getRate() / CurrencyType.POUND.getRate();
    }

    @Override
    public CurrencyType getCurrencyType() {
        return CurrencyType.POUND;
    }
}