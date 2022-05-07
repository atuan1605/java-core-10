package model;

import java.time.LocalDate;

public class Movie extends Similar{
    public int time;

    public Movie() {
    }

    public Movie(int id, String name, String slug, String description, EnumCategory[] category, LocalDate release, int view, int time) {
        super(id, name, slug, description, category, release, view);
        this.time = time;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }


}
