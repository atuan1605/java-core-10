package model;

import java.time.LocalDate;

public class Movie extends Similar{
    public int time;

    public Movie() {
    }

    public Movie(int id, String name, String description, EnumCategory[] category, LocalDate release, int view, int time) {
        super(id, name, description, category, release, view);
        this.time = time;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return super.toString() +
                "time=" + time ;
    }
}
