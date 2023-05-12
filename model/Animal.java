package model;

public abstract class Animal {
    private int id;
    private String nome;
    private int idade;
    private double peso;
    private String alimento = "";

    // Construtor
    public Animal(int id, String nome, int idade, double peso) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    // Métodos abstratos
    public abstract void familia();

    // Métodos comuns
    public void crescer() {
        this.idade++;
    }

    public void comer() {
        this.peso++;
    }

    public void atividadeFisica() {
        this.peso -= 2;
    }

    @Override
    public String toString() {
        return "id: " + id + ", nome: " + nome + ", idade: " + idade + ", peso: " + peso + ", alimento: " + alimento;
    }
}
