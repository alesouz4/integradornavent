package com.navent.services.postings;

import com.navent.implementations.FilterImpl;
import com.navent.implementations.PostingImpl;
import com.navent.utils.UtilsPosting;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SearchPosting implements Postings {

    public boolean searchPostingByFilters(FilterImpl filter, PostingImpl posting) {
        if (filter.getOperationType() == posting.getOperationType() && filter.getPublicationType() == posting.getPublicationType()) {
            if (filter.getContacted() && filter.getFavorite() && filter.getViewed() && filter.getHasWhatsapp()) {
                if (posting.getFeature().getRooms() >= filter.getRoomsFrom() && posting.getFeature().getRooms() <= filter.getRoomsTo()) {
                    if (posting.getFeature().getBathrooms() >= filter.getBathroomsFrom() && posting.getFeature().getBathrooms() <= filter.getBathroomsTo()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public List<PostingImpl> postings(FilterImpl filter) throws IOException {
        List<PostingImpl> fakePostings = new UtilsPosting().getFakePostings();
        List<PostingImpl> filteredFakePostings = new ArrayList<>();
        for (PostingImpl posting : fakePostings) {
            if (searchPostingByFilters(filter, posting)) {
                filteredFakePostings.add(posting);
            }
        }
        return filteredFakePostings;
    }
}
                /*System.out.println(filter);
               System.out.println(posting.getOperationType());
               System.out.println(posting.getFavorite());
               System.out.println(posting.getContacted());
               System.out.println(posting.getViewed());
               System.out.println(posting.getHaswhatsapp());
               System.out.println(posting.getPublicationType());
               System.out.println(posting.getFeature().getRooms());
               System.out.println(posting.getFeature().getBathrooms());*/
