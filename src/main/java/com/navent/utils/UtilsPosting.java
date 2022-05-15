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

/**
 * Esta clase nos sirve para generar y leer los fakePosting. Ademas los serealiza/deserailiza  json.
 */
public class UtilsPosting {
    /**
     * Esta lista contiene los fakePosting que se van a generar.
     */
    private static final int QTY_FAKE_POSTING=100;
    List<PostingImpl> fakePostings = new ArrayList<>();

    /**
     * Creamos un objecto ObjectMapper de la libreria Jackson. Este nos permite trabajar con json
     */
    ObjectMapper mapper = new ObjectMapper();

    /**
     * Este metodo nos genera 100 fakePosting y los serealiza en un archivo JSON. Cada fakePosting es un objecto de la clase PostingImpl que los iniciamos con valores
     * random.
     * @throws IOException
     * @return void
     */
    public void generateFakePostings() throws IOException {

        Faker faker = new Faker();

        PUBLICATION_TYPE[] publicationType = PUBLICATION_TYPE.values();
        OPERATION_TYPE[] operationType = OPERATION_TYPE.values();
        CATEGORY_LISTING[] categoryListing = CATEGORY_LISTING.values();


        List<String> tags = new ArrayList<>();

        for (int k = 0; k < 10; k++ ) {
            tags.add(faker.beer().name());
        }

        for (int i = 1; i <= QTY_FAKE_POSTING; i++) {
            PostingImpl posting = new PostingImpl(new Random().nextLong(), faker.address().streetAddress(), faker.chuckNorris().fact(), faker.address().fullAddress(), faker.company().logo(), new Random().nextBoolean(), new FeatureImpl(((100-10)+10*(new Random().nextDouble())), new Random().nextInt(10-1)+1, (10-1)+1*new Random().nextInt(), new Random().nextInt(10-1)+1, new Random().nextInt(10-1)+1), tags, new Random().nextBoolean(), new Random().nextBoolean(), new Random().nextBoolean(), new Random().nextBoolean(), publicationType[new Random().nextInt(publicationType.length-1)], operationType[new Random().nextInt(operationType.length-1)], categoryListing[new Random().nextInt(categoryListing.length-1)], new PriceImpl((1000000-100000)+100000*new Random().nextDouble(), (1000-100)+100*new Random().nextDouble(), (100-10)+10*new Random().nextDouble()), new PublisherImpl(faker.company().logo(), new Random().nextBoolean()));
            fakePostings.add(posting);
        }

        try{
            /**
             * La linea de abajo se encarga de generar un archivo JSON con la lista de los fakePostings
             */
            mapper.writerWithDefaultPrettyPrinter().writeValue(new File("./postings.json"), fakePostings);

        } catch (IOException exception) {
            System.out.println(exception);
        }
    }

    /**
     * Este metodo obtiene del arhivo JSON los postings.
     * @return List<PostingImpl>
     * @throws IOException
     */
    public List<PostingImpl> getFakePostings() throws IOException {
        List<PostingImpl> fakePostingFromJson = new ArrayList<>();
        try{
            /**
             * Añadimos a la lista fakePostingFromJson los posting leidos del archivo. El TypeReference es un objecto de la
             * libreria Jackson que nos ayuda a la hora de leer arrays de json. Se debe indicar que tipo de dato es la lista.
             * En este caso de PostingImpl.
             */
            fakePostingFromJson.addAll(mapper.readValue(new File("./postings.json"), new TypeReference<List<PostingImpl>>() {
         }));

    } catch (IOException exception) {
        System.out.println(exception);
    } return fakePostingFromJson;
    }


}

