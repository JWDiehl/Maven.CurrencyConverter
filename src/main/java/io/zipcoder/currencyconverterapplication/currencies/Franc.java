package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

import java.util.Currency;

public class Franc implements ConvertableCurrency {

    @Override
    public Double convert(CurrencyType currencyType) {
        if (currencyType == CurrencyType.FRANC) {
            return 1.0;
        }

        return currencyType.getRate() / CurrencyType.FRANC.getRate();
    }

    @Override
    public CurrencyType getCurrencyType() {
        return CurrencyType.FRANC;
    }
}
