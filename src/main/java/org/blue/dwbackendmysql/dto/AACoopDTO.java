package org.blue.dwbackendmysql.dto;

public class AACoopDTO {
    private String actorNameFirst;
    private String actorNameSecond;
    private int num;

    public AACoopDTO(String actorNameFirst, String actorNameSecond, int num) {
        this.actorNameFirst = actorNameFirst;
        this.actorNameSecond = actorNameSecond;
        this.num = num;
    }

    public String getActorNameFirst() {
        return actorNameFirst;
    }

    public void setActorNameFirst(String actorNameFirst) {
        this.actorNameFirst = actorNameFirst;
    }

    public String getActorNameSecond() {
        return actorNameSecond;
    }

    public void setActorNameSecond(String actorNameSecond) {
        this.actorNameSecond = actorNameSecond;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
