package oggetti;

public class Principale 
{
	public static void main(String[] args)
	{
//istanzio l'oggetto Persona
        
        Persona p1 = new Persona();
        
        Persona p2 = new Persona();
        
        p1.setNome("Giovanni");
        
        p2.setNome("Maria");
        
        System.out.println(p1.getNome());
        
        Persona p3 = new Persona(); 
        p3.setCognome("Rossi");
        p3.setNome("Mattia");
        System.out.println(p3.getNome() + " " + p3.getCognome()); 
        
        //uso il costruttore con i parametri
        Persona p4 = new Persona("Giuseppe","Esposito");
        
        System.out.println(p4.getNome() + " " + p4.getCognome()); 
        
        //istanzio un oggetto s1 della classe figlia
        Studente s1 = new Studente();
        s1.setCognome("Testa");
        s1.setNome("Ciro");
        s1.setClasse("4E SIA");
        
        Studente s2 = new Studente("Vincenzo","Lepore","4E SIA");
        
        System.out.println(s1.getNome() + " " + s1.getCognome() + " " + s1.getClasse());
        
        System.out.println(s2.getNome() + " " + s2.getCognome() + " " + s2.getClasse());
        
        System.out.println(p1.toString());
        
        Docente d1 = new Docente("Alessia","Molari","Informatica");
        System.out.println(d1);
        
        //richiamo un metodo statico
        Persona.stampaCodice();
        
	}

}
