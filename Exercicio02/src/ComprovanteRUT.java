public class ComprovanteRUT implements ComprovanteMatricula {
    private String identificacao;

    @Override
    public String descricao() {
        return "Comprovante de matrícula | Identificação: RUT";
    }
}
