/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oggetti;

/**
 *
 * @author lepore vincenzo
 */
import java.util.Scanner;

public class ProvaCapitale{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Inserisci il capitale iniziale: ");
        double capitaleIniziale = input.nextDouble();

        System.out.print("Inserisci il tasso di interesse (es. 0.05 per 5%): ");
        double interesse = input.nextDouble();

        System.out.print("Inserisci il tempo in anni (può essere anche decimale): ");
        double anni = input.nextDouble();

        // Uso del costruttore
        Capitale c1 = new Capitale(capitaleIniziale);

        // Calcolo del montante
       

        System.out.printf("Il montante dopo %.2f anni è: %.2f%n", anni,  c1.calcolaMontante(interesse, anni));

        // Uso del metodo statico
        double montanteStatico = Capitale.calcola(capitaleIniziale, interesse, anni);
        System.out.printf("(Calcolo statico) Il montante è: %.2f%n", montanteStatico);

        input.close();
    }
}
