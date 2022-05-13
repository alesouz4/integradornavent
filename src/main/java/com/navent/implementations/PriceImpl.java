package com.navent.implementations;

import com.navent.services.postings.Price;

public class PriceImpl extends Price {

    private Double value;

    private Double expenses;

    private Double priceLowerPercentage;

    public PriceImpl() {
    }

    public PriceImpl(Double value, Double expenses, Double priceLowerPercentage) {
        this.value = value;
        this.expenses = expenses;
        this.priceLowerPercentage = priceLowerPercentage;
    }

    @Override
    public Double getValue() {

        return this.value;
    }

    @Override
    public void setValue(Double value) {

        this.value = value;
    }

    @Override
    public Double getExpenses() {

        return this.expenses;
    }

    @Override
    public void setExpenses(Double expenses) {

        this.expenses = expenses;
    }

    @Override
    public Double getPriceLowerPercentage() {

        return this.priceLowerPercentage;
    }

    @Override
    public void setPriceLowerPercentage(Double priceLowerPercentage) {
        this.priceLowerPercentage = priceLowerPercentage;
    }

    @Override
    public String toString() {
        return "{" +
                "value=" + value +
                ", expenses=" + expenses +
                ", priceLowerPercentage=" + priceLowerPercentage +
                '}';
    }
}


