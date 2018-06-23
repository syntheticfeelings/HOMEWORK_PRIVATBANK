package com.company;


import com.google.gson.Gson;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите дату : ДД.ММ.ГГГГ");
        String date = sc.nextLine();
        String url = "https://api.privatbank.ua/p24api/exchange_rates?json&date=";
        StringBuilder sb = new StringBuilder(url);
        sb.append(date);
        String result = HttpUtil.sendRequest(sb.toString(), null, null);
        Gson gson = new Gson();
        CurrencyForDate currencyForDate = gson.fromJson(result, CurrencyForDate.class);

        try {
            System.out.println(currencyForDate.getExchangeRate().get(15));
        } catch (Exception e) {
            System.out.println("Введите дату в правильном формате");
        }

    }
}
