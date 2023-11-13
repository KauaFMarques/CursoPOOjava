public class Main {
    public static void main(String[] args) {
        // Criando objetos das classes
        Professor professor = new Professor("João", 40, "Masculino", 5000, "Matemática");

        Bolsista bolsista = new Bolsista("Maria", 18, "Feminino", 12345, "Engenharia", 1500);

        AlunoTecnico alunoTecnico = new AlunoTecnico("Pedro", 20, "Masculino", 67890, "Informática", "123ABC");

        Visitante visitante = new Visitante("Ana", 25, "Feminino");

        // Imprimindo os dados dos objetos
        System.out.println("Professor:");
        System.out.println(professor.toString());
        System.out.println();

        System.out.println("Bolsista:");
        System.out.println(bolsista.toString());
        bolsista.renovarBolsa();
        bolsista.pagaraMensalidade();
        System.out.println();

        System.out.println("Aluno Técnico:");
        System.out.println(alunoTecnico.toString());
        alunoTecnico.praticar();
        alunoTecnico.pagaraMensalidade();
        System.out.println();

        System.out.println("Visitante:");
        System.out.println(visitante.toString());
    }
}