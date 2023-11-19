public class Coordenador {
    private String nome;

    public Coordenador(String nome) {
        this.nome = nome;
    }

    public void atribuirProfessorDisciplina(Professor professor, Disciplina disciplina) {
        System.out.println(nome + " atribuiu o professor " + professor.getNome() + " à disciplina " + disciplina.getNome());
    }
}