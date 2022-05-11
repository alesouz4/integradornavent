package com.navent;

import com.navent.implementations.FeatureImpl;
import com.navent.implementations.PostingImpl;
import com.navent.implementations.PriceImpl;
import com.navent.implementations.PublisherImpl;
import com.navent.services.postings.CategoryListing;
import com.navent.services.postings.OperationType;
import com.navent.services.postings.PublicationType;

import java.util.ArrayList;
import java.util.List;

public class TestPosting {
    public static void main(String[] args) {
        List<String> listTags = new ArrayList<>();
        listTags.add("Hola");

        PostingImpl P1 = new PostingImpl(22, 4569L, "Title Test", "description", "address", "pictureURL", true, new FeatureImpl(33.5, 2, 4, 2, 4), listTags, false, true, false, true, PublicationType.CLASIFFIED, OperationType.HIPOTECARIO, CategoryListing.CLASIFICADO, new PriceImpl(22555.33, 5204.00, 22.22), new PublisherImpl("url", true));
        System.out.println(P1.toString());

    }
}

