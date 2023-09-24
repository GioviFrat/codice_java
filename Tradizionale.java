package base;

import java.io.*;

public class Tradizionale {

	public static void main(String[] args) {
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader tastiera = new BufferedReader(input);
		
		int n1 = 0,n2 = 0;
		//inserimento primo numero
		System.out.println("Inserisci il primo numero intero");
		try {
			String numeroletto1 = tastiera.readLine();
			n1 = Integer.valueOf(numeroletto1).intValue();
			//oppure
			//n1 = Integer.parseInt(numeroletto1);
		}
		catch(Exception e)
		{
			System.out.println("primo numero non valido");
		}
		//inserimento secondo numero
		System.out.println("Inserisci il secondo numero intero");
		try {
			String numeroletto2 = tastiera.readLine();
			n2 = Integer.valueOf(numeroletto2).intValue();
		}
		catch(Exception e)
		{
			System.out.println("secondo numero non valido");
		}
		
		int somma = n1 + n2;
		
		System.out.println("la somma vale: " + somma);
		
	}

}
