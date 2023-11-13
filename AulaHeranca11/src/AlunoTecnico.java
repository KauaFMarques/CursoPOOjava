public final class AlunoTecnico extends Aluno{
    /*private String registroProfissional;

    public void praticar(){
        System.out.println("O aluno:"+this.nome+" está praticando.");
    }

    public String getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(String registroProfissional) {
        this.registroProfissional = registroProfissional;
    }*/
    private String registroProfissional;

    
    public AlunoTecnico(String nome, int idade, String sexo, int matricula, String curso, String registroProfissional) {
        super(nome, idade, sexo, matricula, curso);
        this.registroProfissional = registroProfissional;
    }

    public void praticar() {
        System.out.println("O aluno " + this.getNome() + " está praticando.");
    }

    public String getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(String registroProfissional) {
        this.registroProfissional = registroProfissional;
    
}
}
