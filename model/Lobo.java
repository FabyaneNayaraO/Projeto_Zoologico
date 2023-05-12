package model;

public class Lobo extends Mamifero {

    private boolean ehAlpha;

    public Lobo(int id, String nome, int idade, double peso, int pelos, boolean ehAlpha) {
        super(id, nome, idade, peso, pelos);
        this.ehAlpha = ehAlpha;
    }

    @Override
    public String alimentacao() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'alimentacao'");
    }

    // Getters e Setters
    public boolean isEhAlpha() {
        return ehAlpha;
    }

}
