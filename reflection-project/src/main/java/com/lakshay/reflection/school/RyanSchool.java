package com.lakshay.reflection.school;

import com.lakshay.reflection.facilities.Administration;
import com.lakshay.reflection.facilities.Playground;
import com.lakshay.reflection.facilities.Theatre;

/**
 * Created by lakshay on 11/12/16.
 */
public class RyanSchool {

    private Administration admin1;
    private Administration admin2;
    private Playground playground1;
    private Playground Playground2;
    private Theatre theatre;

    public Administration getAdmin1() {
        return admin1;
    }

    public void setAdmin1(Administration admin1) {
        this.admin1 = admin1;
    }

    public Administration getAdmin2() {
        return admin2;
    }

    public void setAdmin2(Administration admin2) {
        this.admin2 = admin2;
    }

    public Playground getPlayground1() {
        return playground1;
    }

    public void setPlayground1(Playground playground1) {
        this.playground1 = playground1;
    }

    public Playground getPlayground2() {
        return Playground2;
    }

    public void setPlayground2(Playground playground2) {
        Playground2 = playground2;
    }

    public Theatre getTheatre() {
        return theatre;
    }

    public void setTheatre(Theatre theatre) {
        this.theatre = theatre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RyanSchool ryanSchool = (RyanSchool) o;

        if (!admin1.equals(ryanSchool.admin1)) return false;
        if (!admin2.equals(ryanSchool.admin2)) return false;
        if (!playground1.equals(ryanSchool.playground1)) return false;
        if (!Playground2.equals(ryanSchool.Playground2)) return false;
        return theatre.equals(ryanSchool.theatre);

    }

    @Override
    public int hashCode() {
        int result = admin1.hashCode();
        result = 31 * result + admin2.hashCode();
        result = 31 * result + playground1.hashCode();
        result = 31 * result + Playground2.hashCode();
        result = 31 * result + theatre.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "RyanSchool{" +
                "admin1=" + admin1 +
                ", admin2=" + admin2 +
                ", playground1=" + playground1 +
                ", Playground2=" + Playground2 +
                ", theatre=" + theatre +
                '}';
    }
}
