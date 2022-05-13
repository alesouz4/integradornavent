package com.navent.services.postings;

import com.navent.implementations.FilterImpl;
import com.navent.implementations.PostingImpl;
import com.navent.utils.UtilsPosting;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SearchPosting implements Postings {
    /**
     * Esta funcion se encarga de verificar si el posting que se pasa por parametro concuerda segun los filtros tambien pasados por parametros.
     * @param filter
     * @param posting
     * @return boolean
     */
    public boolean searchPostingByFilters(FilterImpl filter, PostingImpl posting) {
        if (filter.getOperationType() == posting.getOperationType() && filter.getPublicationType() == posting.getPublicationType()) {
            if (filter.getContacted() ==posting.getContacted() && filter.getFavorite()==posting.getFavorite() && filter.getViewed()==posting.getViewed() && filter.getHasWhatsapp()==posting.getHaswhatsapp()) {
                if (posting.getFeature().getRooms() >= filter.getRoomsFrom() && posting.getFeature().getRooms() <= filter.getRoomsTo()) {
                    if (posting.getFeature().getBathrooms() >= filter.getBathroomsFrom() && posting.getFeature().getBathrooms() <= filter.getBathroomsTo()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public List<PostingImpl> postings(FilterImpl filter) throws IOException {
        /**
         * Esta lista contiene todos los Posting generados. Se obtienen al llamar el metodo getFakePostings del objecto UtilsPosting.
         */
        List<PostingImpl> fakePostings = new UtilsPosting().getFakePostings();
        /**
         * Esta lista tendra los postings que concuerden con los filtros.
         */
        List<PostingImpl> filteredFakePostings = new ArrayList<>();
        for (PostingImpl posting : fakePostings) {
            /**
             * En cada instancia del for verificamos si el posting concuerda con el filtro utilizando el metodo searchPostingByFilters. Si este concuerda se lo agrega a la
             * lista de filteredFakePostings.
             */
            if (searchPostingByFilters(filter, posting)) {
                filteredFakePostings.add(posting);
            }
        }
        return filteredFakePostings;
    }
}