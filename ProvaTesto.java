package base;

public class ProvaTesto {

	public static void main(String[] args) {
		// caratteri e stringhe
		char lettera = 'P';
		char lettera2 = 'i';
		//senza le virgolette interpreta i caratteri
		//come numeri secondo la tabella ASCII
		System.out.println("" +lettera + lettera2);
		System.out.println((int)lettera);
		System.out.println((int)lettera2);
		//le stringhe sono oggetti dichiarati
		//con la classe String
		String frase = "Ciao";
		System.out.println(frase + " mamma");
		System.out.println("" + lettera + lettera2 + " greco");
		

	}

}
