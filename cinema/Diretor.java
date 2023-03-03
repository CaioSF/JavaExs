package cinema;
public class Diretor extends Pessoa {
    private Filme filme;

    public Diretor(String nome, Filme filme) {
        super(nome);
        this.filme = filme;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

}
