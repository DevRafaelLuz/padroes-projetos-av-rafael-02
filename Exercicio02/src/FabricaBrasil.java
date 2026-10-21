public class FabricaBrasil implements FabricaArtefatos {
    @Override
    public DocumentoFiscal criarDocumentoFiscal() {
        return new NFSe();
    }

    @Override
    public Pagamento criarPagamento() {
        return new Pix();
    }

    @Override
    public ComprovanteMatricula criarComprovante() {
        return new ComprovanteCPF()
    }
}
