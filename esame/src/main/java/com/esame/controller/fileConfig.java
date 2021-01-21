package com.esame.controller;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/*
 * questa classe serve per modificare il file config così da
 * poter cambiare la città di ricerca
 */
public class fileConfig {
	public static void setConfig(String config) throws IOException {
        //config = config;
        String path = "src/main/resources/config.jsn";
        
        File percorso = new File(path);
        	String absolutePath = percorso.getAbsolutePath();
            FileWriter file = new FileWriter(absolutePath);
            BufferedWriter bw = new BufferedWriter(file);
            bw.write(config);
            bw.close();
    

		
	}
}

