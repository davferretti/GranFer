package com.esame.controller;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.io.File;
import java.io.FileReader;

/*
 * questa classe legge il nome della città nel file config.jsn
 */
public class LetturaNome {
	public static String Nome( String NomeFile)
		{
		String path = "src/main/resources/"+NomeFile;
	
	  	 File percorso = new File(path);
	  	 String absolutePath = percorso.getAbsolutePath();
			JSONParser parser = new JSONParser();
			try {
				Object obj = parser.parse(new FileReader(absolutePath));
				JSONObject jsonObject = (JSONObject) obj;
				
				
				
				String nomee = (String) jsonObject.get("nomecitta");
				return nomee;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
			return "";
			
	}
}

