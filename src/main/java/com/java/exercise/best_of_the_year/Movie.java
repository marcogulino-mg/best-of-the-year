package com.java.exercise.best_of_the_year;

public class Movie {
    // INFO: Attributes
    private int id;
    private String title;

    // INFO: Methods
    // INFO: Constructors

    Movie(int id, String title){
        id = this.id;
        title = this.title;
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

}
