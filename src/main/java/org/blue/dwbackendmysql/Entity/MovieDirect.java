package org.blue.dwbackendmysql.Entity;

public class MovieDirect {
    private int movieId;
    private int directorId;

    public MovieDirect(int movieId, int directorId) {
        this.movieId = movieId;
        this.directorId = directorId;
    }
}
