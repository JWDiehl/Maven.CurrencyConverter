package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

import java.util.Currency;

public class Ringgit implements ConvertableCurrency {

    @Override
    public Double convert(CurrencyType currencyType) {
        if (currencyType == CurrencyType.RINGGIT) {
            return 1.0;
        }

        return currencyType.getRate() / CurrencyType.RINGGIT.getRate();
    }

    @Override
    public CurrencyType getCurrencyType() {
        return CurrencyType.RINGGIT;
    }
}
