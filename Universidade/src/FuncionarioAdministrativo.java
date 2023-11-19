public class FuncionarioAdministrativo {
    private String nome;

    public FuncionarioAdministrativo(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void processarMatricula(Estudante estudante) {
        System.out.println("Processando matrícula de " + estudante.getNome());
    }
}