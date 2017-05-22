package com.codeclan.example.topmovies;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by irma on 22/05/2017.
 */

public class MovieTest {

    @Test
    public void canGetMovieTitle() {
        Movie movie = new Movie("The Godfather", "Drama", 1);
        assertEquals("The Godfather", movie.getTitle());
    }

    @Test
    public void canGetMovieGenre() {
        Movie movie = new Movie("The Godfather", "Drama", 1);
        assertEquals("Drama", movie.getGenre());
    }

    @Test
    public void canGetCurrentRanking() {
        Movie movie = new Movie("The Godfather", "Drama", 1);
        assertEquals(1, movie.getRank());
    }

    @Test
    public void canReturnMovieDetails() {
        Movie movie = new Movie("The Godfather", "Drama", 1);
        assertEquals("Title: 'The Godfather', Genre: 'Drama', Ranking: 1", movie.toString());
    }
}
