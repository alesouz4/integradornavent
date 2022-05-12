package com.navent.utils;

import com.navent.implementations.FeatureImpl;
import com.navent.implementations.PostingImpl;
import com.navent.services.postings.PUBLICATION_TYPE;
import io.codearte.jfairy.Fairy;
import io.codearte.jfairy.producer.company.Company;
import io.codearte.jfairy.producer.person.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class UtilsPosting {
    List<PostingImpl> fakePostings = new ArrayList<>();

    public void generateFakePostings(){
        Random numberLong = new Random();
        Fairy fake = Fairy.create();
        Company company = fake.company();
        Person person = fake.person();
        Random states = new Random();
        Double[] numbersDouble = {1.33, 1.44, 1.55, 5.66, 3.33, 4.44, 6.66};
        Integer[] numbersInteger = {4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
        Random intNumber = new Random();
        List<String> tags = new ArrayList<>();
        for (int k = 0; k < 4; k++ ) {
            tags.add(person.getUsername());
        }

        for (int i = 1; i <= 100; i++) {

            PostingImpl posting = new PostingImpl(numberLong.nextLong(), company.getName(), company.getName(), person.getAddress(), company.getUrl(), states.nextBoolean(), new FeatureImpl(new Random().nextDouble(), new Random().nextInt(), new Random().nextInt(), new Random().nextInt(), new Random().nextInt()), tags, new Random().nextBoolean(), new Random().nextBoolean(), new Random().nextBoolean(), new Random().nextBoolean(), PUBLICATION_TYPE.get());
            fakePostings.add(posting);

        }
    }
}
