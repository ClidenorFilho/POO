# Sistema de Aluguel de Livros

Este projeto implementa um sistema simples para gerenciamento de aluguel e devolução de livros. Ele utiliza classes em Java para representar alunos, livros e as interações entre eles.

## Estrutura do Projeto

O código é composto por três classes principais:

1. **Aluno**: Representa um aluno que pode alugar e devolver livros.
2. **Livro**: Representa um livro com informações como título, autor e status de aluguel.
3. **Main**: Classe principal para executar testes do sistema.

## Funcionalidades

### Classe Aluno
- **Atributos**:
  - `nome`: Nome do aluno.
  - `livrosAlugados`: Lista de livros que o aluno alugou.

- **Métodos**:
  - `alugarLivro(Livro livro)`: Permite que o aluno alugue um livro, desde que ele não esteja alugado.
  - `devolverLivro(Livro livro)`: Permite que o aluno devolva um livro alugado.

### Classe Livro
- **Atributos**:
  - `titulo`: Título do livro.
  - `autor`: Autor do livro.
  - `alugado`: Indica se o livro está alugado.

- **Métodos**:
  - `isAlugado()`: Retorna o status de aluguel do livro.
  - `setAlugado(boolean alugado)`: Define o status de aluguel do livro.
  - `toString()`: Exibe as informações do livro.

### Classe Main
- Cria instâncias de livros e alunos.
- Testa as funcionalidades de aluguel e devolução de livros.
- Exibe as informações dos livros após as operações.

## Exemplo de Uso

A seguir, um resumo do fluxo implementado na classe `Main`:

1. Cria dois livros: *Dom Casmurro* e *O Pequeno Príncipe*.
2. Cria um aluno chamado João.
3. Aluga os livros para João e tenta alugar um livro já alugado.
4. Devolve os livros e tenta devolver um livro que não está alugado.
5. Exibe informações dos livros ao final do processo.

## Saída Esperada

```plaintext
--- Alugando Livros ---
Livro: Dom Casmurro foi alugado com sucesso
Livro: O Pequeno Príncipe foi alugado com sucesso
Livro indisponivel para alugar

--- Devolvendo Livros ---
Livro: Dom Casmurro devolvido com sucesso
Livro: O Pequeno Príncipe devolvido com sucesso
Livro: Dom Casmurro indisponivel para devolver

--- Informações dos Livros ---
titulo: Dom Casmurro
 autor: Machado de Assis
 alugado: false
titulo: O Pequeno Príncipe
 autor: Antoine de Saint-Exupéry
 alugado: false
```

## Tecnologias
- Linguagem de programação: Java
- Estruturas de dados: ArrayList

## Como Executar

1. Certifique-se de ter o Java JDK instalado em sua máquina.
2. Compile os arquivos `.java` usando o comando:
   ```bash
   javac Aluno.java Livro.java Main.java
   ```
3. Execute o programa principal:
   ```bash
   java Main
   ```

## Melhorias Futuras
- Adicionar suporte a múltiplos alunos.
- Implementar persistência de dados (ex.: salvar os livros e alunos em um banco de dados ou arquivo).
- Criar uma interface gráfica para facilitar o uso do sistema.

## Licença
Este projeto é de uso livre e não possui licença específica.
