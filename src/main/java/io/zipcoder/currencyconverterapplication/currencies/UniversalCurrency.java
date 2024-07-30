package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class UniversalCurrency implements ConvertableCurrency {

    @Override
    public Double convert(CurrencyType currencyType) {
        if (currencyType == CurrencyType.UNIVERSAL_CURRENCY) {
            return 1.0;
        }

        return currencyType.getRate() / CurrencyType.UNIVERSAL_CURRENCY.getRate();
    }

    @Override
    public CurrencyType getCurrencyType() {
        return CurrencyType.UNIVERSAL_CURRENCY;
    }
}