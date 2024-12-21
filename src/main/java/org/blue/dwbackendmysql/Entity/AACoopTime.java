package org.blue.dwbackendmysql.Entity;

import java.util.ArrayList;

public class AACoopTime {
    private int firstActId;
    private int secondActId;
    private String type;
    private int num;
    private String movieId;

    public AACoopTime(int firstActId, int secondActId, String type, int num, String movieId) {
        this.firstActId = firstActId;
        this.secondActId = secondActId;
        this.type = type;
        this.num = num;
        this.movieId = movieId;
    }
}
