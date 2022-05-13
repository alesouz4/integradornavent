package com.navent.utils;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.javafaker.Faker;
import com.navent.implementations.FeatureImpl;
import com.navent.implementations.PostingImpl;
import com.navent.implementations.PriceImpl;
import com.navent.implementations.PublisherImpl;
import com.navent.services.postings.CATEGORY_LISTING;
import com.navent.services.postings.OPERATION_TYPE;
import com.navent.services.postings.PUBLICATION_TYPE;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Random;

public class UtilsPosting {
    List<PostingImpl> fakePostings = new ArrayList<>();
    List<String> tags = new ArrayList<>();

    public void generateFakePosting() throws IOException {
        ObjectMapper mapper = new ObjectMapper();

        Faker faker = new Faker(new Locale("es"));

        PUBLICATION_TYPE[] publication_type = PUBLICATION_TYPE.values();
        OPERATION_TYPE[] operation_type = OPERATION_TYPE.values();
        CATEGORY_LISTING[] category_listing = CATEGORY_LISTING.values();

        for (int k = 0; k < 100; k++) {
            tags.add(faker.beer().malt());
        }

        for (int i=1;i<=3;i++){
            PostingImpl posting = new PostingImpl(new Random().nextLong(), faker.address().streetAddress(), faker.chuckNorris().fact(), faker.address().fullAddress(), faker.company().logo(), new Random().nextBoolean(), new FeatureImpl(((100-10)+10*(new Random().nextDouble())), new Random().nextInt(10-1)+1, new Random().nextInt(10-1)+1, new Random().nextInt(10-1)+1, new Random().nextInt(10-1)+1), tags, new Random().nextBoolean(), new Random().nextBoolean(), new Random().nextBoolean(), new Random().nextBoolean(), publication_type[new Random().nextInt(publication_type.length - 1)], operation_type[new Random().nextInt(operation_type.length - 1)], category_listing[new Random().nextInt(category_listing.length - 1)], new PriceImpl((1000000-10000)+10000*new Random().nextDouble(), (10000-100)+100*new Random().nextDouble(), (100-10)+10*new Random().nextDouble()), new PublisherImpl(faker.company().logo(), new Random().nextBoolean()));
            fakePostings.add(posting);
            mapper.writerWithDefaultPrettyPrinter().writeValue(new File("./postingData.json"), fakePostings);
        }

    }

    public List<PostingImpl> getFakePosting() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        List<PostingImpl> postings = mapper.readValue(new File("./postingData.json"), new TypeReference<List<PostingImpl>>() {
        });
        return postings;
    }

}
