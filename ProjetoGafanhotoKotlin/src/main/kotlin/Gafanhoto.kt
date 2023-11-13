class Gafanhoto(
    nome: String,
    idade: Int,
    sexo: String,
    experiencia: Float,
    private val login: String,
    private var totAssistido: Int
) : Pessoa(nome, idade, sexo, experiencia) {

    fun getLogin(): String {
        return login
    }

    fun getTotAssistido(): Int {
        return totAssistido
    }

    fun setTotAssistido(totAssistido: Int) {
        this.totAssistido = totAssistido
    }

    override fun toString(): String {
        return "Gafanhoto [login=$login, totAssistido=$totAssistido, ${super.toString()}]"
    }
}
