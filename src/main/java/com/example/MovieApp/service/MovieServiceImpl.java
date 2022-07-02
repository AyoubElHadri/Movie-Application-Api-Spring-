package com.example.MovieApp.service;

import com.example.MovieApp.exceptions.MovieNotFoundException;
import com.example.MovieApp.model.Movie;
import com.example.MovieApp.repository.MovieRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class MovieServiceImpl implements MovieService{

    private final MovieRepository movieRepository;

    @Override
    public Movie validateAndGetMovie(String imdbId) {
        return movieRepository.findById(imdbId).orElseThrow(() -> new MovieNotFoundException(imdbId));


    }

    @Override
    public List<Movie> getMovies() {
        return null;
    }

    @Override
    public Movie saveMovie(Movie movie) {
        return null;
    }

    @Override
    public void deleteMovie(Movie movie) {

    }
}
