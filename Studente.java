
package oggetti;

/**
 *
 * @author Frattini Giovanni
 */
public class Studente extends Persona {
    
    private String classe;
    
    public void setClasse(String c)
    {
        this.classe = c;
    }
    
    public String getClasse()
    {
        return this.classe;
    }
    
    //costruttore vuoto
    public Studente()
    {
        
    }
    //costruttore che usa il costruttore di Persona
    public Studente(String n, String c, String cl)
    {
        //super indica che viene utilizzato il metodo costruttore
        //della classe madre
        super(n,c);
        this.classe = cl;
    }
}
