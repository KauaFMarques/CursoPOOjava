class Video(
    private var titulo: String,
    private var avaliacao: Int,
    private var views: Int,
    private var reproduzindo: Boolean,
    private var curtidas: Int
) : AcoesVideo {

    override fun play() {
        reproduzindo = true
    }

    override fun pause() {
        reproduzindo = false
    }

    override fun like() {
        curtidas++
    }

    fun getTitulo(): String {
        return titulo
    }

    fun setTitulo(titulo: String) {
        this.titulo = titulo
    }

    fun getAvaliacao(): Int {
        return avaliacao
    }

    fun setAvaliacao(avaliacao: Int) {
        val nova = (this.avaliacao + avaliacao) / this.views
        this.avaliacao = nova
    }

    fun getViews(): Int {
        return views
    }

    fun setViews(views: Int) {
        this.views = views
    }

    fun isReproduzindo(): Boolean {
        return reproduzindo
    }

    fun setReproduzindo(reproduzindo: Boolean) {
        this.reproduzindo = reproduzindo
    }

    fun getCurtidas(): Int {
        return curtidas
    }

    fun setCurtidas(curtidas: Int) {
        this.curtidas = curtidas
    }

    override fun toString(): String {
        return "Video [titulo=$titulo, avaliacao=$avaliacao, views=$views, reproduzindo=$reproduzindo, curtidas=$curtidas]"
    }
}
