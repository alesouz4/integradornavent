package com.navent.services.postings;

import com.navent.implementations.FilterImpl;
import com.navent.implementations.PostingImpl;

import java.io.IOException;
import java.util.List;

public interface Postings {
    List<PostingImpl> postings (FilterImpl filter) throws IOException;
}
