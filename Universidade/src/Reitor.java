public class Reitor {
    private String nome;

    public Reitor(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void tomarDecisao(String decisao) {
        System.out.println("O reitor " + nome + " tomou a decisão: " + decisao);
    }

    public void comunicarFuncionarioAdministrativo(FuncionarioAdministrativo funcionario) {
        System.out.println(nome + " está se comunicando com " + funcionario.getNome() + " sobre a decisão tomada.");
    }

    public void comunicarCoordenador(Coordenador coordenador) {
        System.out.println(nome + " está debatendo com " + coordenador.getNome() + " sobre a decisão tomada.");
    }
}