package base;

import java.io.*;

public class ProvaStringhe {

	public static void main(String[] args) {
		String nome = "";
		String cognome = "";
		
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader tastiera = new BufferedReader(input);
		
		//inserimento stringhe
		try
		{
			System.out.println("Inserisci il tuo nome");
			nome = tastiera.readLine();
			
		}
		catch (IOException e)
		{
			System.out.println("problema inserimento nome");
		}
		try
		{
			System.out.println("Inserisci il tuo cognome");
			cognome = tastiera.readLine();
			
		}
		catch (IOException e)
		{
			System.out.println("problema inserimento cognome");
		}
		//nome
		char iniziale = nome.charAt(0);
		System.out.println("il tuo nome inizia con la lettera " + iniziale);
		int lung = nome.length();
		System.out.println("il tuo nome finisce con la lettera " + nome.charAt(lung - 1));
		System.out.println("il tuo nome è lungo " + lung + " caratteri");
		
		//cognome
		iniziale = cognome.charAt(0);
		System.out.println("il tuo nome inizia con la lettera " + iniziale);
		lung = cognome.length();
		System.out.println("il tuo nome è lungo " + lung + " caratteri");
		System.out.println("il tuo cognome finisce con la lettera " + cognome.charAt(lung - 1));
	}

}
