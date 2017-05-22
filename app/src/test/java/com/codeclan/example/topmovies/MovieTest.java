package com.codeclan.example.topmovies;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by irma on 22/05/2017.
 */

public class MovieTest {

    @Test
    public void canGetMovieTitle() {
        Movie movie = new Movie("The Godfather", "Drama");
        assertEquals("The Godfather", movie.getTitle());
    }

    @Test
    public void canGetMovieGenre() {
        Movie movie = new Movie("The Godfather", "Drama");
        assertEquals("Drama", movie.getGenre());
    }
}
