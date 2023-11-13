public class Main {
    public static void main(String[] args) {
        /*Pessoa p1=new Pessoa();
        Aluno p2=new Aluno();
        Professor p3=new Professor();
        Funcionario p4=new Funcionario();

        p1.setNome("João");
        p2.setNome("Maria");
        p3.setNome("José");
        p4.setNome("Laura");

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());*/

        // Criando objetos das classes Funcionario, Professor e Aluno
        // Criando objetos das classes Funcionario, Professor e Aluno
        Funcionario funcionario = new Funcionario(30, "João", "Masculino", "Administrativo", true);
        Professor professor = new Professor(40, "Maria", "Feminino", "Matemática", 5000.0f);
        Aluno aluno = new Aluno(20, "Pedro", "Masculino", 12345, "Engenharia");

        // Imprimindo informações dos objetos
        System.out.println("Funcionário:");
        System.out.println(funcionario);
        System.out.println();

        System.out.println("Professor:");
        System.out.println(professor);
        System.out.println();

        System.out.println("Aluno:");
        System.out.println(aluno);
        System.out.println();

        // Realizando ações específicas de cada objeto
        funcionario.mudarTrabalho();
        professor.recebeAumento(1000.0f);
        aluno.cancelarmatricula();

        // Imprimindo informações atualizadas dos objetos
        System.out.println("Funcionário (após mudar trabalho):");
        System.out.println(funcionario);
        System.out.println();

        System.out.println("Professor (após receber aumento):");
        System.out.println(professor);
        System.out.println();

        System.out.println("Aluno (após cancelar matrícula):");
        System.out.println(aluno);
    }
}