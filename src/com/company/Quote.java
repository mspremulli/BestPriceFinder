package com.company;

public class Quote {
    private String website;
    private float price;

    public Quote(String website, float price) {
        this.website = website;
        this.price = price;
    }

    private String getWebsite() {
        return website;
    }

    private float getPrice() {
        return price;
    }

    public void printQuote(){
        System.out.println("Quote{site="+ getWebsite() + ", price:" + getPrice() + "}");
    }

}
