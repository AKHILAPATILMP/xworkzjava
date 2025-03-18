package com.xworkz.akhila.theater;

public class Theater {
    void show(Movie movie) {
        if (movie != null) {
            movie.play();
        } else {
            System.out.println("No movie is available to play");
        }
    }
}
