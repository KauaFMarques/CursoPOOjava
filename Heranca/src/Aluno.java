public class Aluno extends Pessoa{
    private int matricula;
    private String curso;

    public Aluno(int idade, String nome, String sexo, int matricula, String curso) {
        super(idade, nome, sexo);
        this.matricula = matricula;
        this.curso = curso;
    }

    public void cancelarmatricula(){
        System.out.println("Matricula cancelada!");
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    

    @Override
    public String toString() {
        return "Aluno [matricula=" + matricula + ", curso=" + curso + "]";
    }


}
