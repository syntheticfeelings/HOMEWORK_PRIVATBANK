package com.company;

public class Currency {
    String ccy;
    String base_ccy;
    double buy;
    double sale;

    public void setCcy(String ccy) {
        this.ccy = ccy;
    }

    @Override
    public String toString() {
        return "Currency{" +
                "ccy='" + ccy + '\'' +
                ", base_ccy='" + base_ccy + '\'' +
                ", buy=" + buy +
                ", sale=" + sale +
                '}';
    }

    public void setBase_ccy(String base_ccy) {
        this.base_ccy = base_ccy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Currency currency = (Currency) o;

        if (Double.compare(currency.buy, buy) != 0) return false;
        if (Double.compare(currency.sale, sale) != 0) return false;
        if (!ccy.equals(currency.ccy)) return false;
        return base_ccy.equals(currency.base_ccy);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = ccy.hashCode();
        result = 31 * result + base_ccy.hashCode();
        temp = Double.doubleToLongBits(buy);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(sale);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    public void setBuy(double buy) {
        this.buy = buy;
    }

    public void setSale(double sale) {
        this.sale = sale;
    }

    public String getCcy() {

        return ccy;
    }

    public String getBase_ccy() {
        return base_ccy;
    }

    public double getBuy() {
        return buy;
    }

    public double getSale() {
        return sale;
    }

    public Currency() {

    }

}