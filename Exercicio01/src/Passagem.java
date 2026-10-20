import java.time.LocalDate;
import java.util.List;

public abstract class Passagem {
    private String nomePassageiro;
    private double taxaEmbarque;

    public abstract String obterModal();

    public abstract double calcularTaxaEmbarque();

    public String gerarResumo() {
        return "Modal: " + this.modal + 
               "\nNome: " + this.nomePassageiro +
               "\nTaxa de Embarque: " + this.taxaEmbarque +
               "\nDocumentos: " + this.listarDocumentos();
    }

    public abstract double obterTarifa();
}