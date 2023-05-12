package model;

public class Pato extends Ave {

    private String corPena;

    public Pato(int id, String nome, int idade, double peso, double envergadura, String corPena) {
        super(id, nome, idade, peso, envergadura, false);
        this.corPena = corPena;
    }

    public String getCorPena() {
        return corPena;
    }

    @Override
    public void familia() {
        System.out.println("Família de Anatídeos");
    }

    public boolean ehVoador() {
        return false;
    }

    @Override
    public String toString() {
        return "Pato: " + super.toString() + ", cor da pena: " + corPena;
    }

}
