import java.util.ArrayList;
public class Aluno {
    private String nome;
    private ArrayList<Livro> livrosAlugados = new ArrayList<>();

    public Aluno(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }
    public Livro alugarLivro(Livro livro){
        if(!livro.isAlugado()) {
            livrosAlugados.add(livro);
            System.out.println("Livro: " + livro.getTitulo() + " foi alugado com sucesso");
            livro.setAlugado(true);
            return livro;
        }
        else if(livro.isAlugado()) {
            System.out.println("Livro indisponivel para alugar");
            return null;
        }
        return null;
    }
    public Livro devolverLivro(Livro livro){
        if(livro.isAlugado()) {
            livrosAlugados.remove(livro);
            System.out.println("Livro: " + livro.getTitulo() + " devolvido com sucesso");
            return livro;
        }
        else{
            System.out.println("Livro: " + livro.getTitulo() + " indisponivel para devolver");
            return livro;
        }
    }
}
