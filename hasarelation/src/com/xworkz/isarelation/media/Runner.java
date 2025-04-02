package com.xworkz.isarelation.media;

public class Runner {

        public static void main(String[] args) {
            System.out.println("Creating an instance of Media");
            Media media = new Media();
            media.broadcast();
            media.publish();
            media.entertain();
            media.educate();
            media.inform();

            System.out.println("\nCreating an instance of SocialMedia using Media reference");
            Media mediaRef = new SocialMedia();
            mediaRef.broadcast();
            mediaRef.publish();
            mediaRef.entertain();
            mediaRef.educate();
            mediaRef.inform();

            System.out.println("\nCreating an instance of SocialMedia using subclass reference");
            SocialMedia socialMedia = new SocialMedia();
            socialMedia.broadcast();
            socialMedia.publish();
            socialMedia.entertain();
            socialMedia.educate();
            socialMedia.inform();
            socialMedia.connectPeople();
            socialMedia.sharePosts();
            socialMedia.goLive();
            socialMedia.likeAndComment();
            socialMedia.monetizeContent();
        }
    }

