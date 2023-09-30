import java.util.Scanner;

public class EsempioParseInt {
    public static void main(String[] args) {
        // Creare un oggetto Scanner per leggere l'input dell'utente
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci un numero intero: ");

        try {
            // Leggere l'input dell'utente come una stringa
            String input = scanner.nextLine();

            // Utilizzare il metodo parseInt per convertire la stringa in un numero intero
            int numero = Integer.parseInt(input);

            // Stampare il numero intero inserito dall'utente
            System.out.println("Hai inserito il numero: " + numero);
        } catch (NumberFormatException e) {
            // Gestire l'eccezione nel caso in cui l'input non sia un numero valido
            System.out.println("Input non valido. Assicurati di inserire un numero intero.");
        } finally {
            // Chiudere lo scanner per liberare le risorse
            scanner.close();
        }
    }
}
