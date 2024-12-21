package org.blue.dwbackendmysql.Entity;

public class Product {
    private String productAsin;
    private int movieId;
    private String cost;
    private float grade;
    private String format;

    public Product(String productAsin, int movieId, String cost, float grade, String format) {
        this.productAsin = productAsin;
        this.movieId = movieId;
        this.cost = cost;
        this.grade = grade;
        this.format = format;
    }
}
