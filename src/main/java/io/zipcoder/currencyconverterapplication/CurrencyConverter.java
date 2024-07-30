package io.zipcoder.currencyconverterapplication;

import io.zipcoder.currencyconverterapplication.currencies.*;

import static java.text.NumberFormat.getCurrencyInstance;

public class CurrencyConverter {
    public static Double convert(Double amount, ConvertableCurrency fromCurrency, CurrencyType toCurrencyType) {

        ConvertableCurrency toCurrency = getCurrencyInstance(toCurrencyType);
        return fromCurrency.convert(amount, toCurrency);
    }

    private static ConvertableCurrency getCurrencyInstance(CurrencyType currencyType) {
        switch (currencyType) {
            case AUSTRALIAN_DOLLAR:
                return new AustralianDollar();
            case CANADIAN_DOLLAR:
                return new CanadianDollar();
            case CHINESE_YR:
                return new ChineseYR();
            case EURO:
                return new Euro();
            case FRANC:
                return new Franc();
            case POUND:
                return new Pound();
            case RINGGIT:
                return new Ringgit();
            case RUPEE:
                return new Rupee();
            case SINGAPORE_DOLLAR:
                return new SingaporeDollar();
            case UNIVERSAL_CURRENCY:
                return new UniversalCurrency();
            case US_DOLLAR:
                return new USDollar();
            case YEN:
                return new Yen();
            default:
                throw new IllegalArgumentException("Unkown currency type: " + currencyType);

        }
    }
}
