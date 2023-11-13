public class Gafanhoto extends Pessoa {
    private String login;
    private int totAssistido;

    public Gafanhoto(String nome, int idade, String sexo, float experiencia, String login, int totAssistido) {
        super(nome, idade, sexo, experiencia);
        this.login = login;
        this.totAssistido = totAssistido;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }

    public void assistirMaisUm() {
        this.totAssistido++;
    }

    // Método sobrescrito da classe Pessoa para ganhar experiência
    @Override
    protected void ganharExp() {
        this.experiencia += 0.5f;
    }

    @Override
    public String toString() {
        return "Gafanhoto [login=" + login + ", totAssistido=" + totAssistido + ", " + super.toString() + "]";
    }
}
