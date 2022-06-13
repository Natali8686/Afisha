package ru.netology;

public class MovieItems {
    private int id;
    private String movieName;
    private String movieGenre;

    public MovieItems() {   // конструктор 1
    }

    public MovieItems(int id, String movieName, String movieGenre) { // конструктор 2
        this.id = id;
        this.movieName = movieName;
        this.movieGenre = movieGenre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieGenre() {
        return movieGenre;
    }

    public void setMovieGenre(String movieGenre) {
        this.movieGenre = movieGenre;
    }
}
