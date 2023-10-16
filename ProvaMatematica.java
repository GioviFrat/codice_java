package base;

import java.math.*;
import java.util.*;
import java.io.*;

public class ProvaMatematica {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double num = 0.0;
		System.out.println("inserisci un numero");
		try {
			num = input.nextDouble();
		}
		catch (InputMismatchException e)
		{
			System.out.println("Formato numero non riconosciuto");
		}
		double ris = 0.0;
		//radice
		ris = Math.sqrt(num);
		System.out.println("Radice quadrata: " + ris);
		
		//elevamento a potenza
		ris = Math.pow(num, 3.0);
		System.out.println("Cubo: " + ris);
		
		//numero casuale
		ris = Math.random();
		System.out.println("Casuale: " + ris);
		
		//Pi greco
		System.out.println("Pi greco: " + Math.PI);
		
		double num2 = 23.2/10;
		//arrotondamento
		System.out.println("Numero : " + num2);
		 ris = Math.round(num2);
		System.out.println("Arrotondato: " + ris);

	}

}
