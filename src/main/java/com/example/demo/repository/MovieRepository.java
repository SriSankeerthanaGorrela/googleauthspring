package com.example.demo.repository;

import com.example.demo.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface MovieRepository extends JpaRepository<Movie, Long> {
    // List<Movie> findByGenre(String genre);
    List<Movie> findByPopularTrue();
    List<Movie> findByDramaTrue();
    List<Movie> findByComedyTrue();
    List<Movie> findByActionTrue();
}
