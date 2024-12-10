
import java.util.Scanner;
public class Turma {
    private String disciplina;
    private int cod;
    private Aluno[] alunos;
    private int capacidade;
    private int qntd_alunos;

    public void Turma(String disciplina, int cod, Aluno[] alunos, int capacidade) {
        this.disciplina = disciplina;
        this.cod = cod;
        this.alunos = alunos;
        this.capacidade = capacidade;
        this.qntd_alunos = 0;
    }
    public void verAlunos() {
        for (int i = 0; i < qntd_alunos; i++) {
            System.out.println(alunos[i].getNome());
        }
    }
    public void verAprovados(){
        for (int i = 0; i < qntd_alunos; i++) {
            if(alunos[i].media() >= 7){
                System.out.println(alunos[i]);
            }
        }
    }
    public void verAlunosFinal(){
        for (int i = 0; i < qntd_alunos; i++) {
            if(alunos[i].media() >= 4 && alunos[i].media() <= 7){
                System.out.println(alunos[i]);
            }
        }
    }
    public void lancarNotas(){
        for (int i = 0; i < qntd_alunos; i++) {
            Scanner sc = new Scanner(System.in);
            float n;
            n = sc.nextFloat();
            alunos[i].setNotas(i, n);
        }
    }
    public void adicionarAluno(Aluno aluno){
        for (int i = 0; i < qntd_alunos; i++) {
            if(alunos[i] == null){
                alunos[i] = aluno;
            }
        }
    }

}
