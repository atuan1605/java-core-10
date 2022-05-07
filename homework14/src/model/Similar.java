package model;

import java.time.LocalDate;
import java.util.Arrays;

public class Similar {
    private int id;
    private String name;
    private String slug;
    private String description;
    private EnumCategory[] category;
    private LocalDate release;
    private int view;

    public Similar() {
    }

    public Similar(int id, String name, String slug, String description, EnumCategory[] category, LocalDate release, int view) {
        this.id = id;
        this.name = name;
        this.slug = slug;
        this.description = description;
        this.category = category;
        this.release = release;
        this.view = view;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public EnumCategory[] getCategory() {
        return category;
    }

    public void setCategory(EnumCategory[] category) {
        this.category = category;
    }

    public LocalDate getRelease() {
        return release;
    }

    public void setRelease(LocalDate release) {
        this.release = release;
    }

    public int getView() {
        return view;
    }

    public void setView(int view) {
        this.view = view;
    }

    @Override
    public String toString() {
        return "Similar{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", slug='" + slug + '\'' +
                ", description='" + description + '\'' +
                ", category=" + Arrays.toString(category) +
                ", release=" + release +
                ", view=" + view +
                '}';
    }
}