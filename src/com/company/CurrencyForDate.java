package com.company;

import java.util.ArrayList;

class CurrencyForDate {
    String bank;
    String baseCurrency;
    String baseCurrencyLit;
    String date;
    ArrayList<ExchangeRate> exchangeRates = new ArrayList<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CurrencyForDate that = (CurrencyForDate) o;

        if (bank != null ? !bank.equals(that.bank) : that.bank != null) return false;
        if (baseCurrency != null ? !baseCurrency.equals(that.baseCurrency) : that.baseCurrency != null) return false;
        if (baseCurrencyLit != null ? !baseCurrencyLit.equals(that.baseCurrencyLit) : that.baseCurrencyLit != null)
            return false;
        if (date != null ? !date.equals(that.date) : that.date != null) return false;
        return exchangeRates != null ? exchangeRates.equals(that.exchangeRates) : that.exchangeRates == null;
    }

    @Override
    public int hashCode() {
        int result = bank != null ? bank.hashCode() : 0;
        result = 31 * result + (baseCurrency != null ? baseCurrency.hashCode() : 0);
        result = 31 * result + (baseCurrencyLit != null ? baseCurrencyLit.hashCode() : 0);
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (exchangeRates != null ? exchangeRates.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "CurrencyForDate{" +
                "bank='" + bank + '\'' +
                ", baseCurrency='" + baseCurrency + '\'' +
                ", baseCurrencyLit='" + baseCurrencyLit + '\'' +
                ", date='" + date + '\'' +
                ", exchangeRates=" + exchangeRates +
                '}';
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public void setBaseCurrency(String baseCurrency) {
        this.baseCurrency = baseCurrency;
    }

    public void setBaseCurrencyLit(String baseCurrencyLit) {
        this.baseCurrencyLit = baseCurrencyLit;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setExchangeRates(ArrayList<ExchangeRate> exchangeRates) {
        this.exchangeRates = exchangeRates;
    }

    public String getBank() {

        return bank;
    }

    public String getBaseCurrency() {
        return baseCurrency;
    }

    public String getBaseCurrencyLit() {
        return baseCurrencyLit;
    }

    public String getDate() {
        return date;
    }

    public ArrayList<ExchangeRate> getExchangeRates() {
        return exchangeRates;
    }

}

class ExchangeRate {
    String baseCurrency;
    String currency;
    double purchaseRate;
    double purchaseRateNB;
    double saleRate;
    double saleRateNB;

    @Override
    public String toString() {
        return "exchangeRate{" +
                "baseCurrency='" + baseCurrency + '\'' +
                ", currency='" + currency + '\'' +
                ", purchaseRate=" + purchaseRate +
                ", purchaseRateNB=" + purchaseRateNB +
                ", saleRate=" + saleRate +
                ", saleRateNB=" + saleRateNB +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ExchangeRate that = (ExchangeRate) o;

        if (Double.compare(that.purchaseRate, purchaseRate) != 0) return false;
        if (Double.compare(that.purchaseRateNB, purchaseRateNB) != 0) return false;
        if (Double.compare(that.saleRate, saleRate) != 0) return false;
        if (Double.compare(that.saleRateNB, saleRateNB) != 0) return false;
        if (baseCurrency != null ? !baseCurrency.equals(that.baseCurrency) : that.baseCurrency != null) return false;
        return currency != null ? currency.equals(that.currency) : that.currency == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = baseCurrency != null ? baseCurrency.hashCode() : 0;
        result = 31 * result + (currency != null ? currency.hashCode() : 0);
        temp = Double.doubleToLongBits(purchaseRate);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(purchaseRateNB);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(saleRate);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(saleRateNB);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    public void setBaseCurrency(String baseCurrency) {

        this.baseCurrency = baseCurrency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void setPurchaseRate(double purchaseRate) {
        this.purchaseRate = purchaseRate;
    }

    public void setPurchaseRateNB(double purchaseRateNB) {
        this.purchaseRateNB = purchaseRateNB;
    }

    public void setSaleRate(double saleRate) {
        this.saleRate = saleRate;
    }

    public void setSaleRateNB(double saleRateNB) {
        this.saleRateNB = saleRateNB;
    }

    public String getBaseCurrency() {

        return baseCurrency;
    }

    public String getCurrency() {
        return currency;
    }

    public double getPurchaseRate() {
        return purchaseRate;
    }

    public double getPurchaseRateNB() {
        return purchaseRateNB;
    }

    public double getSaleRate() {
        return saleRate;
    }

    public double getSaleRateNB() {
        return saleRateNB;
    }
}


