package com.esame.model;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.esame.controller.API;
import com.esame.controller.Salva;
/*
 * @authors Davide & Matteo
 * 
 * classe principale che si occupa dell'avvio di spring
 * e dell'interazione con la classe API
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.esame.controller","com.esame.view"})
public class EsameApplication {

	public static void main(String[] args) {
		API.bee();
		SpringApplication.run(EsameApplication.class, args);
	
	}

}