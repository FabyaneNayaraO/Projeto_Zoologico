package model;

public abstract class Mamifero extends Animal {
    private int pelos;

    // Construtor
    public Mamifero(int id, String nome, int idade, double peso, int pelos) {
        super(id, nome, idade, peso);
        this.pelos = pelos;
    }

    // Getters e Setters
    public int getPelos() {
        return pelos;
    }

    public void setPelos(int pelos) {
        this.pelos = pelos;
    }

    // Sobrescrita de métodos
    @Override
    public void familia() {
        System.out.println("Família de Mamíferos");
    }

    public String alimentacao() {
        return super.getAlimento();
    }

    @Override
    public String toString() {
        return super.toString() + ", pelos: " + pelos;
    }
}
