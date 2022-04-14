package model;

import java.time.LocalDate;

public class Serial extends Film {
    private int averageTime;
    private int episodes;

    public Serial() {

    }

    public Serial(int id, String title, String category, String director, LocalDate premiereDate, int averageTime, int episodes) {
        super(id, title, category, director, premiereDate);
        this.averageTime = averageTime;
        this.episodes = episodes;
    }

    public int getAverageTime() {
        return averageTime;
    }

    public void setAverageTime(int averageTime) {
        this.averageTime = averageTime;
    }

    public int getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }

    @Override
    public String toString() {
        return "Serial{" +
                "averageTime=" + averageTime +
                ", episodes=" + episodes +
                '}';
    }
}
