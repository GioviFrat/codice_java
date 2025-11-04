package oggetti;

public class Persona 
{
    private String nome;
    private String cognome;
    private int annoNascita;
    
    //costante
    private static final String CODICE = "A00250";

    /**
     * costruttore senza parametri
     */
    public Persona()
    {
        
    }

    public int getAnnoNascita() {
        return annoNascita;
    }

    public void setAnnoNascita(int annoNascita) {
        this.annoNascita = annoNascita;
    }
    /**
     * 
     * Costruttore che inizializza la classe
     * 
     * @param n - nome
     * @param c - cognome
     * 
     */
    public Persona(String n, String c)
    {
       this.nome = n;
       this.cognome = c;
    }

    public Persona(String n, String c, int a)
    {
        this.nome = n;
        this.cognome = c;
        if (a >= 1900)
            this.annoNascita = a;
        else
            this.annoNascita = 1900;
    }


//metodo get per ricavare il dato dell'attributo
    public String getNome()
    {
        return this.nome;
    }

    //metodo set imposta il valore dell'attributo
    public void setNome(String n)
    {
        this.nome = n;
    }

    public String getCognome()
    {
        return this.cognome; 
    }

    public void setCognome(String c)
    {
        this.cognome = c; 
    }
    
    //metodo statico
    public static void stampaCodice()
    {
        System.out.println(CODICE);
    }
	    
}
