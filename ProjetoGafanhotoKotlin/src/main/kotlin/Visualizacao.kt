class Visualizacao(private var espectador: Gafanhoto, private var filme: Video) {

    init {
        this.espectador.setTotAssistido(this.espectador.getTotAssistido() + 1)
        this.filme.setViews(this.filme.getViews() + 1)
    }

    fun avaliar() {
        this.filme.setAvaliacao(5)
    }

    fun avaliar(nota: Int) {
        this.filme.setAvaliacao(nota)
    }

    fun avaliar(porc: Float) {
        val tot: Int = when {
            porc <= 20 -> 3
            porc <= 50 -> 5
            porc <= 90 -> 8
            else -> 10
        }
        this.filme.setAvaliacao(tot)
    }

    fun getEspectador(): Gafanhoto {
        return espectador
    }

    fun setEspectador(espectador: Gafanhoto) {
        this.espectador = espectador
    }

    fun getFilme(): Video {
        return filme
    }

    fun setFilme(filme: Video) {
        this.filme = filme
    }

    override fun toString(): String {
        return "Visualizacao [espectador=$espectador, filme=$filme]"
    }
}
