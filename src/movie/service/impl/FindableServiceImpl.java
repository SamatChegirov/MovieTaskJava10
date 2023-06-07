package movie.service.impl;

import movie.model.Cast;
import movie.model.Director;
import movie.model.Movie;
import movie.service.FindableService;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindableServiceImpl implements FindableService {


    Scanner scanner = new Scanner(System.in);

    @Override
    public List<Movie> getAllMovies(List<Movie> movies) {
        System.out.print("+++++++++++++++++ ALL MOVIES ++++++++++++++++++++");
        for (Movie m : movies) {
            System.out.println(m);
            System.out.print("++++++++++++++++++++++++++++++++++++++++++++++++");
        }
        return null;
    }


    @Override
    public void findMovieByFullNameOrPartName(List<Movie> movies) {

        System.out.println("Find films of name: ");
        String movieName = scanner.nextLine();
        System.out.print("++++++++++++++++++++++++++++++++++++++++++++++++");
        boolean movieFound = false;
        for (Movie m : movies) {
            if (m.getName().toLowerCase().contains(movieName.toLowerCase()) || m.getName().toUpperCase().contains(movieName.toUpperCase())) {
                System.out.println(m);
                movieFound = true;
                break;
            }
        }
        if (!movieFound) {
            System.out.println("No movie found for Actor name: " + movieName);
        }
        System.out.print("++++++++++++++++++++++++++++++++++++++++++++++++");
    }

/*    @Override
    public void findMovieByActorName(List<Movie> movies) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя актера: ");
        String actorName = scanner.nextLine();
        System.out.println("Ожидание команды...");

        while (true) {
            String command = scanner.nextLine();
            if (command.equalsIgnoreCase("search")) {
                System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
                boolean movieFound = false;

                for (Movie movie : movies) {
                    for (Cast cast : movie.getCast()) {
                        if (cast.getActorFullName().toLowerCase().contains(actorName.toLowerCase())) {
                            System.out.println(cast.getActorFullName() + " - " + movie.getName());
                            movieFound = true;
                            break;
                        }
                    }
                }

                if (!movieFound) {
                    System.out.println("Фильмы с актером по имени '" + actorName + "' не найдены");
                }

                System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
                System.out.println("Ожидание команды...");
            } else if (command.equalsIgnoreCase("exit")) {
                System.out.println("Программа завершена.");
                break;
            } else {
                System.out.println("Неизвестная команда. Введите 'search' для поиска фильмов или 'exit' для выхода.");
            }
        }
    }*/


    @Override
    public void findMovieByActorName(List<Movie> movies) {
        System.out.println("Find films by actor name: ");

        String actorName = scanner.nextLine();
        System.out.print("++++++++++++++++++++++++++++++++++++++++++++++++");
        boolean movieFound = false;
        for (Movie m : movies) {
            boolean actorFound = false;
            for (Cast a : m.getCast()) {
                if (a.getActorFullName().toLowerCase().contains(actorName.toLowerCase()) || a.getActorFullName().toUpperCase().contains(actorName.toUpperCase())) {
                    System.out.println(a + " " + m);
                    movieFound = true;
                }
            }
            if (actorFound){
                movieFound = true;
            }
        }
        if (!movieFound) {
            System.out.println("No movie found for Actor name: " + actorName);
        }
        System.out.print("++++++++++++++++++++++++++++++++++++++++++++++++");
    }

    @Override
    public void findMovieByYear(List<Movie> movies) {
        System.out.println("Find movie by release year: ");
        int movieYear = scanner.nextInt();
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
        boolean movieFound = false;
        for (Movie m : movies) {
            if (m.getYear() == movieYear) {
                System.out.println(m);
                movieFound = true;
                break;
            }
        }
        if (!movieFound) {
            System.out.println("No movie found for year: " + movieYear);
        }
        System.out.print("++++++++++++++++++++++++++++++++++++++++++++++++");
    }

    @Override
    public void findMovieByDirector(List<Movie> movies) {
        System.out.println("Find movie by director: ");

        String byDirector = scanner.nextLine();
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
        boolean movieFound = false;

        for (int i = 0; i < movies.size(); i++) {
           if (movies.get(i).getDirector().getName().toLowerCase().contains(byDirector.toLowerCase()) || movies.get(i).getDirector().getName().toUpperCase().contains(byDirector.toUpperCase())) {
               System.out.println("Director: " + movies.get(i).getDirector());
               System.out.println("Movies: \n  Name: " + movies.get(i).getName());
               System.out.println("  Year: " + movies.get(i).getYear());
               System.out.println("  Genre: " + movies.get(i).getGenre());
               System.out.println("Cast: " + movies.get(i).getCast());
               movieFound = true;
           }

        }
        if (!movieFound) {
            System.out.println("No movie found for director: " + byDirector);
        }
        System.out.print("++++++++++++++++++++++++++++++++++++++++++++++++");
    }

    @Override
    public void findMovieByGenre(List<Movie> movies) {
        System.out.println("Find movie by genre: ");
        String byGenre = scanner.nextLine();
        System.out.print("++++++++++++++++++++++++++++++++++++++++++++++++");
        boolean movieFound = false;
        for (Movie m : movies) {
            if (m.getGenre().toLowerCase().contains(byGenre.toLowerCase()) || m.getGenre().toUpperCase().contains(byGenre.toUpperCase())) {
                System.out.println("Genre: " + m.getGenre() + " " + m);
                movieFound = true;
            }

        }
        if (!movieFound) {
            System.out.println("No movie found for genre: " + byGenre);
        }
        System.out.print("++++++++++++++++++++++++++++++++++++++++++++++++");

    }

    @Override
    public void findMovieByRole(List<Movie> movies) {
        System.out.println("Find movie by role: ");
        String byRole = scanner.nextLine();
        System.out.print("++++++++++++++++++++++++++++++++++++++++++++++++");
        boolean movieFound = false;
        for (Movie m : movies) {
            for (Cast c : m.getCast()) {
                if (c.getRole().toLowerCase().contains(byRole.toLowerCase()) || c.getRole().toUpperCase().contains(byRole.toUpperCase())) {
                    System.out.println("Role: " + c.getRole() + " \nActor full name: " + c.getActorFullName() + " " + m);
                    movieFound = true;
                    break;
                }
            }
        }
        if (!movieFound) {
            System.out.println("No movie found for role: " + byRole);
        }
        System.out.print("++++++++++++++++++++++++++++++++++++++++++++++++");

    }
}
