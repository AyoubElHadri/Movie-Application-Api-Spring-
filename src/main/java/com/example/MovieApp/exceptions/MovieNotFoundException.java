package com.example.MovieApp.exceptions;

public class MovieNotFoundException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public MovieNotFoundException(String imdbId) {
        super(String.format("Movie with imdbId '%s' not found , imdbId"));
    }
}
