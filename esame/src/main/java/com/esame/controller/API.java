package com.esame.controller;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

/*
 * classe che fa la richiesta api al server di openweather
 * la città si ricava leggendo il file config
 */
public class API {
	@SuppressWarnings("unchecked")
	public static void bee ()
	{
		 try {
 	    	 
			 String NomeFile ="config.jsn";
			 String nomecitta=LetturaNome.Nome(NomeFile);
			String urlString="http://api.openweathermap.org/data/2.5/forecast?q="+nomecitta+"&appid=e2be0b621abdc1a6e87ec167ba87748e&units=metric&cnt=5";
 	         URL url = new URL(urlString);
 	         URLConnection conn = url.openConnection();
 	         BufferedReader rd = new BufferedReader(new InputStreamReader (conn.getInputStream()));
 	         String line;
 	         StringBuilder result = new StringBuilder();
 	         String json = "";
 	         while ((line = rd.readLine()) != null){
 	             result.append(line);
 	           json= line;
 	         }

 	         rd.close();
 	         ScritturaAPI.write(json);
 } catch (Exception e) {
 e.printStackTrace();
 }
 }
	}
	

