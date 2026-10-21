public class BoletaElectronica implements DocumentoFiscal {
    private double iva;

    @Override
    public String descricao() {
        return "Documento fiscal: Boleta electrónica | IVA: 19%";
    }
}
