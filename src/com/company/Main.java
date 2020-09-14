package com.company;

import java.util.concurrent.CompletableFuture;

public class Main {

    public static void main(String[] args) {
       Airline delta = new Airline();
       delta.getQuote("Delta.com")
            .thenAccept(quote -> System.out.println(quote.getQuote()));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
