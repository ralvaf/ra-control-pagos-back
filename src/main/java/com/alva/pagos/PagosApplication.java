package com.alva.pagos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@SpringBootApplication
public class PagosApplication {
	private static final Logger logger = LogManager.getLogger(PagosApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(PagosApplication.class, args);
		logger.info("Se inicio la aplicación ;)");
	}

}
