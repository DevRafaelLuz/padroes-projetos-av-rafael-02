import java.util.ArrayList;
import java.util.List;

public class PassagemRodoviaria extends Passagem {
    @Override
    public double calcularTaxaEmbarque() {
        this.taxaEmbarque = obterTarifa() * 0.05;
    }

    public List<String> listarDocumentos() {
        List<String> docs = new ArrayList<>(List.of("documento de identidade com foto"));
        return docs;
    }

    @Override
    public double obterTarifa() {
        return 16.9;
    }

}
