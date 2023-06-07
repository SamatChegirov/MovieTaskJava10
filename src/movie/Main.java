package movie;

import movie.model.Cast;
import movie.model.Director;
import movie.model.Movie;
import movie.service.impl.FindableServiceImpl;
import movie.service.impl.SortServiceImpl;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        FindableServiceImpl findableService = new FindableServiceImpl();
        SortServiceImpl sortService = new SortServiceImpl();


        //System.out.println("====================Fast X==========================");
        Cast vin = new Cast("Vin Diesel", "Dominik Toretto");
        Cast michelle = new Cast("Michelle Rodriguez", "Rodriguez");
        Cast tyrese  = new Cast("Tyrese Gibson", "Gibson");
        Cast jason = new Cast(" Jason Statham", " Statham");

        List<Cast> fastx = new LinkedList<>();
        fastx.add(vin);
        fastx.add(michelle);
        fastx.add(tyrese);
        fastx.add(jason);
        Director Louis = new Director("Louis", "Leterrier");

        //System.out.println("====================Titanic==========================");
        Cast leonardo = new Cast("Leonardo DiCaprio", "Jack Dawson");
        Cast kate = new Cast("Kate Winslet", "Rose Dewitt Bukater");
        Cast billy  = new Cast("Billy Zane", "Cal Hockley");
        Cast cal = new Cast("Cal Hockley", "Molly Brown");

        List<Cast> titanic = new LinkedList<>();
        titanic.add(leonardo);
        titanic.add(kate);
        titanic.add(billy);
        titanic.add(cal);
        Director James = new Director("James", "Cameron");

        //System.out.println("====================Terminator==========================");
        Cast arnold = new Cast(" Arnold Schwarzenegge", "Terminator");
        Cast linda = new Cast("Linda Hamilton", "Sarah Connor ");
        Cast michael  = new Cast("Michael Biehn", "Kyle Reese");
        Cast paul = new Cast("Paul Winfield", "Molly Brown");

        List<Cast> terminator = new LinkedList<>();
        terminator.add(arnold);
        terminator.add(linda);
        terminator.add(michael);
        terminator.add(paul);
        Director JamesT = new Director("James", "Cameron");

        //System.out.println("====================Brigada==========================");
        Cast sergei = new Cast("Sergei Bezrukov", "Sasha belyi");
        Cast dmitri = new Cast("Dmitri Dyuzhev", "Kosmos");
        Cast vladimir  = new Cast("Vladimir Vdovichenkov", "Fil");
        Cast pavel = new Cast("Pavel Maykov", "Pchelka");

        List<Cast> brigada = new LinkedList<>();
        brigada.add(sergei);
        brigada.add(dmitri);
        brigada.add(vladimir);
        brigada.add(pavel);

        Director Aleksey = new Director("Aleksey", "Sidorov");

        //System.out.println("====================Lion King==========================");
        Cast jonatan = new Cast("Jonathan Taylor Thomas", "Jonathan Taylor Thomas");
        Cast matthew = new Cast("Matthew Broderick", "Matthew Broderick");
        Cast james  = new Cast("James Earl Jones", "James Earl Jones");
        Cast jeremy = new Cast("Jeremy Irons", "Jeremy Irons");

        List<Cast> lionKing = new LinkedList<>();
        lionKing.add(jonatan);
        lionKing.add(matthew);
        lionKing.add(james);
        lionKing.add(jeremy);

        Director Roger = new Director("Roger", "Allers");



        Movie Titanic = new Movie("Titanic", 1997, "Melodrama", James, titanic);
        Movie FastX = new Movie("Fast X", 2023, "Detective", Louis, fastx);
        Movie Terminator = new Movie("Terminator", 1984, "Fantastic", JamesT, terminator);
        Movie Brigada = new Movie("Brigada", 2002, "Action", Aleksey, brigada);
        Movie LionKing = new Movie("Lion King", 2019, "Animation drama", Roger, lionKing);

        List<Movie> movies = new LinkedList<>();
        movies.add(FastX);
        movies.add(Titanic);
        movies.add(Terminator);
        movies.add(Brigada);
        movies.add(LionKing);

        try {
            while (true) {
                System.out.println("""
                        
                        ===============Choose a team====================
                        Choose -1- Find all movies.
                        Choose -2- Find Movie by full name or part name.
                        Choose -3- Find Movie by actor name.
                        Choose -4- Find Movie by year.
                        Choose -5- Find Movie by director.
                        Choose -6- Find Movie by genre.
                        Choose -7- Find Movie by role.
                        Choose -8- Sort by Movie name.
                        Choose -9- Sort by year.
                        Choose -10- Sort by director.
                        ================================================""");


/*                int i = new Scanner(System.in).nextInt();
                switch (i) {
                    case 1 -> System.out.println(findableService.getAllMovies(movies));
                    case 2 -> findableService.findMovieByFullNameOrPartName(movies);
                    case 3 -> findableService.findMovieByActorName(movies);
                    case 4 -> findableService.findMovieByYear(movies);
                    case 5 -> findableService.findMovieByDirector(movies);
                    case 6 -> findableService.findMovieByGenre(movies);
                    case 7 -> findableService.findMovieByRole(movies);
                    case 8 -> sortService.sortByMovieName(movies);
                    case 9 -> sortService.sortByYear(movies);
                    case 10 -> sortService.sortByDirector(movies);
                }*/
                int i = new Scanner(System.in).nextInt();
                if (i == 1) {
                    System.out.println(findableService.getAllMovies(movies));
                } else if (i == 2) {
                    findableService.findMovieByFullNameOrPartName(movies);
                } else if (i == 3) {
                    findableService.findMovieByActorName(movies);
                } else if (i == 4) {
                    findableService.findMovieByYear(movies);
                } else if (i == 5) {
                    findableService.findMovieByDirector(movies);
                } else if (i == 6) {
                    findableService.findMovieByGenre(movies);
                } else if (i == 7) {
                    findableService.findMovieByRole(movies);
                }else if (i == 8) {
                    sortService.sortByMovieName(movies);
                }else if (i == 9) {
                    sortService.sortByYear(movies);
                }else if (i == 10) {
                    sortService.sortByDirector(movies);
                }else {
                    System.out.println("There is not such command!!!");
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}