package model;

public class Book {
    public int id;
    public String title;
    public String description;
    public String author;
    public String category;
    public String publishingCompany;
    public int pulishingYear;

    public Book() {
    }

    @Override
    public String toString() {
        return "model.Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", author='" + author + '\'' +
                ", category='" + category + '\'' +
                ", publishingCompany=" + publishingCompany +
                ", pulishingYear=" + pulishingYear +
                '}';
    }
}

