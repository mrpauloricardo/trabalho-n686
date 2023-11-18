public class Estudante {
    private String nome;
    private int matricula;

    public Estudante(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void realizarMatricula(Disciplina disciplina) {
        System.out.println(nome + ", de matrícula " + matricula + " realizou a matrícula na disciplina de " + disciplina.getNome());
    }
}