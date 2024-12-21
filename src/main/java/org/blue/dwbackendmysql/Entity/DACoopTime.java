package org.blue.dwbackendmysql.Entity;

public class DACoopTime {
    private int directId;
    private int actId;
    private String type;
    private int num;
    private String movieId;

    public DACoopTime(int directId, int actId, String type, int num, String movieId) {
        this.directId = directId;
        this.actId = actId;
        this.type = type;
        this.num = num;
        this.movieId = movieId;
    }
}
