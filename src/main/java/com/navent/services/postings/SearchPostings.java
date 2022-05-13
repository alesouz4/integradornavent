package com.navent.services.postings;

import com.navent.implementations.PostingImpl;
import com.navent.services.postings.Filter;
import com.navent.services.postings.Postings;
import com.navent.utils.UtilsPosting;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SearchPostings implements Postings {

    @Override
    public List<PostingImpl> postings(Filter filter) throws IOException {
        UtilsPosting utilsFakePosting = new UtilsPosting();

        List<PostingImpl> allPosting = utilsFakePosting.getFakePosting();
        List<PostingImpl> postingFilters = new ArrayList<>();

        for (PostingImpl posting : allPosting) {
            if (posting.equals(filter)) {
                postingFilters.add(posting);
            }
        }
        return postingFilters;
    }
}
