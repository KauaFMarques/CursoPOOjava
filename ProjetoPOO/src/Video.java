public class Video implements AcoesVideo{
    private String titulo;
    private String avaliacao;
    private int views;
    private boolean reproduzindo;
    public int curtidas;

    public Video(String titulo, String avaliacao, int views, boolean reproduzindo, int curtidas) {
        this.titulo = titulo;
        this.avaliacao = avaliacao;
        this.views = views;
        this.reproduzindo = reproduzindo;
        this.curtidas = curtidas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(String avaliacao) {
        this.avaliacao = avaliacao;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public boolean isReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    @Override
    public void play() {

    }

    @Override
    public void pause() {

    }

    @Override
    public void like() {

    }
}
