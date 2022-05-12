package com.navent.implementations;

import com.navent.services.postings.*;

import java.util.ArrayList;
import java.util.List;

public class PostingImpl extends Posting {

    private Long id;

    private String title;

    private String description;

    private String address;

    private String pictureURL;

    private boolean IsDevelopment;

    private Feature feature;

    private List<String> tags=new ArrayList<>();

    private boolean favorite;

    private boolean contacted;

    private boolean viewed;

    private boolean haswhatsapp;

    private PUBLICATION_TYPE publicationType;

    private OPERATION_TYPE OPERATIONTYPE;

    private CATEGORY_LISTING CATEGORYLISTING;

    private Price price;

    private Publisher publisher;

    public PostingImpl() {
    }

    public PostingImpl(Long id, String title, String description, String address, String pictureURL, boolean isDevelopment, Feature feature, List<String> tags, boolean favorite, boolean contacted, boolean viewed, boolean haswhatsapp, PUBLICATION_TYPE publicationType, OPERATION_TYPE OPERATIONTYPE, CATEGORY_LISTING CATEGORYLISTING, Price price, Publisher publisher) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.address = address;
        this.pictureURL = pictureURL;
        IsDevelopment = isDevelopment;
        this.feature = feature;
        this.tags.addAll(tags);
        this.favorite = favorite;
        this.contacted = contacted;
        this.viewed = viewed;
        this.haswhatsapp = haswhatsapp;
        this.publicationType = publicationType;
        this.OPERATIONTYPE = OPERATIONTYPE;
        this.CATEGORYLISTING = CATEGORYLISTING;
        this.price = price;
        this.publisher = publisher;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        return false;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", address='" + address + '\'' +
                ", pictureURL='" + pictureURL + '\'' +
                ", IsDevelopment=" + IsDevelopment +
                ", feature=" + feature +
                ", tags=" + tags +
                ", favorite=" + favorite +
                ", contacted=" + contacted +
                ", viewed=" + viewed +
                ", haswhatsapp=" + haswhatsapp +
                ", publicationType=" + publicationType +
                ", OPERATIONTYPE=" + OPERATIONTYPE +
                ", CATEGORYLISTING=" + CATEGORYLISTING +
                ", price=" + price +
                ", publisher=" + publisher +
                '}';
    }

    @Override
    public int getHashCode() {
        return 0;
    }

    @Override
    public void setHashCode(int hashCode) {

    }

    @Override
    public Long getId() {
        return this.id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String getTitle() {
        return this.title;
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String getAddress() {
        return this.address;
    }

    @Override
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String getPicturesUrl() {
        return this.pictureURL;
    }

    @Override
    public void setPicturesUrl(String picturesUrl) {
        this.pictureURL = picturesUrl;
    }

    @Override
    public boolean getIsDevelopment() {
        return this.IsDevelopment;
    }

    @Override
    public void setIsDevelopment(Boolean Development) {
        this.IsDevelopment = Development;
    }

    @Override
    public Feature getFeatures() {
        return this.feature;
    }

    @Override
    public void setFeatures(Feature features) {
        this.feature = features;
    }

    @Override
    public String getPictureUrl() {
        return this.pictureURL;
    }

    @Override
    public void setPictureUrl(String pictureURL) {
        this.pictureURL = pictureURL;
    }

    @Override
    public Feature getFeature() {
        return this.feature;
    }

    @Override
    public void setFeature(Feature feature) {
        this.feature = feature;
    }

    @Override
    public List<String> getTags() {
        return this.tags;
    }

    @Override
    public void setTags(List<String> tags) {
        this.tags.addAll(tags);
    }

    @Override
    public Boolean getFavorite() {
        return this.favorite;
    }

    @Override
    public void setFavorite(Boolean favorite) {
        this.favorite = favorite;
    }

    @Override
    public Boolean getContacted() {
        return this.contacted;
    }

    @Override
    public void setContacted(Boolean contacted) {
        this.contacted = contacted;
    }

    @Override
    public Boolean getViewed() {
        return this.viewed;
    }

    @Override
    public void setviewed(Boolean viewed) {
        this.viewed = viewed;
    }

    @Override
    public Boolean getHaswhatsapp() {
        return this.haswhatsapp;
    }

    @Override
    public void setHasWhatsapp(Boolean hasWhatsapp) {
        this.haswhatsapp = hasWhatsapp;
    }

    @Override
    public PUBLICATION_TYPE getPublicationType() {
        return this.publicationType;
    }

    @Override
    public void setPublicationType(PUBLICATION_TYPE publicationType) {
        this.publicationType = publicationType;
    }

    @Override
    public OPERATION_TYPE getOperationType() {
        return this.OPERATIONTYPE;
    }

    @Override
    public void setOperationType(OPERATION_TYPE OPERATIONTYPE) {
        this.OPERATIONTYPE = OPERATIONTYPE;
    }


    @Override
    public CATEGORY_LISTING getCategoryListing() {
        return this.CATEGORYLISTING;
    }

    @Override
    public void setCategoryListing(CATEGORY_LISTING CATEGORYLISTING) {
        this.CATEGORYLISTING = CATEGORYLISTING;
    }

    @Override
    public Price getPrice() {
        return this.price;
    }

    @Override
    public void setPrice(Price price) {
        this.price = price;
    }

    @Override
    public Publisher getPublisher() {
        return this.publisher;
    }

    @Override
    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }
}