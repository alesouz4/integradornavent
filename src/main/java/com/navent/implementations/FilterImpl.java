package com.navent.implementations;

import com.navent.services.postings.Filter;
import com.navent.services.postings.OPERATION_TYPE;
import com.navent.services.postings.PUBLICATION_TYPE;

public class FilterImpl extends Filter {

    private OPERATION_TYPE operation_type;
    private boolean favorite;
    private boolean contacted;
    private boolean viewed;
    private boolean hasWhatsapp;
    private PUBLICATION_TYPE publication_type;
    private Integer roomFrom;
    private Integer roomTo;
    private Integer bathroomsFrom;
    private Integer bathroomsTo;

    public FilterImpl(OPERATION_TYPE operation_type, boolean favorite, boolean contacted, boolean viewed, boolean hasWhatsapp, PUBLICATION_TYPE publication_type, Integer roomFrom, Integer roomTo, Integer bathroomsFrom, Integer bathroomsTo) {
        this.operation_type = operation_type;
        this.favorite = favorite;
        this.contacted = contacted;
        this.viewed = viewed;
        this.hasWhatsapp = hasWhatsapp;
        this.publication_type = publication_type;
        this.roomFrom = roomFrom;
        this.roomTo = roomTo;
        this.bathroomsFrom = bathroomsFrom;
        this.bathroomsTo = bathroomsTo;
    }

    @Override
    public OPERATION_TYPE getOperationType() {
        return this.operation_type;
    }

    @Override
    public void setOperationType(OPERATION_TYPE operationType) {
        this.operation_type = operationType;
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
    public void setViewed(Boolean viewed) {
        this.viewed = viewed;
    }

    @Override
    public Boolean getHasWhatsapp() {
        return this.hasWhatsapp;
    }

    @Override
    public void setHasWhatsapp(Boolean haswhatsapp) {
        this.hasWhatsapp = haswhatsapp;
    }

    @Override
    public PUBLICATION_TYPE getPublicationType() {
        return this.publication_type;
    }

    @Override
    public void setPublicationType(PUBLICATION_TYPE publicationType) {
        this.publication_type = publicationType;
    }

    @Override
    public Integer getRoomsFrom() {
        return this.roomFrom;
    }

    @Override
    public void setRoomsFrom(Integer rooms) {
        this.roomFrom = roomFrom;
    }

    @Override
    public Integer getRoomsTo() {
        return this.bathroomsTo;
    }

    @Override
    public void setRoomsTo(Integer rooms) {
        this.bathroomsTo = bathroomsTo;
    }

    @Override
    public Integer getBathroomsFrom() {
        return this.bathroomsFrom;
    }

    @Override
    public void setBathroomsFrom(Integer bathrooms) {
        this.bathroomsFrom = bathroomsFrom;
    }

    @Override
    public Integer getBathroomsTo() {
        return this.bathroomsTo;
    }

    @Override
    public void setBathroomsTo(Integer bathrooms) {
        this.bathroomsTo = bathroomsTo;
    }

    @Override
    public String toString() {
        return "{" +
                "operation_type=" + operation_type +
                ", favorite=" + favorite +
                ", contacted=" + contacted +
                ", viewed=" + viewed +
                ", hasWhatsapp=" + hasWhatsapp +
                ", publication_type=" + publication_type +
                ", roomFrom=" + roomFrom +
                ", roomTo=" + roomTo +
                ", bathroomsFrom=" + bathroomsFrom +
                ", bathroomsTo=" + bathroomsTo +
                '}';
    }
}
