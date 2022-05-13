package com.navent.services.postings;

import com.navent.implementations.FilterImpl;
import com.navent.implementations.PostingImpl;
import com.navent.services.postings.Filter;
import com.navent.services.postings.Postings;
import com.navent.utils.UtilsPosting;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SearchPostings implements Postings {

    public boolean filterPosting(Filter filter, PostingImpl posting) {
        if (posting.getFeatures().getRooms() >= filter.getRoomsFrom() && posting.getFeatures().getRooms() <= filter.getRoomsTo()) {
            if (posting.getFeatures().getBathrooms() >= filter.getBathroomsFrom() && posting.getFeatures().getBathrooms() <= filter.getBathroomsTo()) {
                if (filter.getPublicationType() == posting.getPublicationType() && filter.getOperationType() == posting.getOperationType()) {
                    if (posting.getFavorite() == filter.getFavorite() && posting.getContacted() == filter.getContacted() && posting.getViewed() == filter.getViewed() && posting.getHaswhatsapp() == filter.getHasWhatsapp()) {
                        return true;
                    }
                }
            }
        }

        return false;
    }

    @Override
    public List<PostingImpl> postings(Filter filter) throws IOException {
        UtilsPosting utilsFakePosting = new UtilsPosting();

        List<PostingImpl> allPosting = utilsFakePosting.getFakePosting();
        List<PostingImpl> postingFilters = new ArrayList<>();

        for (PostingImpl posting : allPosting) {
            if (filterPosting(filter,posting)) {
                postingFilters.add(posting);
            }
        }
        return postingFilters;
    }
}
