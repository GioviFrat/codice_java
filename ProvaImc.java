
package oggetti;

import java.util.Scanner;

public class ProvaImc {
      public static void main(String[] args) {
        // Creazione di due oggetti Imc
        Imc persona1 = new Imc(70, 1.75);
        Imc persona2 = new Imc(95, 1.80);

        // Stampa dei dati iniziali
        System.out.println("=== DATI INIZIALI ===");
        System.out.println(persona1);
        System.out.println(persona2);

        // Uso del metodo statico (non modifica gli oggetti)
        double imcTest = Imc.calcolaImc(60, 1.70);
        System.out.println("\nIMC calcolato con metodo statico: " + String.format("%.2f", imcTest));

        // Prova dei metodi set
        System.out.println("\n=== MODIFICO I VALORI DI PERSONA1 ===");
        persona1.setPeso(80);
        System.out.println(persona1);

        System.out.println("\n=== MODIFICO I VALORI DI PERSONA2 ===");
        persona2.setAltezza(1.85);
        System.out.println(persona2);
        
        Scanner tastiera = new Scanner(System.in);
        
        double p;
        double h;
        System.out.println("Inserisci peso");
        p = tastiera.nextDouble();
        
        System.out.println("Inserisci altezza");
        h = tastiera.nextDouble();
        
        Imc persona3 = new Imc(p,h);
        System.out.println(persona3);
        
        
    }
}
