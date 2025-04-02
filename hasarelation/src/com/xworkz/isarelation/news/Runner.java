package com.xworkz.isarelation.news;

public class Runner {
        public static void main(String[] args) {
            System.out.println("Creating an instance of News");
            News news = new News();
            news.report();
            news.broadcast();
            news.publish();
            news.update();
            news.analyze();

            System.out.println("\nCreating an instance of BreakingNews using News reference");
            News newsRef = new BreakingNews();
            newsRef.report();
            newsRef.broadcast();
            newsRef.publish();
            newsRef.update();
            newsRef.analyze();

            System.out.println("\nCreating an instance of BreakingNews using subclass reference");
            BreakingNews breakingNews = new BreakingNews();
            breakingNews.report();
            breakingNews.broadcast();
            breakingNews.publish();
            breakingNews.update();
            breakingNews.analyze();
            breakingNews.alertPublic();
            breakingNews.liveCoverage();
            breakingNews.factCheck();
            breakingNews.interviewExperts();
            breakingNews.socialMediaUpdates();
        }
    }

