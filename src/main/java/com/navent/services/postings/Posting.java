package com.navent.services.postings;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.navent.implementations.PostingImpl;

import java.util.List;

@JsonDeserialize(as = PostingImpl.class)
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

        abstract public boolean getIsDevelopment();

        abstract public void setIsDevelopment(Boolean Development);

        abstract public Feature getFeatures();

        abstract public void setFeatures(Feature features);

        public abstract String getPictureUrl();

        public abstract void setPictureUrl(String pictureURL);

        abstract public List<String> getTags();

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



