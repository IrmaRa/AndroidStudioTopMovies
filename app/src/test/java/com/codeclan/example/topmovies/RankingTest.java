package com.codeclan.example.topmovies;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by irma on 22/05/2017.
 */

public class RankingTest {

    @Test
    public void topMoviesAreNotNull() {
        Ranking ranking = new Ranking();
        assertNotNull(ranking.getMovies());
    }

    @Test
    public void hasTwoMoviesByDefault() {
        Ranking ranking = new Ranking();
        assertEquals(10, ranking.getNumberOfMovies());
    }

    @Test
    public void canGetAnswerAtIndex() {
        Ranking ranking = new Ranking();
        Movie topMovie = ranking.getMoviesAtIndex(0);
        assertEquals("The Godfather", topMovie.getTitle());
    }

    @Test
    public void canReplaceLastMovie() {
        Ranking ranking = new Ranking();
        Movie topMovie = new Movie("Home Alone", "Comedy", 10);
        assertEquals("Home Alone", ranking.replaceMovie(topMovie));

    }

}
