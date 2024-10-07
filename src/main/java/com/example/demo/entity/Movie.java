package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "movies")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
 
    private boolean popular;
    private boolean drama;
    private boolean comedy;
    private boolean action;
    private String posterUrl;  // New field for the poster URL

    // Constructors
    public Movie() {
    }

    public Movie(String title, boolean popular,boolean drama,boolean comedy,boolean action, String posterUrl) {
        this.title = title;
    
        this.popular = popular;
        this.posterUrl = posterUrl;
        this.drama=drama;
        this.comedy=comedy;
        this.action=action;
    }

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    

    public boolean isPopular() {
        return popular;
    }

    public void setPopular(boolean popular) {
        this.popular = popular;
    }

    public String getPosterUrl() {
        return posterUrl;
    }

    public boolean isDrama() {
        return drama;
    }

    public void setDrama(boolean drama) {
        this.drama = drama;
    }

    public boolean isComedy() {
        return comedy;
    }

    public void setComedy(boolean comedy) {
        this.comedy = comedy;
    }

    public boolean isAction() {
        return action;
    }

    public void setAction(boolean action) {
        this.action = action;
    }

    public void setPosterUrl(String posterUrl) {
        this.posterUrl = posterUrl;
    }
}
