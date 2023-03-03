package cinema;
public class Ator extends Pessoa {
    private Filme filme;

    public Filme getFilme() {
        return filme;
    }

    public Ator(String nome, Filme filme) {
        super(nome);
        this.filme = filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

   
}