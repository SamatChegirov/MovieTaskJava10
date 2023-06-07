package movie.service.impl;

import movie.model.Movie;
import movie.service.SortableService;

import java.util.Comparator;
import java.util.List;

public class SortServiceImpl implements SortableService {


    @Override
    public void sortByMovieName(List<Movie> movies) {
        movies.sort(sortMovieName);
        for (Movie m: movies){
            System.out.println("Movie name: " + m.getName());
        }

    }

    @Override
    public void sortByYear(List<Movie> movies) {
        movies.sort(sortMovieYear);
        for (Movie m : movies){
            System.out.println("Release year: " + m.getYear());
        }
    }

    @Override
    public void sortByDirector(List<Movie> movies) {
        movies.sort(sortMovieDirector);
        for (Movie m : movies){
            System.out.println("Director: " + m.getDirector());
        }
    }


    public static Comparator<Movie> sortMovieName = new Comparator<Movie>() {
        @Override
        public int compare(Movie o1, Movie o2) {
            return o1.getName().compareTo(o2.getName());
        }
    };

    public static Comparator<Movie> sortMovieYear = new Comparator<Movie>() {
        @Override
        public int compare(Movie o1, Movie o2) {
            return o1.getYear() - (o2.getYear());
        }
    };

    public static Comparator<Movie> sortMovieDirector = new Comparator<Movie>() {
        @Override
        public int compare(Movie o1, Movie o2) {
            return o1.getDirector().getName().compareTo(o2.getDirector().getName());
        }
    };
}
