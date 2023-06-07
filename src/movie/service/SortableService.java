package movie.service;

import movie.model.Movie;

import java.util.List;

public interface SortableService {


    void sortByMovieName(List<Movie> movies);

//-from A to Z
//
//-from Z to A

    void sortByYear(List<Movie>movies);

//-Ascending
//
//-Descending

    void sortByDirector(List<Movie>movies);
}
