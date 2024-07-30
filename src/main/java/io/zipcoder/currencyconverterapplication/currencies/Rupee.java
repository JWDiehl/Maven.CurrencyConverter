package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class Rupee implements ConvertableCurrency {

    @Override
    public Double convert(CurrencyType currencyType) {
        if (currencyType == CurrencyType.RUPEE) {
            return 1.0;
        }

        return currencyType.getRate() / CurrencyType.RUPEE.getRate();
    }

    @Override
    public CurrencyType getCurrencyType() {
        return CurrencyType.RUPEE;
    }
}
