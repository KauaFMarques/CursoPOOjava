public class Video implements AcoesVideo{
    private String titulo;
    private int avaliacao;
    private int views;
    private boolean reproduzindo;
    public int curtidas;

    public Video(String titulo, int avaliacao, int views, boolean reproduzindo, int curtidas) {
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

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        int nova;
        nova=((this.avaliacao+avaliacao)/this.views);
        this.avaliacao = nova;
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
        this.reproduzindo=true;
    }

    @Override
    public void pause() {
        this.reproduzindo=false;
    }

    @Override
    public void like() {
        this.curtidas++;
    }

    @Override
    public String toString() {
        return "Video [titulo=" + titulo + ", avaliacao=" + avaliacao + ", views=" + views + ", reproduzindo="
                + reproduzindo + ", curtidas=" + curtidas + "]";
    }
    
}
