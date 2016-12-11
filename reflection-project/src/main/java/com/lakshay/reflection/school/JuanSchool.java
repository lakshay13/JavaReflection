package com.lakshay.reflection.school;

import com.lakshay.reflection.facilities.Administration;
import com.lakshay.reflection.facilities.Playground;
import com.lakshay.reflection.facilities.Theatre;

/**
 * Created by lakshay suri on 11/12/16.
 */
public class JuanSchool {

    private Administration admin1;
    private Playground playground1;
    private Theatre theatre1;
    private Theatre theatre2;

    public Administration getAdmin1() {
        return admin1;
    }

    public void setAdmin1(Administration admin1) {
        this.admin1 = admin1;
    }

    public Playground getPlayground1() {
        return playground1;
    }

    public void setPlayground1(Playground playground1) {
        this.playground1 = playground1;
    }

    public Theatre getTheatre1() {
        return theatre1;
    }

    public void setTheatre1(Theatre theatre1) {
        this.theatre1 = theatre1;
    }

    public Theatre getTheatre2() {
        return theatre2;
    }

    public void setTheatre2(Theatre theatre2) {
        this.theatre2 = theatre2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        JuanSchool juanSchool = (JuanSchool) o;

        if (!admin1.equals(juanSchool.admin1)) return false;
        if (!playground1.equals(juanSchool.playground1)) return false;
        if (!theatre1.equals(juanSchool.theatre1)) return false;
        return theatre2.equals(juanSchool.theatre2);

    }

    @Override
    public int hashCode() {
        int result = admin1.hashCode();
        result = 31 * result + playground1.hashCode();
        result = 31 * result + theatre1.hashCode();
        result = 31 * result + theatre2.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "JuanSchool{" +
                "admin1=" + admin1 +
                ", playground1=" + playground1 +
                ", theatre1=" + theatre1 +
                ", theatre2=" + theatre2 +
                '}';
    }
}
