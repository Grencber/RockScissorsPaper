package com.imc.RockScissorsPaperGame;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RockScissorsPaperGameApplication implements CommandLineRunner {

	private static Logger logger = LogManager.getLogger(RockScissorsPaperGameApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(RockScissorsPaperGameApplication.class, args);
	}

	public void run(String... args) {
		logger.info("EXECUTING : command line runner");

	}
}
