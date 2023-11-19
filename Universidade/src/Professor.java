public class Professor {
    private String nome;

    public Professor(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void ministrarAula(Disciplina disciplina) {
        System.out.println(nome + " está ministrando aula da disciplina de " + disciplina.getNome());
    }
}