public class Professor extends Pessoa{
    private String especialidade;
    private float salario;

    public Professor(int idade, String nome, String sexo, String especialidade, float salario) {
        super(idade, nome, sexo);
        this.especialidade = especialidade;
        this.salario = salario;
    }
    

    public void recebeAumento(float aumento){
        this.salario=salario+aumento;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    @Override
    public String toString() {
        return "Professor [especialidade=" + especialidade + ", salario=" + salario + "]";
    }
    
}
