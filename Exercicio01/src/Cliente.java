public class Cliente {
    public static void main(String[] args) throws Exception {
        CriadorPassagem criadorAerea = new CriadorAerea();
        Passagem aerea = criadorAerea.criarPassagem();
        aerea.nomePassageiro = "Maria";
        aerea.taxaEmbarque = 10.5;
        aerea.listarDocumentos();
        System.out.print(aerea.gerarResumo());

        CriadorPassagem criadorRodoviaria = new CriadorRodoviaria();
        Passagem rodoviaria = criadorRodoviaria.criarPassagem();
        rodoviaria.nomePassageiro = "Ana";
        rodoviaria.taxaEmbarque = 8.9;
        rodoviaria.listarDocumentos();
        System.out.print(rodoviaria.gerarResumo());

        CriadorPassagem criadorFerroviaria = new CriadorFerroviaria();
        Passagem ferroviaria = criadorFerroviaria.criarPassagem();
        ferroviaria.nomePassageiro = "Paulo";
        ferroviaria.taxaEmbarque = 9.7;
        ferroviaria.listarDocumentos();
        System.out.print(ferroviaria.gerarResumo());
    }
}
