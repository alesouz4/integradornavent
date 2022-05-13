package com.navent;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.navent.implementations.FilterImpl;
import com.navent.implementations.PostingImpl;
import com.navent.services.postings.OPERATION_TYPE;
import com.navent.services.postings.PUBLICATION_TYPE;
import com.navent.services.postings.SearchPosting;
import com.navent.utils.UtilsPosting;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
//        new UtilsPosting().generateFakePostings();
        FilterImpl filter1 = new FilterImpl(OPERATION_TYPE.ALQUILER, true, false, true, false, PUBLICATION_TYPE.CLASIFFIED, 1, 5, 1, 3);
        FilterImpl filter2 = new FilterImpl(OPERATION_TYPE.EMPRENDIMIENTOS, false, false, true, false, PUBLICATION_TYPE.HIGHLIGHTED, 1, 3, 1, 3);
        FilterImpl filter3 = new FilterImpl(OPERATION_TYPE.HIPOTECARIO, true, true, true, false, PUBLICATION_TYPE.CLASIFFIED, 1, 2, 1, 2 );
        FilterImpl filter4 = new FilterImpl(OPERATION_TYPE.SUBASTA, true, true, true, false, PUBLICATION_TYPE.CLASIFFIED, 1, 3, 1, 3 );
        FilterImpl filter5 = new FilterImpl(OPERATION_TYPE.REMATE, true, false, true, true, PUBLICATION_TYPE.CLASIFFIED, 1, 4, 1, 4 );

        List<PostingImpl> filteredSearchedPosting = new SearchPosting().postings(filter1);

        Collections.sort(filteredSearchedPosting);

        for (PostingImpl posting : filteredSearchedPosting) {
            System.out.println(new ObjectMapper().writerWithDefaultPrettyPrinter().writeValueAsString(posting));
        }
    }

}
