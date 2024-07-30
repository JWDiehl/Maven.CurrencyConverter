package io.zipcoder.currencyconverterapplication;

import io.zipcoder.currencyconverterapplication.currencies.*;

import java.util.HashMap;
import java.util.Map;

public enum CurrencyType implements ConvertableCurrency {
    AUSTRALIAN_DOLLAR(2.70),
    CANADIAN_DOLLAR(2.64),
    CHINESE_YR(13.84),
    EURO(1.88),
    FRANC(2.02),
    POUND(1.64),
    RINGGIT(8.94),
    RUPEE(136.64),
    SINGAPORE_DOLLAR(1.86),
    US_DOLLAR(2.0),
    UNIVERSAL_CURRENCY(1.0),
    YEN(231.68);

    private final double rate;

    CurrencyType(double rate) {
        this.rate = rate;
    }

    public Double getRate() {
        return rate;
    }

    static final Map<ConvertableCurrency,CurrencyType> convert = new HashMap<>();


    static {
        convert.put(new AustralianDollar(), AUSTRALIAN_DOLLAR);
        convert.put(new CanadianDollar(), CANADIAN_DOLLAR);
        convert.put(new ChineseYR(), CHINESE_YR);
        convert.put(new Euro(), EURO);
        convert.put(new Franc(), FRANC);
        convert.put(new Pound(),POUND);
        convert.put(new Ringgit(),RINGGIT);
        convert.put(new Rupee(),RUPEE);
        convert.put(new SingaporeDollar(),SINGAPORE_DOLLAR);
        convert.put(new USDollar(),US_DOLLAR);
        convert.put(new UniversalCurrency(),UNIVERSAL_CURRENCY);
        convert.put(new Yen(),YEN);


    }


    public static CurrencyType getTypeOfCurrency(ConvertableCurrency currency) {

        return convert.get(currency);
    }

    @Override
    public CurrencyType getCurrencyType() {
        return null;
    }
}
