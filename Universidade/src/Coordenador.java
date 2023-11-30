public class Coordenador {
    private String nome;

    public Coordenador(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void comunicarReitor(Reitor reitor, Disciplina disciplina) {
        System.out.println(nome + " está se comunicando com o reitor " + reitor.getNome() + " sobre a atribuição de um professor a disciplina de " + disciplina.getNome() + ".");
    }

    public void atribuirProfessorDisciplina(Professor professor, Disciplina disciplina) {
        System.out.println(nome + " atribuiu " + professor.getNome() + " à disciplina " + disciplina.getNome() + ".");
    }
}