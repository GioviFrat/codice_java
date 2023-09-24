package base;

import java.util.Scanner;

public class Scansione {

	public static void main(String[] args) {
		
		// Crea un oggetto Scanner per leggere l'input dell'utente
        Scanner scanner = new Scanner(System.in);

        // Chiedi all'utente di inserire il primo numero
        System.out.println("Inserisci il primo numero: ");
        int numero1 = scanner.nextInt();

        // Chiedi all'utente di inserire il secondo numero
        System.out.println("Inserisci il secondo numero: ");
        int numero2 = scanner.nextInt();

        // Chiudi lo scanner per liberare le risorse
        scanner.close();

        // Calcola la somma dei due numeri
        int somma = numero1 + numero2;

        // Stampa il risultato
        System.out.println("La somma dei due numeri è: " + somma);
	}

}



  
