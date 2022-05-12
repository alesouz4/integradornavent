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

    public void generateFakePostings() throws IOException {
        Random numberLong = new Random();
        Random states = new Random();
        Random intNumber = new Random();

        ObjectMapper mapper = new ObjectMapper();

        Faker faker = new Faker(new Locale("es"));

        Double[] numbersDouble = {1.33, 1.44, 1.55, 5.66, 3.33, 4.44, 6.66};
        Double[] pricePosting = {52500.80, 36000.50, 125000.00, 555471.10, 964753.88, 11112.78, 99645.45};
        Double[] expenPosting = {569.66, 4452.2, 1250.33, 696.77, 125.33, 6669.4, 444.0, 321.10};
        Double[] priceLower = {44.44, 22.2, 15.3, 2.4, 5.55};

        Integer[] numbersInteger = {4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};

        PUBLICATION_TYPE[] publication_type = PUBLICATION_TYPE.values();
        OPERATION_TYPE[] operation_type = OPERATION_TYPE.values();
        CATEGORY_LISTING[] category_listing = CATEGORY_LISTING.values();

        for (int k = 0; k < 4; k++) {
            tags.add(faker.beer().malt());
        }

        PostingImpl posting = new PostingImpl(numberLong.nextLong(), faker.address().streetAddress(), faker.chuckNorris().fact(), faker.address().fullAddress(), faker.company().logo(), states.nextBoolean(), new FeatureImpl(((100-10)+10*(new Random().nextDouble())), new Random().nextInt(10-1)+1, new Random().nextInt(10-1)+1, new Random().nextInt(10-1)+1, new Random().nextInt(10-1)+1), tags, new Random().nextBoolean(), new Random().nextBoolean(), new Random().nextBoolean(), new Random().nextBoolean(), publication_type[new Random().nextInt(publication_type.length - 1)], operation_type[new Random().nextInt(operation_type.length - 1)], category_listing[new Random().nextInt(category_listing.length - 1)], new PriceImpl(pricePosting[new Random().nextInt(pricePosting.length - 1)], expenPosting[new Random().nextInt(expenPosting.length - 1)], priceLower[new Random().nextInt(pricePosting.length - 1)]), new PublisherImpl(faker.company().logo(), new Random().nextBoolean()));

        System.out.println(posting.toString());
        //fakePostings.add(posting);

        //mapper.writerWithDefaultPrettyPrinter().writeValue(new File("./postingData.json"), fakePostings);
    }

    public List<PostingImpl> getFakePosting() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        List<PostingImpl> postings = mapper.readValue(new File("./postingData.json"), new TypeReference<List<PostingImpl>>() {
        });

        return postings;

    }

}
