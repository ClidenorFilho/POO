import javax.print.attribute.standard.Media;

public class Aluno {
    private String nome;
    private int matricula;
    private float notas[];

    public void Aluno(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
        notas = new float[2];
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public float[] getNotas() {
        return notas;
    }

    public void setNotas(int index, float nota) {
        this.notas[index] = nota;
    }
    public float media(){
        float media;
        float soma = 0f;

        for (float sum: getNotas()){
                soma += sum;
            }
        return  soma / notas.length;
    }
    public String toString(){
        String info;
        return String.format("Nome: %s \n matricula: %d \n Media: %02f", nome, matricula, media());
    }
}
