package com.xworkz.isarelation.news;

public class OnlineNews extends News {

    public OnlineNews() {
        super();
        System.out.println("OnlineNews constructor is running - subclass");
    }

    @Override
    public void publish() {
        System.out.println("Publishing online breaking news - subclass");
    }

    @Override
    public void read() {
        System.out.println("Reading news on mobile app - subclass");
    }

    @Override
    public void print() {
        System.out.println("Online news does not require printing - subclass");
    }

    @Override
    public void displayHeadline() {
        System.out.println("OnlineNews displays headlines with videos - subclass");
    }
}
