package oggetti;

       

public class Pianta {
    // attributo
    private String nome;

    // costruttore
    public Pianta(String nome) {
        this.nome = nome;
    }

    // getter
    public String getNome() {
        return nome;
    }

    // setter
    public void setNome(String nome) {
        this.nome = nome;
    }

    // toString
    @Override
    public String toString() {
        return "Pianta: " + nome;
    }
}

