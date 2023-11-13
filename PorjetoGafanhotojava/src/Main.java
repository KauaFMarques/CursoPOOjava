public class Main {
    public static void main(String[] args) {
        /*Video v[]=new Video[2];
      v[0]=new Video("Aula 1poo", 0, 0, false, 0)*/
        // Criar um vídeo
        Video video = new Video("Vídeo Interessante", 0, 0, false, 0);

        // Criar um gafanhoto (espectador)
        Gafanhoto espectador = new Gafanhoto("João", 25, "M", 0, "joao123", 0);

        // Criar uma visualização
        Visualizacao visualizacao = new Visualizacao(espectador, video);

        // Mostrar informações antes da avaliação
        System.out.println("Informações do vídeo antes da avaliação:");
        System.out.println(video);
        System.out.println("Informações do espectador antes da avaliação:");
        System.out.println(espectador);
        System.out.println("Informações da visualização antes da avaliação:");
        System.out.println(visualizacao);

        // Avaliar o vídeo com nota 8
        visualizacao.avaliar(8);

        // Mostrar informações após a avaliação
        System.out.println("\nInformações do vídeo após a avaliação:");
        System.out.println(video);
        System.out.println("Informações do espectador após a avaliação:");
        System.out.println(espectador);
        System.out.println("Informações da visualização após a avaliação:");
        System.out.println(visualizacao);

        // Simulando play, pause e like
        visualizacao.getFilme().play();
        visualizacao.getFilme().pause();
        visualizacao.getFilme().like();

        // Mostrar informações finais
        System.out.println("\nInformações finais do vídeo:");
        System.out.println(video);
    }
}