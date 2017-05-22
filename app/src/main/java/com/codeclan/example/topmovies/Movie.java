package com.codeclan.example.topmovies;

/**
 * Created by irma on 22/05/2017.
 */

public class Movie {
    private String title;
    private String genre;
    private int rank;

    public Movie(String title, String genre, int rank) {
        this.title = title;
        this.genre = genre;
        this.rank = rank;
    }


    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public int getRank() {
        return rank;
    }
}
