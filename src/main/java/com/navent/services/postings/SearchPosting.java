package com.navent.services.postings;

import com.navent.implementations.FilterImpl;
import com.navent.implementations.PostingImpl;
import com.navent.utils.UtilsPosting;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SearchPosting implements Postings{
    @Override
    public List<PostingImpl> postings(FilterImpl filter) throws IOException {
        List<PostingImpl> fakePostings = new UtilsPosting().getFakePostings();
        List<PostingImpl> filteredFakePostings = new ArrayList<>();
        for (PostingImpl posting : fakePostings) {
            if (posting.equals(filter)) {
                filteredFakePostings.add(posting);
            }
        }
        return filteredFakePostings;
    }
}
