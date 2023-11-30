public class Main {
    public static void main(String[] args) {
        
        Estudante estudante1 = new Estudante("Paulo", 2313601);
        Estudante estudante2 = new Estudante("Breno", 2313232);
        Estudante estudante3 = new Estudante("Cid", 2316464);

        Professor professor1 = new Professor("Aline");
        Professor professor2 = new Professor("Antonio");
        Professor professor3 = new Professor("Ronaldo");

        Disciplina disciplina1 = new Disciplina("Ambiente de Desenvolvimento de Software", "N686");
        Disciplina disciplina2 = new Disciplina("Ambiente de Dados", "N688");
        Disciplina disciplina3 = new Disciplina("Ética em Computação", "N690");

        Coordenador coordenador = new Coordenador("Rafaela");

        FuncionarioAdministrativo funcionario = new FuncionarioAdministrativo("Sávio");

        Reitor reitor = new Reitor("Randal");

        System.out.println("\n---------- Interações com os Estudantes ----------\n");

        estudante1.realizarMatricula(disciplina1, professor3);
        estudante2.realizarMatricula(disciplina2, professor2);
        estudante3.realizarMatricula(disciplina3, professor1);

        System.out.println("\n---------- Interações com os Professores ----------\n");

        professor1.comunicarCoordenador(coordenador, disciplina3);
        professor2.interagirComEstudante(estudante2, disciplina2);

        System.out.println("\n---------- Interações com as Disciplinas ----------\n");

        disciplina1.realizarAula(professor3);

        System.out.println("\n---------- Interações com a Coordenadora ----------\n");

        coordenador.comunicarReitor(reitor, disciplina2);
        coordenador.atribuirProfessorDisciplina(professor1, disciplina3);

        System.out.println("\n---------- Interações com o Funcionário Administrativo ----------\n");
        
        funcionario.processarMatricula(estudante1);
        funcionario.informarCoordenador(coordenador, estudante3);

        System.out.println("\n---------- Interações com o Reitor ----------\n");

        reitor.tomarDecisao("Aprovar novo projeto acadêmico.");
        reitor.comunicarCoordenador(coordenador);
        reitor.comunicarFuncionarioAdministrativo(funcionario);

    }
}