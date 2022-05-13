package com.navent.services.postings;

public abstract class Filter {
    abstract public OPERATION_TYPE getOperationType();

    abstract public void setOperationType(OPERATION_TYPE operationType);

    abstract public Boolean getFavorite();

    abstract public void setFavorite(Boolean favorite);

    abstract public Boolean getContacted();

    abstract public void setContacted(Boolean contacted);

    abstract public Boolean getViewed();

    abstract public void setViewed(Boolean viewed);

    abstract public Boolean getHasWhatsapp();

    abstract public void setHasWhatsapp(Boolean haswhatsapp);

    abstract public PUBLICATION_TYPE getPublicationType();

    abstract public void setPublicationType(PUBLICATION_TYPE publicationType);

    abstract public Integer getRoomsFrom();

    abstract public void setRoomsFrom(Integer rooms);

    abstract public Integer getRoomsTo();

    abstract public void setRoomsTo(Integer rooms);

    abstract public Integer getBathroomsFrom();

    abstract public void setBathroomsFrom(Integer bathrooms);

    abstract public Integer getBathroomsTo();

    abstract public void setBathroomsTo(Integer bathrooms);
}
