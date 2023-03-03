package cinema;
public class app {
    
    
    
    
    
    public static void main(String[] args) {
        
        
        //Filme
        Filme filme = new Filme();
        filme.setNome("Matrix");
        filme.setAnoLancamento(1999);
        filme.setAtor(null);
        filme.setNota(4);
        
        
      System.out.println(filme.getNome());
      System.out.println(filme.getAnoLancamento());
      System.out.println(filme.getNota());
    }

    public app() {
    }
}
