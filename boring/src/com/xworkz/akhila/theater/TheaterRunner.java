package com.xworkz.akhila.theater;

public class TheaterRunner {
    public static void main(String[] args) {
        Movie movie = new Movie();
        Theater theater = new Theater();
        theater.show(movie);
    }
}
