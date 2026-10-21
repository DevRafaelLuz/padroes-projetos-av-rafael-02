public class Matricula {
    private final DocumentoFiscal documentoFiscal;
    private final Pagamento pagamento;
    private final ComprovanteMatricula comprovante;

    public Matricula(FabricaArtefatos fabrica) {
        this.documentoFiscal = fabrica.criarDocumentoFiscal();
        this.pagamento = fabrica.criarPagamento();
        this.comprovante = fabrica.criarComprovante();
    }

    public void imprimirRalatorio() {
        System.out.println("=== RELATÓRIO DA MATRÍCULA ===");
        System.out.println(documentoFiscal.descricao());
        System.out.println(pagamento.descricao());
        System.out.println(comprovante.descricao());
        System.out.println("==============================");
    }
}
