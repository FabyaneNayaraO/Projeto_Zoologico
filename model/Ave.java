package model;

public class Ave extends Animal {
    private double envergadura;
    private boolean voa;

    public Ave(int id, String nome, int idade, double peso, double envergadura, boolean voa) {
        super(id, nome, idade, peso);
        this.envergadura = envergadura;
        this.voa = voa;
    }

    public boolean ehVoador() {
        return voa;
    }

    public double getEnvergadura() {
        return envergadura;
    }

    @Override
    public void familia() {
        System.out.println("Família de Aves");
    }

    @Override
    public String toString() {
        return super.toString() + ", envergadura: " + envergadura + ", voa? " + (voa ? "Sim" : "Não");
    }
}
