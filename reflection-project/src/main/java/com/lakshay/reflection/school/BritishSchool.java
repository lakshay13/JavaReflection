package com.lakshay.reflection.school;

import com.lakshay.reflection.facilities.Administration;
import com.lakshay.reflection.facilities.Playground;
import com.lakshay.reflection.facilities.Theatre;

/**
 * Created by lakshay on 11/12/16.
 */
public class BritishSchool {

    private Administration admin1;
    private Playground playground1;
    private Theatre theatre;

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

        BritishSchool that = (BritishSchool) o;

        if (!admin1.equals(that.admin1)) return false;
        if (!playground1.equals(that.playground1)) return false;
        return theatre.equals(that.theatre);

    }

    @Override
    public int hashCode() {
        int result = admin1.hashCode();
        result = 31 * result + playground1.hashCode();
        result = 31 * result + theatre.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "BritishSchool{" +
                "admin1=" + admin1 +
                ", playground1=" + playground1 +
                ", theatre=" + theatre +
                '}';
    }
}
