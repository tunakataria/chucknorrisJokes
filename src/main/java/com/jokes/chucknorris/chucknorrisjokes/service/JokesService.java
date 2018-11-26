package com.jokes.chucknorris.chucknorrisjokes.service;

import org.springframework.stereotype.Service;

@Service
public interface JokesService {

    String getJoke();
}
