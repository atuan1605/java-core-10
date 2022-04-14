package model;

import java.time.LocalDate;

public class Movie extends Film{
    private int time;

    public Movie() {
    }

    public Movie(int id, String title, String category, String director, LocalDate premiereDate, int time) {
        super(id, title, category, director, premiereDate);
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
        return "Movie{" +
                "time=" + time +
                '}';
    }
}
