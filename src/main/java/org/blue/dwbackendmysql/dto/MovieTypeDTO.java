package org.blue.dwbackendmysql.dto;

public class MovieTypeDTO {
    private String movieName;
    private int runTime;
    private Integer commentNum;
    private String type;
    private Float grade;
    private Integer year;
    private Integer month;
    private Integer day;
    private String format;

    public MovieTypeDTO(String movieName, int runTime, Integer commentNum, String type, Float grade, Integer year, Integer month, Integer day, String format) {
        this.movieName = movieName;
        this.runTime = runTime;
        this.commentNum = commentNum != null ? commentNum : 0;
        this.type = type;
        this.grade = grade != null ? grade : 0;
        this.year = year != null ? year : 0;
        this.month = month != null ? month : 0;
        this.day = day != null ? day : 0;
        this.format = format;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public int getRunTime() {
        return runTime;
    }

    public void setRunTime(int runTime) {
        this.runTime = runTime;
    }

    public Integer getCommentNum() {
        return commentNum;
    }

    public void setCommentNum(Integer commentNum) {
        this.commentNum = commentNum;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Float getGrade() {
        return grade;
    }

    public void setGrade(Float grade) {
        this.grade = grade;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public Integer getDay() {
        return day;
    }

    public void setDay(Integer day) {
        this.day = day;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }
}
