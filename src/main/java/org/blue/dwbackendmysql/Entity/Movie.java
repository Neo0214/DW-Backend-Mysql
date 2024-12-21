package org.blue.dwbackendmysql.Entity;

public class Movie {
    private int movieId;
    private String movieName;
    private int runTime;
    private int commentNum;
    private String type;
    private float grade;
    private int year;
    private int month;
    private int day;

    public Movie(int movieId, String movieName, int runTime, int commentNum, String type, float grade, int year, int month, int day) {
        this.movieId = movieId;
        this.movieName = movieName;
        this.runTime = runTime;
        this.commentNum = commentNum;
        this.type = type;
        this.grade = grade;
        this.year = year;
        this.month = month;
        this.day = day;
    }

}
