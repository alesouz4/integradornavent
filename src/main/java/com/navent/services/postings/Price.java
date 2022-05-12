package com.navent.services.postings;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.navent.implementations.PriceImpl;

@JsonDeserialize(as = PriceImpl.class)
public abstract class Price {

    abstract public Double getValue();

    abstract public void setValue(Double value);

    abstract public Double getExpenses();

    abstract public void setExpenses(Double expenses);

    abstract public Double getPriceLowerPercentage();

    abstract public void setPriceLowerPercentage(Double priceLowerPercentage);
}

