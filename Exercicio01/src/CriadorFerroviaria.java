public class CriadorFerroviaria extends CriadorPassagem {

    @Override
    public Passagem criarPassagem() {
        return new PassagemFerroviaria();
    }

}
