package com.esame.controller;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.scheduling.config.ScheduledTask;


/*
 * Questa classe gestisce il salvataggio periodico interrogando l'api
 * e salvando i dati interessati nel file storico
 */
@Configuration
@EnableScheduling
	public class Salva {
	final Logger log = LoggerFactory.getLogger(ScheduledTask.class);

	 final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
	String save=tempo.output();
	
	/*
	 * questo schedule è un intervallo di un ora
	 */
	@Scheduled(cron="0 * * * * *")
	public void reportCurrentTime() {
		log.info("The time is now {}", dateFormat.format(new Date()));
		String path = "src/main/resources/storico.txt";

       File percorso = new File(path);
       String absolutePath = percorso.getAbsolutePath();
       try (FileWriter file = new FileWriter(absolutePath, true)) {
       	
	         file.write(save);
	         file.flush();

	     } catch (IOException e) {
	         e.printStackTrace();
	     }
	}
	}