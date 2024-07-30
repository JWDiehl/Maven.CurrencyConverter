package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

import java.util.Currency;

public class ChineseYR implements ConvertableCurrency {

    @Override
    public Double convert(CurrencyType currencyType) {
        if (currencyType == CurrencyType.CHINESE_YR) {
            return 1.0;
        }

        return currencyType.getRate() / CurrencyType.CHINESE_YR.getRate();
    }

    @Override
    public CurrencyType getCurrencyType() {
        return CurrencyType.CHINESE_YR;
    }
}