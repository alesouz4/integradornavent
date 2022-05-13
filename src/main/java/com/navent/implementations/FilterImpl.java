package com.navent.implementations;

import com.navent.services.postings.Filter;
import com.navent.services.postings.OPERATION_TYPE;
import com.navent.services.postings.PUBLICATION_TYPE;

public class FilterImpl extends Filter {

    private OPERATION_TYPE operationType;

    private boolean favorite;

    private boolean contacted;

    private boolean viewed;

    private boolean hasWatsapp;

    private PUBLICATION_TYPE publicationType;

    private int roomsFrom;

    private int roomsTo;

    private int bathroomsFrom;

    private int bathroomsTo;

    public FilterImpl(OPERATION_TYPE operationType, boolean favorite, boolean contacted, boolean viewed, boolean hasWatsapp, PUBLICATION_TYPE publicationType, int roomsFrom, int roomsTo, int bathroomsFrom, int bathroomsTo) {
        this.operationType = operationType;
        this.favorite = favorite;
        this.contacted = contacted;
        this.viewed = viewed;
        this.hasWatsapp = hasWatsapp;
        this.publicationType = publicationType;
        this.roomsFrom = roomsFrom;
        this.roomsTo = roomsTo;
        this.bathroomsFrom = bathroomsFrom;
        this.bathroomsTo = bathroomsTo;
    }

    @Override
    public OPERATION_TYPE getOperationType() {
        return this.operationType;
    }

    @Override
    public void setOperationType(OPERATION_TYPE operationType) {
        this.operationType = operationType;
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
        return this.hasWatsapp;
    }

    @Override
    public void setHasWhatsapp(Boolean haswhatsapp) {
        this.hasWatsapp = haswhatsapp;
    }

    @Override
    public PUBLICATION_TYPE getPublicationType() {
        return this.publicationType;
    }

    @Override
    public void setPublicationType(PUBLICATION_TYPE publicationType) {
        this.publicationType=publicationType;
    }

    @Override
    public Integer getRoomsFrom() {
        return this.roomsFrom;
    }

    @Override
    public void setRoomsFrom(Integer roomsFrom) {
        this.roomsFrom=roomsFrom;
    }

    @Override
    public Integer getRoomsTo() {
        return this.roomsTo;
    }

    @Override
    public void setRoomsTo(Integer roomsTo) {
        this.roomsTo=roomsTo;
    }

    @Override
    public Integer getBathroomsFrom() {
        return this.bathroomsFrom;
    }

    @Override
    public void setBathroomsFrom(Integer bathroomsFrom) {
        this.bathroomsFrom=bathroomsFrom;
    }

    @Override
    public Integer getBathroomsTo() {
        return this.bathroomsTo;
    }

    @Override
    public void setBathroomsTo(Integer bathroomsTo) {
        this.bathroomsTo=bathroomsTo;
    }
}
