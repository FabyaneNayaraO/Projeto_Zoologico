package model;

public class Leao extends Mamifero {
    private int vacinas;

    // Construtor
    public Leao(int id, String nome, int idade, double peso, int pelos, int vacinas) {
        super(id, nome, idade, peso, pelos);
        this.vacinas = vacinas;
    }

    // Getters e Setters
    public int getVacinas() {
        return vacinas;
    }

    public void setVacinas(int vacinas) {
        this.vacinas = vacinas;
    }

    // Sobrescrita de métodos
    @Override
    public void familia() {
        System.out.println("Família de Felinos");
    }

    @Override
    public String alimentacao() {
        return "Carne";
    }
}
