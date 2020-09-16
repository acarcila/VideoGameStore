package com.videogame.store.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages = {"com.videogame.store.api", "com.videogame.store.controller"})
@ComponentScan("com.videogame.store")
public class VideoGameStoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(VideoGameStoreApplication.class, args);
	}

}
