package org.blue.dwbackendmysql.Entity;


import lombok.*;

/*
 * @author Neo0214
 */
@Data
public class Test {
    private int atmAcc;

    public int getAtmAcc() {
        return atmAcc;
    }

    public void setAtmAcc(int atmAcc) {
        this.atmAcc = atmAcc;
    }
}
