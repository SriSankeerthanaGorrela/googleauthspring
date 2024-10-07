package com.example.demo.service;

import com.example.demo.entity.Movie;
import com.example.demo.repository.MovieRepository;


import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MovieService {

    private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }
    public List<Movie> getPopularMovies() {
        return movieRepository.findByPopularTrue();
    }
    


    public List<Movie> getDramaMovies() {
        return movieRepository.findByDramaTrue();
    }
    public List<Movie> getComedyMovies() {
        return movieRepository.findByComedyTrue();
    }
    public List<Movie> getActionMovies() {
        return movieRepository.findByActionTrue();
    }
    

    // public List<Movie> getMoviesByGenre(String genre) {
    //     return movieRepository.findByGenre(genre);
    // }
}