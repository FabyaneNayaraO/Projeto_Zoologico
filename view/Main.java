package view;

import java.util.ArrayList;
import java.util.Scanner;

import controller.Controller;
import model.Animal;

public class Main {

    public static void main(String[] args) {
        ArrayList<Animal> animais = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        Controller controller = new Controller();

        while (true) {
            try {
                sc = new Scanner(System.in);
                int opcao = exibirMenu(sc);

                switch (opcao) {
                    case 1:
                        controller.inserirAnimal(animais, sc);
                        break;
                    case 2:
                        controller.removerAnimal(animais, sc);
                        break;
                    case 3:
                        controller.exibirAnimais(animais);
                        break;
                    case 0:
                        System.out.println("Saindo...");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Opção inválida");
                        continue;
                }
            } catch (Exception e) {
                System.out.println("Valor invalido!");
                continue;
            }
        }
    }

    public static int exibirMenu(Scanner sc) {
        System.out.println("Selecione uma opção:");
        System.out.println("1 - Inserir animal");
        System.out.println("2 - Remover animal");
        System.out.println("3 - Exibir animais");
        System.out.println("0 - Sair");
        return sc.nextInt();
    }

    public static int exibirMenuAnimais(Scanner sc) {
        System.out.println("Selecione uma opção:");
        System.out.println("1 - Leão");
        System.out.println("2 - Lobo");
        System.out.println("3 - Pato");
        System.out.println("4 - Águia");
        return sc.nextInt();
    }

    public static void exibirAnimais(ArrayList<Animal> animais) {
        if (animais.isEmpty()) {
            System.out.println("Não há animais cadastrados.");
            return;
        }
        for (Animal animal : animais) {
            System.out.println(animal);
        }
    }

}
