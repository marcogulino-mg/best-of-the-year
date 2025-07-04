package com.java.exercise.best_of_the_year;

public class Song {
    // INFO: Attributes
    private int id;
    private String title;

    // INFO: Methods
    // INFO: Constructors

    public Song(int id, String title) {
        this.id = id;
        this.title = title;
    }

    // INFO: Getters
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    // INFO: Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    // INFO: Others Mehtods
    @Override
    public String toString() {
        return String.format("%s", this.title);
    }
}
