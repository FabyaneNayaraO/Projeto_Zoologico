package model;

public class Aguia extends Ave {

    private boolean gerouFilhos;

    public Aguia(int id, String nome, int idade, double peso, double envergadura, boolean gerouFilhos) {
        super(id, nome, idade, peso, envergadura, true);
        this.gerouFilhos = gerouFilhos;
    }

    public boolean isGerouFilhos() {
        return gerouFilhos;
    }

    @Override
    public void familia() {
        System.out.println("Família de Accipitridae");
    }

    public boolean ehVoador() {
        return true;
    }

    @Override
    public String toString() {
        return "Águia: " + super.toString() + ", gerou filhos? " + (gerouFilhos ? "Sim" : "Não");
    }

}
