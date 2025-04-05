package com.xworkz.isarelation.news;
public class Runner {
    public static void main(String[] args) {

        System.out.println("\nCreating an instance of News");
        News news = new News();
        news.publish();
        news.read();
        news.print();
        news.displayHeadline();

        System.out.println("\nCreating an instance of OnlineNews using News reference");
        News newsRef = new OnlineNews();
        newsRef.publish();
        newsRef.read();
        newsRef.print();
        newsRef.displayHeadline();

        System.out.println("\nCreating an instance of OnlineNews using subclass reference");
        OnlineNews onlineNews = new OnlineNews();
        onlineNews.publish();
        onlineNews.read();
        onlineNews.print();
        onlineNews.displayHeadline();
    }
}
