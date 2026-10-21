public class FabricaChile implements FabricaArtefatos {
    @Override
    public DocumentoFiscal criarDocumentoFiscal() {
        return new BoletaElectronica();
    }

    @Override
    public Pagamento criarPagamento() {
        return new Webpay();
    }

    @Override
    public ComprovanteMatricula criarComprovante() {
        return new ComprovanteRUT();
    }
}
