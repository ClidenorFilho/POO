public class Livro {
    private String titulo;
    private String autor;
    private boolean alugado;

    public Livro(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
        this.alugado = false;
    }

    public String getTitulo(){
        return titulo;
    }
    public String getAutor(){
        return autor;
    }
    public boolean isAlugado(){
        return alugado;
    }

    public void setAlugado(boolean alugado){
        this.alugado = alugado;
    }

    public String toString(){
        return "titulo: " + titulo + "\n autor: " + autor + "\n alugado: " + alugado;
    }


}
