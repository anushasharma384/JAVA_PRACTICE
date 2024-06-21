package com.company;
import java.text.SimpleDateFormat;
import java.util.*;

class Movie {
    private String name;
    private Date releaseDate;
    private double rating;

    //constructor of class movie
    public Movie(String name, Date releaseDate, double rating) {
        this.name = name;
        this.releaseDate = releaseDate;
        this.rating = rating;
    }

    //getters of class movie
    public String getName() {
        return name;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public double getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return STR."Movie{name='\{name}\{'\''}, releaseDate=\{releaseDate}, rating=\{rating}\{'}'}";
    }
}

class MovieCollection {
    private List<Movie> movies;

    //constructor of class MovieCollection
    public MovieCollection() {
        this.movies = new ArrayList<>();
    }

    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    public void printMoviesSortedByReleaseDate() {
        Collections.sort(movies, new Comparator<Movie>() {
            @Override
            public int compare(Movie m1, Movie m2) {
                return m1.getReleaseDate().compareTo(m2.getReleaseDate());
            }
        });

        for (Movie movie : movies) {
            System.out.println(movie);
        }
    }

    public static void main(String[] args) {
        MovieCollection movieCollection = new MovieCollection();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of movies:");
        int numberOfMovies = scanner.nextInt();
        scanner.nextLine();  // consume newline

        for (int i = 0; i < numberOfMovies; i++) {
            System.out.println("Enter movie name:");
            String name = scanner.nextLine();

            System.out.println("Enter release date (yyyy-mm-dd):");
            String releaseDateString = scanner.nextLine();
            Date releaseDate = null;
            try {
                releaseDate = new SimpleDateFormat("yyyy-MM-dd").parse(releaseDateString);
            } catch (Exception e) {
                e.printStackTrace();
            }

            System.out.println("Enter rating:");
            double rating = scanner.nextDouble();
            scanner.nextLine();  // consume newline

            movieCollection.addMovie(new Movie(name, releaseDate, rating));
        }

        System.out.println("\nMovies sorted by release date:");
        movieCollection.printMoviesSortedByReleaseDate();
    }
}
