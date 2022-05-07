package model;

import java.time.LocalDate;

public class Serial extends Similar{
    private Status status;
    private int episode;

    public Serial() {
    }

    public Serial(int id, String name, String slug, String description, EnumCategory[] category, LocalDate release, int view, Status status, int episode) {
        super(id, name, slug, description, category, release, view);
        this.status = status;
        this.episode = episode;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public int getEpisode() {
        return episode;
    }

    public void setEpisode(int episode) {
        this.episode = episode;
    }

    @Override
    public String toString() {
        return "Serial{" +
                "status=" + status +
                ", episode=" + episode +
                '}';
    }
}
