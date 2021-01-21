package com.esame.controller;

import java.io.File;
import java.io.FileReader;
import java.util.Iterator;
import java.util.Map;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/*
 * questa classe si occupa di estrapolare la velocità del vento
 * e la sua direzione dal json
 */
public class tempo{
	public static String output()
	{
	JSONParser parser = new JSONParser();
	String out="";
	int out2=0;
	float out3=0;
	float dataSPEED[]=new float[5];
	int dataDEG[]=new int[5];
	try {
		String path = "src/main/resources/API.jsn";

        File percorso = new File(path);
        String absolutePath = percorso.getAbsolutePath();
		Object obj = parser.parse(new FileReader(absolutePath));
		JSONObject jsonObject = (JSONObject) obj;
		
		JSONArray arrGiorno = (JSONArray) jsonObject.get("list");
		JSONObject objGiorno;
		Map winder1;
		float c=0;
		int d=0;
		/*
		 * si utilizza un for perché il file json contiene oltre al meteo attuale
		 * anche previsioni per i 4 giorni successivi
		 */
		for(int i=0;i<=4;i++)
		{
			objGiorno= (JSONObject) arrGiorno.get(i);
			winder1 = ((Map)objGiorno.get("wind"));
			Iterator<Map.Entry> itr1 = winder1.entrySet().iterator();        
			
			while (itr1.hasNext()) 
			{             
				Map.Entry pair = itr1.next();   
				if(pair.getKey().equals("speed"))
				{
				out=" "+out+pair.getKey() + " : " + pair.getValue()+"\n";   
				out3=Statistiche.speed(pair.getValue());
				dataSPEED[i]=out3;
				}
				if(pair.getKey().equals("deg"))
				{
					out=out+" "+pair.getKey() + " : " + pair.getValue()+" ";    
					out2=Statistiche.deg(pair.getValue());
					dataDEG[i]=out2;
				}	
			
			}
		
		
		}
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	
		
	
	return out+"Valori minimi: "+Statistiche.minSpeed(dataSPEED)+"   "+Statistiche.minDeg(dataDEG)+"   "+"\n"+
			"Valori massimi: "+Statistiche.maxSpeed(dataSPEED)+"  "+Statistiche.maxDeg(dataDEG)+"   "+"\n"+
			"Medie: "+Statistiche.mediaSPEED(dataSPEED)+"   "+Statistiche.mediaDEG(dataDEG)+"\n"+
			"Varianza: "+Statistiche.varianceSPEED(dataSPEED)+" "+Statistiche.varianceDEG(dataDEG)+"\n";
}
}
