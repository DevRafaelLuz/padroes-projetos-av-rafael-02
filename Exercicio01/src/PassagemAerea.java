import java.util.ArrayList;
import java.util.List;

public class PassagemAerea extends Passagem {
    @Override
    public double calcularTaxaEmbarque() {
        this.taxaEmbarque = obterTarifa() * 0.08;
    }

    public List<String> listarDocumentos() {
        List<String> docs = new ArrayList<>(List.of("documento de identidade com foto", "bilhete eletrônico (e-ticket)"));
        return docs;
    }

    @Override
    public double obterTarifa() {
        return 20.0;
    }

}
