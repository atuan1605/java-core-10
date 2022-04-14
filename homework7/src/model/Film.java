package model;

import java.time.LocalDate;

public class Film {
    private int id;
    private String title;
    private String category;
    private String director;
    private LocalDate premiereDate;

    public Film() {
    }

    public Film(int id, String title, String category, String director, LocalDate premiereDate) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.director = director;
        this.premiereDate = premiereDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public LocalDate getPremiereDate() {
        return premiereDate;
    }

    public void setPremiereDate(LocalDate premiereDate) {
        this.premiereDate = premiereDate;
    }

    @Override
    public String toString() {
        return "Film{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", category='" + category + '\'' +
                ", director='" + director + '\'' +
                ", premiereDate=" + premiereDate +
                '}';
    }
}
