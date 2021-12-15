package edu.northeastern.mengyi;

import java.util.List;

public class Netflix {
    private List<Genre> Netflix;
    private final List<Genre> genres;

    public Netflix(List<Genre> neftlix, List<Genre> genres) {
        this.Netflix = neftlix;
        this.genres = genres;
    }
    Netflix(List<Genre> genres) {
        this.genres = genres;
    }

    public List<Genre> getGenres() {
        return genres;
    }
}

