package com.example.demo.controller;

import com.example.demo.entity.Movie;
import com.example.demo.service.MovieService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:8080")
@RequestMapping("/movies")  // Add this line to set the base path
public class MovieController {

    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping("/popular")
    public ResponseEntity<List<Movie>> getPopularMovies() {
        List<Movie> popularMovies = movieService.getPopularMovies();
        return ResponseEntity.ok(popularMovies);
    }
    @GetMapping("/drama")
    public ResponseEntity<List<Movie>> getDramaMovies() {
        List<Movie> dramaMovies = movieService.getDramaMovies();
        return ResponseEntity.ok(dramaMovies);
    }

        @GetMapping("/comedy")
        public ResponseEntity<List<Movie>>getComedyMovies() {
            List<Movie> comedyMovies=movieService.getComedyMovies();
            return ResponseEntity.ok(comedyMovies);
        }
        @GetMapping("/action")
        public ResponseEntity<List<Movie>>getActionMovies(){
            List<Movie> actionMovies=movieService.getActionMovies();
            return ResponseEntity.ok(actionMovies);
        }


    // @GetMapping("/genre/{genre}")
    // public ResponseEntity<List<Movie>> getMoviesByGenre(@PathVariable String genre) {
    //     List<Movie> movies = movieService.getMoviesByGenre(genre);
    //     return ResponseEntity.ok(movies);
    // }
}