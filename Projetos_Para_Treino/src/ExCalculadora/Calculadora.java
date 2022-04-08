package ExCalculadora;

import java.util.Scanner;

public class Calculadora {

    int escolhaOperacao;
    int continuar;
    double entrada1;
    double entrada2;
    double total;

    public void metodoSaida() {
        Scanner leia = new Scanner(System.in);
        Calculadora interligar = new Calculadora();

        System.out.println("\nDigite o Primeiro Valor: ");
        entrada1 = leia.nextInt();

        System.out.println("\nDigite o Segundo Valor: ");
        entrada2 = leia.nextInt();

        System.out.println("\nDigite 1 para Somar, 2 para Subtrair, 3 para Multiplicar ou 4 para dividir: ");
        escolhaOperacao = leia.nextInt();
        metodoSaida2();

    }

    public void metodoSaida2() {
        Calculadora interligar = new Calculadora();
        switch (escolhaOperacao) {
            case 1 -> total = entrada1 + entrada2;
            case 2 -> total = entrada1 - entrada2;
            case 3 -> total = entrada1 * entrada2;
            case 4 -> total = entrada1 / entrada2;
            default -> {
                System.out.println("\nOpção Inválida !");
                interligar.metodoSaida();
            }
        }
        System.out.println("\nO Resultado é : " + String.format("%.0f", total));
        interligar.metodoSaida3();

    }

    public void metodoSaida3() {
        Scanner leia = new Scanner(System.in);
        Calculadora interligar = new Calculadora();
        System.out.println("\nDeseja realizar outra operação? Digite 1 para continuar ou 2 para sair :");
        continuar = leia.nextInt();

        switch (continuar) {
            case 1 -> interligar.metodoSaida();
            case 2 -> System.out.println("\nObrigade !");
            default -> {
                System.out.println("\nOpção inválida!");
                interligar.metodoSaida3();
            }
        }
    }
}
