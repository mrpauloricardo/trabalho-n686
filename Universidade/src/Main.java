public class Main {
    public static void main(String[] args) {
        
        Estudante estudante1 = new Estudante("Paulo", 2313601);
        Professor professor1 = new Professor("Aline");
        Disciplina disciplina1 = new Disciplina("Ambiente de Desenvolvimento de Software", "N690");

        Estudante estudante2 = new Estudante("Breno", 2313232);
        Professor professor2 = new Professor("Antonio");
        Disciplina disciplina2 = new Disciplina("Ambiente de Dados", "N688");

        Coordenador coordenador = new Coordenador("Coordenadora Rafaela");
        FuncionarioAdministrativo funcionario = new FuncionarioAdministrativo("Sávio");
        Reitor reitor = new Reitor("Randal Pompeu");

        estudante1.realizarMatricula(disciplina1);
        professor1.ministrarAula(disciplina1);

        estudante2.realizarMatricula(disciplina2);
        professor2.ministrarAula(disciplina2);

        coordenador.atribuirProfessorDisciplina(professor1, disciplina1);
        funcionario.processarMatricula(estudante1);

        reitor.tomarDecisao("Aprovar novo projeto acadêmico");

    }
}