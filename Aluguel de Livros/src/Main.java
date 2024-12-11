public class Main {
    public static void main(String[] args) {
        // Criando livros
        Livro livro1 = new Livro("Dom Casmurro", "Machado de Assis");
        Livro livro2 = new Livro("O Pequeno Príncipe", "Antoine de Saint-Exupéry");

        // Criando aluno
        Aluno aluno = new Aluno("João");

        // Testando aluguel de livros
        System.out.println("--- Alugando Livros ---");
        aluno.alugarLivro(livro1);
        aluno.alugarLivro(livro2);
        aluno.alugarLivro(livro1); // Tentativa de alugar novamente o mesmo livro

        // Testando devolução de livros
        System.out.println("\n--- Devolvendo Livros ---");
        aluno.devolverLivro(livro1);
        aluno.devolverLivro(livro2);
        aluno.devolverLivro(livro1); // Tentativa de devolver um livro já devolvido

        // Exibindo informações dos livros
        System.out.println("\n--- Informações dos Livros ---");
        System.out.println(livro1);
        System.out.println(livro2);
    }
}
