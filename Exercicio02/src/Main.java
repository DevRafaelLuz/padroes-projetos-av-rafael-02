public class App {
    public static void main(String[] args) throws Exception {
        FabricaArtefatos fabrica = new FabricaChile();

        Matricula matricula = new Matricula(fabrica);

        matricula.imprimirRelatorio();

        System.out.println();

        FabricaArtefatos fabricaBrasil = new FabricaBrasil();

        Matricula matriculaBrasil = new Matricula(fabricaBrasil);

        matriculaBrasil.imprimirRelatorio();
    }
}
