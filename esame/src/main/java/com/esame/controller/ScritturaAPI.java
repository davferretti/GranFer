package com.esame.controller;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/*
 * scrive in un file il json ricevuto da openweather che
 * poi sarà gestito nella classe tempo
 */
public class ScritturaAPI {
	
	public static void write(String json)
	{
		String path = "src/main/resources/API.jsn";

        File percorso = new File(path);
        String absolutePath = percorso.getAbsolutePath();
		try (FileWriter file = new FileWriter(absolutePath)) {

	         file.write(json);
	         file.flush();

	     } catch (IOException e) {
	         e.printStackTrace();
	     }
	}
}
