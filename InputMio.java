package base;

//importazione librerie usate
import java.io.*;

public class InputMio {

	public static void main(String[] args) {
		//dichiaro due variabili di tipo String
		String nome = "";
		String cognome = "";
		
		//preparo gli oggetti per gestire l'input dell'utente
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader tastiera = new BufferedReader(input);
		
		//Inserimento dati da parte dell'utente, nome
		System.out.println("Inserisci il tuo nome");
		//il blocco istruzioni try serve per tentare di eseguire
		//del codice che potrebbe sollevare delle eccezioni (anomalie)
		//che devono essere gestite nell'opportuno blocco catch
		//evitando la chiusura del programma
		try {
			nome = tastiera.readLine();
			
		}
		//il blocco catch "cattura" l'oggetto Eccezione 
		//sollevato (lanciato) nel blocco try
		catch(Exception e)
		{
			System.out.println("Errore inserimento nome");
		}
		//inserimento cognome
		System.out.println("Inserisci il tuo cognome");
		try {
			cognome = tastiera.readLine();
			
		}
		catch(Exception e)
		{
			System.out.println("Errore inserimento cognome");
		}
		//stampa finale
		System.out.println("Ciao " + nome + " " + cognome);

	}

}
