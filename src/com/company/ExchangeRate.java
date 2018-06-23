package com.company;


public class ExchangeRate {

    private String baseCurrency;

    private String currency;
    private Double saleRateNB;
    private Double purchaseRateNB;
    private Double saleRate;
    private Double purchaseRate;

    public String getBaseCurrency() {
        return baseCurrency;
    }

    public void setBaseCurrency(String baseCurrency) {
        this.baseCurrency = baseCurrency;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Double getSaleRateNB() {
        return saleRateNB;
    }

    public void setSaleRateNB(Double saleRateNB) {
        this.saleRateNB = saleRateNB;
    }

    public Double getPurchaseRateNB() {
        return purchaseRateNB;
    }

    public void setPurchaseRateNB(Double purchaseRateNB) {
        this.purchaseRateNB = purchaseRateNB;
    }

    public Double getSaleRate() {
        return saleRate;
    }

    public void setSaleRate(Double saleRate) {
        this.saleRate = saleRate;
    }

    public Double getPurchaseRate() {
        return purchaseRate;
    }

    public void setPurchaseRate(Double purchaseRate) {
        this.purchaseRate = purchaseRate;
    }

    @Override
    public String toString() {
        return "ExchangeRate{" +
                "baseCurrency='" + baseCurrency + '\'' +
                ", currency='" + currency + '\'' +
                ", saleRateNB=" + saleRateNB +
                ", purchaseRateNB=" + purchaseRateNB +
                ", saleRate=" + saleRate +
                ", purchaseRate=" + purchaseRate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ExchangeRate that = (ExchangeRate) o;

        if (baseCurrency != null ? !baseCurrency.equals(that.baseCurrency) : that.baseCurrency != null) return false;
        if (currency != null ? !currency.equals(that.currency) : that.currency != null) return false;
        if (saleRateNB != null ? !saleRateNB.equals(that.saleRateNB) : that.saleRateNB != null) return false;
        if (purchaseRateNB != null ? !purchaseRateNB.equals(that.purchaseRateNB) : that.purchaseRateNB != null)
            return false;
        if (saleRate != null ? !saleRate.equals(that.saleRate) : that.saleRate != null) return false;
        return purchaseRate != null ? purchaseRate.equals(that.purchaseRate) : that.purchaseRate == null;
    }

    @Override
    public int hashCode() {
        int result = baseCurrency != null ? baseCurrency.hashCode() : 0;
        result = 31 * result + (currency != null ? currency.hashCode() : 0);
        result = 31 * result + (saleRateNB != null ? saleRateNB.hashCode() : 0);
        result = 31 * result + (purchaseRateNB != null ? purchaseRateNB.hashCode() : 0);
        result = 31 * result + (saleRate != null ? saleRate.hashCode() : 0);
        result = 31 * result + (purchaseRate != null ? purchaseRate.hashCode() : 0);
        return result;
    }
}