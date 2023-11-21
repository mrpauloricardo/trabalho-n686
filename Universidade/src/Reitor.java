public class Reitor {
    private String nome;

    public Reitor(String nome) {
        this.nome = nome;
    } 
    public void tomarDecisao(String decisao) {
        System.out.println("O reitor " + nome + " tomou a decisão: " + decisao);
    }
}