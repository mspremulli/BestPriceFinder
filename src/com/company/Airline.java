package com.company;

import java.util.Random;
import java.util.concurrent.CompletableFuture;

public class Airline {
    private String website;

    public void setWebsite(String website) {
        this.website = website;
    }
    public CompletableFuture<Quote> getQuote(){
        return CompletableFuture.supplyAsync(() -> {

            float price = 100 + new Random().nextFloat();
            return new Quote(website, price);
        });
    }
}
