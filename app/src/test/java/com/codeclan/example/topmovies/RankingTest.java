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
        assertEquals(2, ranking.getNumberOfMovies());
    }

}
