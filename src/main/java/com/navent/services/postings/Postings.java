package com.navent.services.postings;

import com.navent.implementations.PostingImpl;

import java.util.List;

public interface Postings {
    List<PostingImpl> postings (Filter filter);
}
