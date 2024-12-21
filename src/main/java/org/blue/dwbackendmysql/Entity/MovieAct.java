package org.blue.dwbackendmysql.Entity;

public class MovieAct {
    private int movieId;
    private int userId;
    private String isStarring;

    public MovieAct(int movieId, int userId, String isStarring) {
        this.movieId = movieId;
        this.userId = userId;
        this.isStarring = isStarring;
    }
}
