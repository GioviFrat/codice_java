package base;
/**
 * prova operatori : sul libro trovate a pag. 16
 */

public class ProvaOperatori {

	public static void main(String[] args) {
		// Operatori in Java
		int numero, risultato;
		numero = 5;
		//incremento di 1
		numero = numero + 1;
		System.out.println(numero);
		numero++;
		System.out.println(numero);
		//calcolo del resto (divisione modulo n)
		risultato = numero%3;
		System.out.println(risultato);
		//decremento di 1
		numero--;
		System.out.println(numero);
		//operatori con assegnazione (=)
		//aumento di n
		//numero = numero + 10;
		numero += 10;
		System.out.println(numero);
		//moltiplicazione per 5
		numero *= 5;
		System.out.println(numero);
		
		//notazione postfissata
		int num = 10;
		risultato = (num++) - 3;
		System.out.println(risultato);
		System.out.println(num);
		//risultato = num - 3;
		//num = num + 1;
		
		//notazione prefissata
		num = 10;
		risultato = (++num) - 3;
		System.out.println(risultato);
		System.out.println(num);
		//num = num + 1;
		//risultato = num - 3;
	}

}
