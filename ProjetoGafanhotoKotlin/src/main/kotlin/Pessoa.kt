open class Pessoa(
    protected var nome: String,
    protected var idade: Int,
    protected var sexo: String,
    protected var experiencia: Float
) {
    protected fun ganharExp() {
        experiencia++
    }

    override fun toString(): String {
        return "Pessoa [nome=$nome, idade=$idade, sexo=$sexo, experiencia=$experiencia]"
    }
}
