public final class Professor extends Pessoa{
    private int salario;
    private String especialidade;
    
    public Professor(String nome, int idade, String sexo, int salario, String especialidade) {
        super(nome, idade, sexo);
        this.salario = salario;
        this.especialidade = especialidade;
    }

    public void receberAumento(int aumento){
        this.salario=salario+aumento;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    
}
