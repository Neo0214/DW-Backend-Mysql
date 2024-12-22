package org.blue.dwbackendmysql.dto;

public class DACoopDTO {
    private String directorName;
    private String actorName;
    private int num;

    public DACoopDTO(String directorName, String actorName, int num) {
        this.directorName = directorName;
        this.actorName = actorName;
        this.num = num;
    }

    public String getDirectorName() {
        return directorName;
    }

    public void setDirectorName(String directorName) {
        this.directorName = directorName;
    }

    public String getActorName() {
        return actorName;
    }

    public void setActorName(String actorName) {
        this.actorName = actorName;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
