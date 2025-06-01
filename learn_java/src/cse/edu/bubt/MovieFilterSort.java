// Import necessary classes for list operations and sorting
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MovieFilterSort {

    // Movie class with title, genre, and rating attributes
    static class Movie {

        String title;
        String genre;
        double rating;

        // Constructor to initialize a movie
        public Movie(String title, String genre, double rating) {
            this.title = title;
            this.genre = genre;
            this.rating = rating;
        }

        // Method to display a movie's details
        public void display() {
            System.out.println("Title: " + title + " | Genre: " + genre + " | Rating: " + rating);
        }
    }

    public static void main(String[] args) {

        // Create an ArrayList to store Movie objects
        ArrayList<Movie> movies = new ArrayList<>();

        // Add 5 movies to the list
        movies.add(new Movie("John Wick", "Action", 8.5));
        movies.add(new Movie("Avengers: Endgame", "Action", 8.4));
        movies.add(new Movie("The Godfather", "Crime", 9.2));
        movies.add(new Movie("Inception", "Sci-Fi", 8.8));
        movies.add(new Movie("Mad Max: Fury Road", "Action", 8.1));

        // Create a new list to store filtered movies
        ArrayList<Movie> filteredMovies = new ArrayList<>();

        // Filter: all action movies with rating > 8.0
        for (Movie m : movies) {
            if (m.genre.equalsIgnoreCase("Action") && m.rating > 8.0) {
                filteredMovies.add(m);
            }
        }

        // Sort filtered movies in descending order of rating

        Collections.sort(filteredMovies, new Comparator<Movie>() {
            @Override
            public int compare(Movie m1, Movie m2) {
                // Sort in descending order
                return Double.compare(m2.rating, m1.rating);
            }
        });

        // Display filtered and sorted movies
        System.out.println("Action Movies with Rating > 8.0 (Sorted Descending):");
        for (Movie m : filteredMovies) {
            m.display();
        }
    }
}
