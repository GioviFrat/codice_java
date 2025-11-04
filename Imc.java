
package oggetti;

public class Imc {
     // ATTRIBUTI
    private double peso;
    private double altezza;
    private double imc;
    private String situazione;

    // COSTRUTTORE
    public Imc(double peso, double altezza) {
        // controllo dei valori
        if (peso <= 0 || altezza <= 0) {
            System.out.println("Errore: peso e altezza devono essere positivi!");
            this.peso = 0;
            this.altezza = 0;
            this.imc = 0;
            this.situazione = "Valori non validi";
        } else {
            this.peso = peso;
            this.altezza = altezza;
            this.imc = calcolaImc(peso, altezza);
            this.situazione = classificaImc(this.imc);
        }
    }

    // METODO SET PESO
    public void setPeso(double peso) {
        if (peso > 0) {
            this.peso = peso;
            this.imc = calcolaImc(this.peso, this.altezza);
            this.situazione = classificaImc(this.imc);
        } else {
            System.out.println("Errore: peso non valido!");
        }
    }

    // METODO SET ALTEZZA
    public void setAltezza(double altezza) {
        if (altezza > 0) {
            this.altezza = altezza;
            this.imc = calcolaImc(this.peso, this.altezza);
            this.situazione = classificaImc(this.imc);
        } else {
            System.out.println("Errore: altezza non valida!");
        }
    }

    // METODO STATICO per calcolare l'IMC (non modifica gli attributi)
    public static double calcolaImc(double peso, double altezza) {
        return peso / (altezza * altezza);
    }

    // METODI GET
    public double getPeso() {
        return peso;
    }

    public double getAltezza() {
        return altezza;
    }

    public double getImc() {
        return imc;
    }

    public String getSituazione() {
        return situazione;
    }

    // METODO PRIVATO per classificare l'IMC
    private String classificaImc(double imc) {
        if (imc < 18.5)
            return "Sottopeso";
        else if (imc < 25)
            return "Normopeso";
        else if (imc < 30)
            return "Sovrappeso";
        else if (imc < 33)
            return "Obesità di primo grado";
        else if (imc < 35)
            return "Obesità di secondo grado";
        else
            return "Obesità di terzo grado";
    }

    // METODO TO STRING (solo per stampare più comodamente)
    @Override
    public String toString() {
        return "Peso: " + peso + " kg, Altezza: " + altezza + " m, IMC: " + String.format("%.2f", imc)
                + ", Situazione: " + situazione;
    }

}
