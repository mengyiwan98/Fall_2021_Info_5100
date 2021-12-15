package edu.northeastern.mengyi;

import java.util.ArrayList;
import java.util.*;
import java.util.GregorianCalendar;

public class Main {

    public static void main(String[] args) throws Exception {
        Netflix netflix = new Netflix(new ArrayList<>());

        netflix.getGenres().stream().
                flatMap(genre -> genre.getMovies().stream()).
                filter(movie -> movie.getReleaseDate().before(new GregorianCalendar(2000, Calendar.JANUARY, 1).getTime())).
                forEach(movie -> movie.setTitle(String.format("%s (Classic)", movie.setTitle(movie.Title))));

        List<Movies> latestThree = netflix.getGenres().stream().flatMap(genre -> genre.getMovies().stream()).sorted((movie1, movie2) -> movie2.getReleaseDate().compareTo(movie1.getReleaseDate())).limit(3).toList();
        System.out.println("Latest 3 movies");
        for (Movies m : latestThree) {
            System.out.println(m);
        }

        Predicate<Movie> predicate1 = m -> m.getReleaseDate().getYear() + 1900 < 2000;
        Predicate<Movie> predicate2 = m -> m.getReleaseDate().getYear() + 1900 > 1990;
        List<Movie> problem3 = netflix.getGenres().stream()
                .flatMap(genre -> genre.getMovies().stream().filter(predicate1.and(predicate2)))
                .collect(Collectors.toList());
        System.out.println("between 1990 and 2000");
        for (Movies m : between 1990 and 2000) {
            System.out.println(m);
        }

        List<String> titles = netflix.getGenres().stream().flatMap(genre -> genre.getMovies().stream())
                .map(movie -> {
                    movie.setTitle(String.format("%s %d", movie.setTitle(movie.Title), movie.getReleaseDate()));
                    return movie.setTitle(movie.Title);
                }).toList();
        System.out.println("Title and year");
        for (String t : titles) {
            System.out.println(t);
        }

        List<Movies> sortedMovies = netflix.getGenres().stream().flatMap(genre -> genre.getMovies().stream())
                .sorted(Comparator.comparing(Movies::getReleaseDate)).toList();
        System.out.println("Sorted by Released year");
        for (Movies m : sortedMovies) {
            System.out.println(m);
        }

        Date date1 = new GregorianCalendar(1991, Calendar.SEPTEMBER, 11).getTime();
        Date date2 = new GregorianCalendar(1995, Calendar.APRIL, 22).getTime();
        Date date3 = new GregorianCalendar(1999, Calendar.FEBRUARY, 03).getTime();
        Date date4 = new GregorianCalendar(2001, Calendar.OCTOBER, 17).getTime();
        Date date5 = new GregorianCalendar(2004, Calendar.DECEMBER, 28).getTime();
    }
}
