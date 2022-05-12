package com.navent.implementations;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.navent.services.postings.Feature;


public class FeatureImpl extends Feature {

    private Double totalArea;

    private Integer rooms;

    private Integer environments;

    private Integer bathrooms;

    private Integer garages;

    public FeatureImpl() {
    }

    public FeatureImpl(Double totalArea, Integer rooms, Integer enviroments, Integer bathrooms, Integer garages) {
        this.totalArea = totalArea;
        this.rooms = rooms;
        this.environments = enviroments;
        this.bathrooms = bathrooms;
        this.garages = garages;
    }

    @Override
    public String toString() {
        return "{" +
                "totalArea=" + totalArea +
                ", rooms=" + rooms +
                ", environments=" + environments +
                ", bathrooms=" + bathrooms +
                ", garages=" + garages +
                '}';
    }

    @Override
    public Double getTotalArea() {

        return this.totalArea;
    }

    @Override
    public void setTotalArea(Double totalArea) {

        this.totalArea = totalArea;
    }

    @Override
    public Integer getRooms() {

        return this.rooms;
    }

    @Override
    public void setRooms(Integer rooms) {

        this.rooms = rooms;
    }

    @Override
    public Integer getEnvironments() {

        return this.environments;
    }

    @Override
    public void setEnvironments(Integer enviroments) {

        this.environments = enviroments;
    }

    @Override
    public Integer getBathrooms() {

        return this.bathrooms;
    }

    @Override
    public void setBathrooms(Integer bathrooms) {

        this.bathrooms = bathrooms;
    }

    @Override
    public Integer getGarages() {

        return this.garages;
    }

    @Override
    public void setGarages(Integer garages) {

        this.garages = garages;
    }
}
