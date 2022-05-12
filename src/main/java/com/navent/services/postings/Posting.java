package com.navent.services.postings;
import java.util.List;


    public abstract class Posting extends Entity {
        public abstract int getHashCode();

        public abstract void setHashCode(int hashCode);

        abstract public Long getId();

        abstract public void setId(Long id);

        abstract public String getTitle();

        abstract public void setTitle(String title);

        abstract public String getDescription();

        abstract public void setDescription(String description);

        abstract public String getAddress();

        abstract public void setAddress(String address);

        abstract public String getPicturesUrl();

//ejemplo

//"https://ingar.zonapropcdn.com/avisos/1/00/49/06/32/90/wh/1793779955.jpg",

//"https://ingar,zonapropcdn.com/avis01/1/00/49/06/32/98/wxh/1793779957.jpg"

        abstract public void setPicturesUrl(String picturesUrl);

        abstract public boolean getIsDevelopment();

        abstract public void setIsDevelopment(Boolean Development);

        abstract public Feature getFeatures();

        abstract public void setFeatures(Feature features);

        public abstract String getPictureUrl();

        public abstract void setPictureUrl(String pictureURL);

        public abstract Feature getFeature();

        public abstract void setFeature(Feature feature);

        abstract public List<String> getTags();

// ejemplos "RESERVED, 300, "VIDEO", "ADMITS PETS", "CREDIT, //SURETY INSURANCE "FINANCE

        abstract public void setTags(List<String> tags);

        abstract public Boolean getFavorite();

        abstract public void setFavorite(Boolean favorite);

        abstract public Boolean getContacted();

        abstract public void setContacted(Boolean contacted);

        abstract public Boolean getViewed();

        abstract public void setviewed(Boolean viewed);

        abstract public Boolean getHaswhatsapp();

        abstract public void setHasWhatsapp(Boolean hasWhatsapp);

        abstract public PUBLICATION_TYPE getPublicationType();

        abstract public void setPublicationType(PUBLICATION_TYPE publicationType);

        abstract public OPERATION_TYPE getOperationType();

        abstract public void setOperationType(OPERATION_TYPE OPERATIONTYPE);

        public abstract CATEGORY_LISTING getCategoryListing();

        abstract public void setCategoryListing(CATEGORY_LISTING CATEGORYLISTING);

        abstract public Price getPrice();

        abstract public void setPrice(Price price);

        abstract public Publisher getPublisher();

        abstract public void setPublisher(Publisher publisher);
    }



