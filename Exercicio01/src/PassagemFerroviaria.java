import java.util.ArrayList;
import java.util.List;

public class PassagemFerroviaria extends Passagem {
    @Override
    public double calcularTaxaEmbarque() {
        this.taxaEmbarque = obterTarifa() * 0.03;
    }

    public List<String> listarDocumentos() {
        List<String> docs = new ArrayList<>(List.of("documento de identidade com foto", "comprovante de reserva"));
        return docs;
    }

    @Override
    public double obterTarifa() {
        return 18.4;
    }

}
