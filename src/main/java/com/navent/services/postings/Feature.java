package com.navent.services.postings;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.navent.implementations.FeatureImpl;

@JsonDeserialize(as = FeatureImpl.class)
public abstract class Feature {

    abstract public Double getTotalArea();

    abstract public void setTotalArea(Double totalArea);

    abstract public Integer getRooms();

    abstract public void setRooms(Integer rooms);

    abstract public Integer getEnvironments();

    abstract public void setEnvironments(Integer environments);

    abstract public Integer getBathrooms();

    abstract public void setBathrooms(Integer bathrooms);

    abstract public Integer getGarages();

    abstract public void setGarages(Integer garages);

}

