package com.navent.implementations;

import com.navent.services.postings.Publisher;

public class PublisherImpl extends Publisher {

    private String logoUrl;

    private Boolean isPremier;

    public PublisherImpl() {
    }

    public PublisherImpl(String logoUrl, Boolean isPremier) {
        this.logoUrl = logoUrl;
        this.isPremier = isPremier;
    }

    @Override
    public String getLogoUrl() {
        return this.logoUrl;
    }

    @Override
    public void setLogoUrl(String logoUrl) {

        this.logoUrl = logoUrl;
    }

    @Override
    public Boolean getIsPremier() {

        return this.isPremier;
    }

    @Override
    public void setIsPremier(Boolean premier) {
        this.isPremier = premier;
    }

    @Override
    public String toString() {
        return "{" +
                "logoUrl='" + logoUrl + '\'' +
                ", isPremier=" + isPremier +
                '}';
    }
}
