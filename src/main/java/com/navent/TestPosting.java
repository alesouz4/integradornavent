package com.navent;

import com.navent.implementations.PostingImpl;
import com.navent.utils.UtilsPosting;

import java.io.IOException;
import java.util.List;

public class TestPosting {
    public static void main(String[] args) throws IOException {
        UtilsPosting util = new UtilsPosting();

        util.generateFakePostings();
     //Read
//        List<PostingImpl> posting=util.getFakePosting();
//        for (PostingImpl post:posting){
//            System.out.println(post.toString());
//        }
    }

}