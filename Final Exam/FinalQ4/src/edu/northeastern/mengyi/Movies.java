package edu.northeastern.mengyi;

//Create a class of Netflix that has list of Genre. Genre class has list of Movie. Movie class has Title of
//movie, Release date, List of actors, Director

import java.util.GregorianCalendar;
import java.util.List;
import java.util.PriorityQueue;

public class Movies {
    String Title;
    GregorianCalendar ReleaseDate;
    String actors;
    int director;

    public Movies(String Title, GregorianCalendar ReleaseDate, String actors, int director) {
        this.Title = Title;
        this.ReleaseDate = ReleaseDate;
        this.actors = actors;
        this.director = director;
    }

    public GregorianCalendar getReleaseDate(){
        return ReleaseDate;
    }

    public String setTitle (String Title){
        this.Title = Title;
        return Title;
    }

    public PriorityQueue<Movies> sortByTitle(List<Movies> movies) {
        PriorityQueue<Movies> pq = new PriorityQueue<>((n1, n2) -> n1.setTitle(Title).compareTo(n2.setTitle(Title)));
        for (Movies movie : movies) {
            pq.offer(movie);
        }
        return pq;
    }

    public PriorityQueue<Movies> sortByDate(List<Movies> movies) {
        PriorityQueue<Movies> pq = new PriorityQueue<>((n1, n2) -> n1.getReleaseDate().compareTo(n2.getReleaseDate()));
        for (Movies movie : movies) {
            pq.offer(movie);
        }
        return pq;
    }
}
