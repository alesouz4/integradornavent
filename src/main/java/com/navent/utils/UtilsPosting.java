package com.navent.utils;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.javafaker.Faker;
import com.navent.implementations.FeatureImpl;
import com.navent.implementations.PostingImpl;
import com.navent.implementations.PriceImpl;
import com.navent.implementations.PublisherImpl;
import com.navent.services.postings.*;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class UtilsPosting {
    List<PostingImpl> fakePostings = new ArrayList<>();
    ObjectMapper mapper = new ObjectMapper();

    public void generateFakePostings() throws IOException {
        Random numberLong = new Random();
        Random states = new Random();
        Faker faker = new Faker();
        PUBLICATION_TYPE[] publicationType = PUBLICATION_TYPE.values();
        OPERATION_TYPE[] operationType = OPERATION_TYPE.values();
        CATEGORY_LISTING[] categoryListing = CATEGORY_LISTING.values();
        Random intNumber = new Random();
        List<String> tags = new ArrayList<>();
        for (int k = 0; k < 4; k++ ) {
            tags.add(faker.beer().name());
        }

        for (int i = 1; i <= 1; i++) {

            PostingImpl posting = new PostingImpl(numberLong.nextLong(), faker.address().streetAddress(), faker.chuckNorris().fact(), faker.address().fullAddress(), faker.company().logo(), states.nextBoolean(), new FeatureImpl(((100-10)+10*(new Random().nextDouble())), new Random().nextInt(10-1)+1, new Random().nextInt(10-1)+1, new Random().nextInt(10-1)+1, new Random().nextInt(10-1)+1), tags, new Random().nextBoolean(), new Random().nextBoolean(), new Random().nextBoolean(), new Random().nextBoolean(), publicationType[new Random().nextInt(publicationType.length-1)], operationType[new Random().nextInt(operationType.length-1)], categoryListing[new Random().nextInt(categoryListing.length-1)], new PriceImpl((1000000-100000)+100000*new Random().nextDouble(), (1000-100)+100*new Random().nextDouble(), (100-10)+10*new Random().nextDouble()), new PublisherImpl(faker.company().logo(), new Random().nextBoolean()));
            System.out.println(posting);
            fakePostings.add(posting);

        }
        try{
            mapper.writerWithDefaultPrettyPrinter().writeValue(new File("./postings.json"), fakePostings);

        } catch (IOException exception) {
            System.out.println(exception);
        }
    }

    public List<PostingImpl> getFakePostings() throws IOException {
        List<PostingImpl> fakePosting = new ArrayList<>();
        try{
         fakePosting.addAll(mapper.readValue(new File("./postings.json"), new TypeReference<List<PostingImpl>>() {
         }));

    } catch (IOException exception) {
        System.out.println(exception);
    } return fakePosting;
    }


}

