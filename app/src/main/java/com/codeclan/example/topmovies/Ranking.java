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
        Movie movie3 = new Movie("Schindlers List", "Drama", 3);
        Movie movie4 = new Movie("Raging Bull", "Drama", 4);
        Movie movie5 = new Movie("Casablanca", "Romance", 5);
        Movie movie6 = new Movie("Citizen Kane", "Drama", 6);
        Movie movie7 = new Movie("Gone with the Wind", "Romance", 7);
        Movie movie8 = new Movie("The Wizard of Oz", "Fantasy", 8);
        Movie movie9 = new Movie("One Flew Over the Cuckoos Nest", "Drama", 9);
        Movie movie10 = new Movie("Lawrence of Arabia", "History", 10);

        Movie[] defaultMovies = {
                movie1, movie2, movie3, movie4, movie5,
                movie6, movie7, movie8, movie9, movie10
        };
        for (Movie topMovie : defaultMovies) {
            this.topMovies.add(topMovie);
        }
    }

  public ArrayList<Movie> getMovies() {
      return new ArrayList<>(this.topMovies);
  }

    public int getNumberOfMovies() {
        return this.topMovies.size();
    }

    public Movie getMoviesAtIndex(int i) {
        return this.topMovies.get(i);
    }

    public String replaceMovie(Movie topMovie) {
        Movie movie10 = topMovie;
        return topMovie.getTitle();
    }
}
