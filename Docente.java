package oggetti;

public class Docente extends Persona 
{
    // attributo privato
    private String disciplina;

    /**
     * Costruttore senza parametri
     */
    public Docente() 
    {
        super();  // richiama il costruttore vuoto di Persona
        this.disciplina = "";
    }

    /**
     * Costruttore con parametri
     * 
     * @param n - nome
     * @param c - cognome
     * @param a - anno di nascita
     * @param d - disciplina insegnata
     */
    public Docente(String n, String c, int a, String d) 
    {
        super(n, c, a);  // chiama il costruttore della superclasse
        this.disciplina = d;
    }

    /**
     * Costruttore con nome, cognome e disciplina
     */
    public Docente(String n, String c, String d)
    {
        super(n, c);
        this.disciplina = d;
    }

    // metodi getter e setter
    public String getDisciplina() 
    {
        return this.disciplina;
    }

    public void setDisciplina(String d) 
    {
        this.disciplina = d;
    }

    // metodo per stampare le info del docente

    /**
     * 
     * @return
     */
    @Override
    public String toString() 
    {
        return getNome() + " " + getCognome() + "\n" + getDisciplina();
    }
}