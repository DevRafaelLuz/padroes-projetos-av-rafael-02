public class ComprovanteCPF implements ComprovanteMatricula {
    private String cpf;

    @Override
    public String descricao() {
        return "Comprovante de matrícula | Identificação: CPF";
    }
}
