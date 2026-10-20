public class CriadorAerea extends CriadorPassagem {

    @Override
    public Passagem criarPassagem() {
        return new PassagemAerea();
    }

}
