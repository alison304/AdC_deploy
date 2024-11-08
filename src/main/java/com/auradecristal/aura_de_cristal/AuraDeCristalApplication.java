package com.auradecristal.aura_de_cristal;

import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AuraDeCristalApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(AuraDeCristalApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(AuraDeCristalApplication.class, args);
		LOGGER.info("Aura de Cristal iniciado correctamente!!!");
	}

	@Bean
	public ModelMapper modelMapper (){
		return new ModelMapper();
	}

}
