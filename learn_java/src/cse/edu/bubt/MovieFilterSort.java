
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MovieFilterSort {


    static class Movie {

        String title;
        String genre;
        double rating;


        public Movie(String title, String genre, double rating) {
            this.title = title;
            this.genre = genre;
            this.rating = rating;
        }


        public void display() {
            System.out.println("Title: " + title + " | Genre: " + genre + " | Rating: " + rating);
        }
    }

    public static void main(String[] args) {


        ArrayList<Movie> movies = new ArrayList<>();


        movies.add(new Movie("John Wick", "Action", 8.5));
        movies.add(new Movie("Avengers: Endgame", "Action", 8.4));
        movies.add(new Movie("The Godfather", "Crime", 9.2));
        movies.add(new Movie("Inception", "Sci-Fi", 8.8));
        movies.add(new Movie("Mad Max: Fury Road", "Action", 8.1));


        ArrayList<Movie> filteredMovies = new ArrayList<>();


        for (Movie m : movies) {
            if (m.genre.equalsIgnoreCase("Action") && m.rating > 8.0) {
                filteredMovies.add(m);
            }
        }



        Collections.sort(filteredMovies, new Comparator<Movie>() {
            @Override
            public int compare(Movie m1, Movie m2) {
                // Sort in descending order
                return Double.compare(m2.rating, m1.rating);
            }
        });


        System.out.println("Action Movies with Rating > 8.0 (Sorted Descending):");
        for (Movie m : filteredMovies) {
            m.display();
        }
    }
}
