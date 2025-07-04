package com.java.exercise.best_of_the_year.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.java.exercise.best_of_the_year.Movie;
import com.java.exercise.best_of_the_year.Song;

// INFO: This element is a Controller
@Controller
@RequestMapping("/")
public class HomeController {

    // EXPLANATION: Reply to the root address with index.html
    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("name", "Marco");
        return "index";
    }

    @GetMapping("/movies")
    public String movies(Model model) {
        ArrayList<Movie> movies = getBestMovies();
        model.addAttribute("movieList", movies);
        return "movies";
    }

    @GetMapping("/movies/{id}")
    public String getMovieByID(@PathVariable int id, Model model) {
        ArrayList<Movie> movies = getBestMovies();
        String movie = movies.stream().filter(m -> m.getId() == id)
                .map(Movie::getTitle)
                .findFirst()
                .orElse(null);
        model.addAttribute("movie", movie);
        return "movie-id";
    }

    @GetMapping("/songs")
    public String songs(Model model) {
        ArrayList<Song> songs = getBestSongs();
        model.addAttribute("songList", songs);
        return "songs";
    }

    @GetMapping("/songs/{id}")
    public String getSongByID(@PathVariable int id, Model model) {
        ArrayList<Song> songs = getBestSongs();
        String song = songs.stream().filter(s -> s.getId() == id)
                .map(Song::getTitle)
                .findFirst()
                .orElse(null);
        model.addAttribute("song", song);
        return "song-id";
    }

    // EXPLANATION: Return an ArrayList of Movie
    private ArrayList<Movie> getBestMovies() {
        ArrayList<Movie> movieList = new ArrayList<>();

        movieList.add(new Movie(1, "Il Signore degli Anelli"));
        movieList.add(new Movie(2, "Una Notte al Museo"));
        movieList.add(new Movie(3, "Titanic"));
        movieList.add(new Movie(4, "Il Padrino"));

        return movieList;
    }

    // EXPLANATION: Return an ArrayList of Song
    private ArrayList<Song> getBestSongs() {
        ArrayList<Song> songList = new ArrayList<>();

        songList.add(new Song(1, "Like a Rolling Stone"));
        songList.add(new Song(2, "Bohemian Rhapsody"));
        songList.add(new Song(3, "Respect"));
        songList.add(new Song(4, "Smells Like Teen Spirit"));

        return songList;
    }
}