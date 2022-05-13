package com.navent.services.postings;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.navent.implementations.PublisherImpl;

@JsonDeserialize(as = PublisherImpl.class)

public abstract class Publisher {

    abstract public String getLogoUrl();

    abstract public void setLogoUrl(String logoUrl);

    abstract public Boolean getIsPremier();

    abstract public void setIsPremier(Boolean isPremier);

}

