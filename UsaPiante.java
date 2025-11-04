

package oggetti;


public class UsaPiante {
    public static void main(String[] args) {
        // due oggetti Pianta
        Pianta p1 = new Pianta("Rosa");
        Pianta p2 = new Pianta("Girasole");

        // due oggetti Albero
        Albero a1 = new Albero("Quercia", 12.5, 0.8);
        Albero a2 = new Albero("Pino", 20.0, 0.5);

        // stampa degli oggetti
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(a1);
        System.out.println(a2);
    }
}


