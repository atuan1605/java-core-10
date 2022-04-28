package model;


import com.google.gson.annotations.SerializedName;

import java.time.LocalDate;

public class Movie {
    @SerializedName("id")
    private int id;
    @SerializedName("title")
    private String title;
    @SerializedName("category")
    private String[] category;
    @SerializedName("director")
    private String director;
    @SerializedName("length")
    private int length;
    @SerializedName("release")
    private String release;
    @SerializedName("view")
    private long view;

    public Movie() {
    }

    public Movie(int id, String title, String[] category, String director, int length, String release, long view) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.release = release;
        this.view = view;
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

    public String[] getCategory() {
        return category;
    }

    public void setCategory(String[] category) {
        this.category = category;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getRelease() {
        return release;
    }

    public void setRelease(String release) {
        this.release = release;
    }

    public long getView() {
        return view;
    }

    public void setView(long view) {
        this.view = view;
    }

    @Override
    public String toString() {
        return id + " - " + title + " - " + category + " - " + director + " - " + length + " - " + release + " - " + view;
    }

    
}
