package com.esame.controller;

/*
 * classe con i metodi per calcolare le statistiche 
 * massimi e minimi, media e varianza dei dati di velocità
 * del vento e direzione (indicato in gradi)
 */
public class Statistiche  {
	public static int deg(Object object)
	{
	
		
		int d=0;
		String a=""+object;
		d=Integer.valueOf(a);
	
		return d;
	}
	
	public static float speed(Object object)
	{
	
		
		float d=0;
		String a=""+object;
		d= Float.valueOf(a);
	
		return d;
	}
	
	public static float minSpeed(float datav[])
	{
		float min=1000;
		for(int i=0;i<5;i++)
		{
		if(datav[i]<=min)
			min=datav[i];
		}
		return min;
	}
	
	public static int minDeg(int datav[])
	{
		int min=1000;
		for(int i=0;i<5;i++)
		{
		if(datav[i]<=min)
			min=datav[i];
		}
		return min;
	}
	
	public static float maxSpeed(float datav[])
	{
		float max=0;
		for(int i=0;i<5;i++)
		{
		if(datav[i]>=max)
			max=datav[i];
		}
		return max;
	}
	
	public static int maxDeg(int datav[])
	{
		int max=0;
		for(int i=0;i<5;i++)
		{
		if(datav[i]>=max)
			max=datav[i];
		}
		return max;
	}
	
	public static float mediaSPEED(float datav[])
	{
		float somma=0;
		for(int i=0;i<5;i++)
		{
			somma+=datav[i];
		}
		return somma/5;
	}

	public static float mediaDEG(int datav[])
	{
		int somma=0;
		for(int i=0;i<5;i++)
		{
			somma+=datav[i];
		}
		return somma/5;
	}
	
	public static float varianceSPEED(float datav[])
	{	
		float variance=0;
		float media=mediaSPEED(datav);
		for (int k = 0; k <= 4; k++) {
		    variance += Math.pow(datav[k] - media, 2);
		}
		return variance/5;
	}
	
	public static float varianceDEG(int datav[])
	{	
		float variance=0;
		float media=mediaDEG(datav);
		for (int k = 0; k <= 4; k++) {
		    variance += Math.pow(datav[k] - media, 2);
		}
		return variance/5;
	}
}
