package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class AirlineDemo {

    public static void main(String[] args) {

        ArrayList<Airline> airlineList = new ArrayList<>();
        Airline delta = new Airline();
        Airline southwest = new Airline();
        Airline jetBlue = new Airline();

        delta.setWebsite("Delta.com");
        southwest.setWebsite("Southwest.com");
        jetBlue.setWebsite("jetBlue.com");

        airlineList.add(delta);
        airlineList.add(southwest);
        airlineList.add(jetBlue);

        airlineList.forEach(airline -> {
            airline.getQuote()
                    .thenAccept(quote -> System.out.println(quote.getQuote()));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });


    }
}
