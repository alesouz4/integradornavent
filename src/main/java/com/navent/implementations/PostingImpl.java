package com.navent.implementations;

import com.navent.services.postings.*;

import java.util.List;

public class PostingImpl extends Posting {

    private int hashCode;

    private Long id;

    private String title;

    private String description;

    private String address;

    private String pictureURL;

    private boolean IsDevelopment;

    private Feature feature;

    private List<String> tags;

    private boolean favorite;

    private boolean contacted;

    private boolean viewed;

    private boolean haswhatsapp;

    private PublicationType publicationType;

    private OperationType operationType;

    private CategoryListing categoryListing;

    private Price price;

    private Publisher publisher;


    public PostingImpl() {
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
        return "PostingImpl{" +
                "hashCode=" + hashCode +
                ", id=" + id +
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
                ", operationType=" + operationType +
                ", categoryListing=" + categoryListing +
                ", price=" + price +
                ", publisher=" + publisher +
                '}';
    }

    public PostingImpl(int hashCode, Long id, String title, String description, String address, String pictureURL, boolean isDevelopment, Feature feature, List<String> tags, boolean favorite, boolean contacted, boolean viewed, boolean haswhatsapp, PublicationType publicationType, OperationType operationType, CategoryListing categoryListing, Price price, Publisher publisher) {
        this.hashCode = hashCode;
        this.id = id;
        this.title = title;
        this.description = description;
        this.address = address;
        this.pictureURL = pictureURL;
        IsDevelopment = isDevelopment;
        this.feature = feature;
        this.tags = tags;
        this.favorite = favorite;
        this.contacted = contacted;
        this.viewed = viewed;
        this.haswhatsapp = haswhatsapp;
        this.publicationType = publicationType;
        this.operationType = operationType;
        this.categoryListing = categoryListing;
        this.price = price;
        this.publisher = publisher;
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
    public PublicationType getPublicationType() {
        return this.publicationType;
    }

    @Override
    public void setPublicationType(PublicationType publicationType) {
        this.publicationType = publicationType;
    }

    @Override
    public OperationType getOperationType() {
        return this.operationType;
    }

    @Override
    public void setOperationType(OperationType operationType) {
        this.operationType = operationType;
    }


    @Override
    public CategoryListing getCategoryListing() {
        return this.categoryListing;
    }

    @Override
    public void setCategoryListing(CategoryListing categoryListing) {
        this.categoryListing = categoryListing;
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