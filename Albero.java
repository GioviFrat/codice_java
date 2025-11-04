/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package oggetti;


public class Albero extends Pianta {

   
    // nuovi attributi
    private double altezza;
    private double diametro;

    // costruttore
    public Albero(String nome, double altezza, double diametro) {
        super(nome); // chiama il costruttore della superclasse Pianta
        this.altezza = altezza;
        this.diametro = diametro;
    }

    // getter e setter
    public double getAltezza() {
        return altezza;
    }

    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    // toString ridefinito
    @Override
    public String toString() {
        return "Albero: " + getNome() +
               ", altezza = " + getAltezza() + " m" +
               ", diametro = " + getDiametro() + " m";
    }
}
