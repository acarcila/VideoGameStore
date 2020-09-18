package com.video_game.store.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@ComponentScan(basePackages = {"com.videogame.store.api", "com.videogame.store.controller"})
@ComponentScan("com.video_game.store")
@EntityScan("com.video_game.store.model.entities")
@EnableJpaRepositories("com.video_game.store.persistence")
public class VideoGameStoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(VideoGameStoreApplication.class, args);
	}

}
