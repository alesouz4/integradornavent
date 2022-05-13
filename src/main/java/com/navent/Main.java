package com.navent;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.navent.implementations.FilterImpl;
import com.navent.implementations.PostingImpl;
import com.navent.services.postings.SearchPostings;
import com.navent.services.postings.OPERATION_TYPE;
import com.navent.services.postings.PUBLICATION_TYPE;
import com.navent.utils.UtilsPosting;

import java.io.IOException;
import java.util.Collections;
import java.util.List;


public class Main {
    public static void main(String[] args) throws IOException {
//        UtilsPosting utilsFakePosting = new UtilsPosting();
//         utilsFakePosting.generateFakePosting(); //-> Genera los 100 Postings.

        FilterImpl filter1 = new FilterImpl(OPERATION_TYPE.ALQUILER, false, true, true, true, PUBLICATION_TYPE.CLASIFFIED, 1, 2, 1, 2);
        FilterImpl filter2 = new FilterImpl(OPERATION_TYPE.EMPRENDIMIENTOS, false, true, true, false, PUBLICATION_TYPE.EXCLUSIVE, 1, 4, 1, 2);
        FilterImpl filter3 = new FilterImpl(OPERATION_TYPE.FORECLOSURE, true, false, false, true, PUBLICATION_TYPE.SUPERHIGHLIGHTED, 1, 3, 1, 8);
        FilterImpl filter4 = new FilterImpl(OPERATION_TYPE.REMATE, false, true, true, false, PUBLICATION_TYPE.CLASIFFIED, 1, 2, 6, 4);
        FilterImpl filter5 = new FilterImpl(OPERATION_TYPE.VENTA, true, false, true, true, PUBLICATION_TYPE.HIGHLIGHTED, 1, 2, 9, 3);

        //Obtiene los Posting segun los filtros.
        List<PostingImpl> postingFilters = new SearchPostings().postings(filter1);


        //Muestra los post ya filtrados
        for (PostingImpl postingFilt : postingFilters) {
            System.out.println(new ObjectMapper().writerWithDefaultPrettyPrinter().writeValueAsString(postingFilters));
        }

    }

}

