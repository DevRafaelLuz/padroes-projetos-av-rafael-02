public class CriadorRodoviaria extends CriadorPassagem {

    @Override
    public Passagem criarPassagem() {
        return new PassagemRodoviaria();
    }

}
