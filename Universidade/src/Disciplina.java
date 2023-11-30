public class Disciplina {
    private String nome;
    private String codigo;

    public Disciplina(String nome, String codigo) {
        this.nome = nome;
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void iniciarAula(professor professor) {
        System.out.println("Realizando aula da disciplina " + codigo + " - " + nome + "...");
        professor.ministrarAula(this);
    }
}