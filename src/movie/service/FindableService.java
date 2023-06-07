package movie.service;

import movie.model.Movie;

import java.util.List;

public interface FindableService {

    List<Movie> getAllMovies(List<Movie> movies);

    void findMovieByFullNameOrPartName(List<Movie> movies);

    void findMovieByActorName(List<Movie> movies);

    void findMovieByYear(List<Movie> movies);

    void findMovieByDirector(List<Movie> movies);

    void findMovieByGenre(List<Movie> movies);

    void findMovieByRole(List<Movie> movies);
}
