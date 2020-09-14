package com.company;

import java.util.Random;
import java.util.concurrent.CompletableFuture;

public class Airline {
    public CompletableFuture<Quote> getQuote(String website){
        return CompletableFuture.supplyAsync(() -> {

            float price = 100 + new Random().nextFloat();
            return new Quote(website, price);
        });
    }
}
