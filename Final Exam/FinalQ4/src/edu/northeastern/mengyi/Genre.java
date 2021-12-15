package edu.northeastern.mengyi;

import java.util.ArrayList;
import java.util.List;

public class Genre {
    private List<Movies> genres;
    private List<Movies> movies;

    public Genre(List<Movies> genres, List<Movies> movies) {
        this.genres = genres;
        this.movies = movies;
    }

    public List<Movies> getGenres() {
        return genres;
    }

    void Genre(List<Movies> movies) {
        this.movies = movies;
    }

    public List<Movies> getMovies() {
        return movies;
    }
}



