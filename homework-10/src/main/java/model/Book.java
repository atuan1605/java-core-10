package model;

import com.google.gson.annotations.SerializedName;

import java.util.Arrays;

public class Book {

    private int id;
    private String title;
    private String[] category;
    private String author;
    @SerializedName("page_number")
    private int number;
    @SerializedName("release_year")
    private int release;

    public Book() {
    }

    public Book(int id, String title, String[] category, String author, int number, int release) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.author = author;
        this.number = number;
        this.release = release;
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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getRelease() {
        return release;
    }

    public void setRelease(int release) {
        this.release = release;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", category=" + Arrays.toString(category) +
                ", author='" + author + '\'' +
                ", number=" + number +
                ", release=" + release +
                '}';
    }
}
