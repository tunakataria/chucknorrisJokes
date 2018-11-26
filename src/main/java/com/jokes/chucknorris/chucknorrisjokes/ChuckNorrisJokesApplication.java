package com.jokes.chucknorris.chucknorrisjokes;

import com.jokes.chucknorris.chucknorrisjokes.service.JokesServiceImp;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ChuckNorrisJokesApplication {

	public static void main(String[] args) {


		ConfigurableApplicationContext ctx = SpringApplication.run(ChuckNorrisJokesApplication.class, args);

		System.out.println(ctx.getBean(JokesServiceImp.class).getJoke());
	}
}
