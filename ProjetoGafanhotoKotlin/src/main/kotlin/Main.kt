fun main(args: Array<String>) {
    val video = Video("Vídeo Interessante", 0, 1, false, 0)
    val espectador = Gafanhoto("João", 25, "M", 0.0f, "joao123", 1)
    val visualizacao = Visualizacao(espectador, video)

    println("Informações do vídeo antes da avaliação:")
    println(video)

    println("Informações do espectador antes da avaliação:")
    println(espectador)

    println("Informações da visualização antes da avaliação:")
    println(visualizacao)

    visualizacao.avaliar(8f)

    println("\nInformações do vídeo após a avaliação:")
    println(video)

    println("Informações do espectador após a avaliação:")
    println(espectador)

    println("Informações da visualização após a avaliação:")
    println(visualizacao)

    video.like()

    println("\nInformações finais do vídeo:")
    println(video)
}