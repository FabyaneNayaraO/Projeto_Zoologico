package controller;

import java.util.ArrayList;
import java.util.Scanner;

import model.Aguia;
import model.Animal;
import model.Leao;
import model.Lobo;
import model.Pato;

public class Controller {

    public Controller() {
    }

    public void exibirAnimais(ArrayList<Animal> animais) {
        if (animais.isEmpty()) {
            System.out.println("Não há animais cadastrados.");
            return;
        }
        for (Animal animal : animais) {
            System.out.println(animal);
        }
    }

    public void inserirAnimal(ArrayList<Animal> animais, Scanner sc) {

        int animalSelecionado = exibirMenuAnimais(sc);

        System.out.println("Digite o ID do animal:");
        int id = sc.nextInt();
        System.out.println("Digite o nome do animal:");
        String nome = sc.next();
        System.out.println("Digite a idade do animal:");
        int idade = sc.nextInt();
        System.out.println("Digite o peso do animal:");
        double peso = sc.nextDouble();

        Animal animal;
        sc.nextLine();
        switch (animalSelecionado) {
            case 1:
                System.out.println("Digite a quantidade de vacinas do leão:");
                int vacinas = sc.nextInt();
                animal = new Leao(id, nome, idade, peso, idade, vacinas);
                break;
            case 2:
                System.out.println("Digite a quantidade de pelos do lobo:");
                int pelos = sc.nextInt();
                System.out.println("O lobo é o alpha? (S/N)");
                String resposta = sc.next();
                boolean ehAlpha = resposta.equalsIgnoreCase("S");
                animal = new Lobo(id, nome, idade, peso, pelos, ehAlpha);
                break;
            case 3:
                System.out.println("Digite a envergadura do pato:");
                double envergadura = sc.nextDouble();
                System.out.println("Digite a cor da pena do pato:");
                String corPena = sc.next();
                animal = new Pato(id, nome, idade, peso, envergadura, corPena);
                break;
            case 4:
                System.out.println("Digite a envergadura da águia:");
                envergadura = sc.nextDouble();
                System.out.println("A águia gerou filhotes? (S/N)");
                resposta = sc.next();
                boolean gerouFilhos = resposta.equalsIgnoreCase("S");
                animal = new Aguia(id, nome, idade, peso, envergadura, gerouFilhos);
                break;
            default:
                System.out.println("Opção inválida");
                return;
        }

        animais.add(animal);
        System.out.println(animal.getClass().getSimpleName() + " inserido com sucesso!");
    }

    public void removerAnimal(ArrayList<Animal> animais, Scanner sc) {
        if (animais.isEmpty()) {
            System.out.println("Não há animais cadastrados.");
            return;
        }
        System.out.println("Digite o ID do animal que deseja remover:");
        int idRemover = sc.nextInt();

        Animal animalRemovido = null;
        for (Animal animal1 : animais) {
            if (animal1.getId() == idRemover) {
                animalRemovido = animal1;
                animais.remove(animal1);
                break;
            }
        }
        if (animalRemovido == null) {
            System.out.println("Animal não encontrado.");
        } else {
            System.out.println(animalRemovido.getClass().getSimpleName() + " removido com sucesso!");
        }

    }

    public static int exibirMenuAnimais(Scanner sc) {
        System.out.println("Selecione uma opção:");
        System.out.println("1 - Leão");
        System.out.println("2 - Lobo");
        System.out.println("3 - Pato");
        System.out.println("4 - Águia");
        return sc.nextInt();
    }
}
