package br.gab;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int opcao = 0;
    Calculadora calculadora = new Calculadora();

	while (opcao !=3) {
	    System.out.printf("\nSelecione uma operação na qual deseja executar: \n");
	    System.out.printf("1- Adição\n");
	    System.out.printf("2- Subtração\n");
	    System.out.printf("3- Multiplicação\n");
	    System.out.printf("4- Divisão\n");
        Scanner teclado = new Scanner(System.in);
        opcao = teclado.nextInt();

        switch (opcao) {
            case 1:
             calculadora.adicao();
                break;
            case 2:
             calculadora.subtracao();
                break;
            case 3:
             calculadora.multiplicacao();
                break;
            case 4:
             calculadora.divisao();
                break;
        }
    }
    }
}
