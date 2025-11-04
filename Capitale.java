/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package oggetti;

/**
 *
 * @author lepore vincenzo
 */
public class Capitale {

    private double capitale;

    // Costruttore
    public Capitale(double capitale) {
        this.capitale = capitale;
    }

    // Getter
    public double getCapitale() {
        return capitale;
    }

    // Setter
    public void setCapitale(double capitale) {
        this.capitale = capitale;
    }

    // Calcola montante con t intero (anni)
    public double calcolaMontante(double i, int t) {
        return capitale * Math.pow(1 + i, t);
    }

    // Calcola montante con t reale (anni)
    public double calcolaMontante(double i, double t) {
        return capitale * Math.pow(1 + i, t);
    }

    // Metodo statico che calcola il montante dati capitale, interesse e tempo
    public static double calcola(double c, double i, double t) {
        return c * Math.pow(1 + i, t);
    }
}