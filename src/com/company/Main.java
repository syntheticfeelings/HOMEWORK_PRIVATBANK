package com.company;


import com.google.gson.Gson;


public class Main {

    public static void main(String[] args) {
        String url = "https://api.privatbank.ua/p24api/exchange_rates?json&date=01.12.2014";
        String result = HttpUtil.sendRequest(url, null, null);
        Gson gson = new Gson();
        CurrencyForDate currencyForDate = gson.fromJson(result, CurrencyForDate.class);
        System.out.println(currencyForDate);
        System.out.println(currencyForDate.exchangeRates);
    }
}
