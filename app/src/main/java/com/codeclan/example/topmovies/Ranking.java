package com.codeclan.example.topmovies;

import java.util.ArrayList;

/**
 * Created by irma on 22/05/2017.
 */

public class Ranking {

    private ArrayList<Movie> topMovies;


    public Ranking(ArrayList<Movie> topMovies) {
        this.topMovies = topMovies;
    }

    public Ranking() {
        this.topMovies = new ArrayList<>();
        setupDefaultMovies();
    }

    private void setupDefaultMovies() {
        Movie movie1 = new Movie("The Godfather", "Drama", 1);
        Movie movie2 = new Movie("The Shawshank Redemption", "Crime", 2);

        Movie[] defaultMovies = {
                movie1,
                movie2
        };
        for (Movie topMovie : defaultMovies) {
            this.topMovies.add(topMovie);
        }
    }

  public ArrayList<Movie> getMovies() {
      return new ArrayList<>(this.topMovies);
  }

}
