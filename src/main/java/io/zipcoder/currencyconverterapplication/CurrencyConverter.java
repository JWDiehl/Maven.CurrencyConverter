package io.zipcoder.currencyconverterapplication;

import io.zipcoder.currencyconverterapplication.currencies.AustralianDollar;

import static java.text.NumberFormat.getCurrencyInstance;

public class CurrencyConverter {
    public static Double convert(Double amountOfBaseCurrency, ConvertableCurrency sourceCurrencyType, CurrencyType targetCurrencyType) {

        return sourceCurrencyType.convert(targetCurrencyType) * amountOfBaseCurrency;


        }
    }
