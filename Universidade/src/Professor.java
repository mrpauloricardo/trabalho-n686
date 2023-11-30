public class Professor {
    private String nome;

    public Professor(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void ministrarAula(Disciplina disciplina) {
        System.out.println(nome + " está ministrando aula da disciplina de " + disciplina.getNome() + ".");
    }

    public void comunicarCoordenador(Coordenador coordenador, Disciplina disciplina) {
        System.out.println(nome + " está se comunicando com " + coordenador.getNome() + " sobre a disciplina de " + disciplina.getNome() + ".");
    }

    public void interagirComEstudante(Estudante estudante, Disciplina disciplina) {
        System.out.println(nome + " está interagindo com " + estudante.getNome() + " na disciplina de " + disciplina.getNome() + ".");
    }
}