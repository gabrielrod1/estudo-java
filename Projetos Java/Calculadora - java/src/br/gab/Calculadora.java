package br.gab;

import java.util.Scanner;

public class Calculadora {
    private int valor1;
    private int valor2;
    private int resultado;

    Scanner teclado = new Scanner(System.in);

    public int getValor1() {
        return valor1;
    }

    public void setValor1(int valor1) {
        this.valor1 = valor1;
    }

    public int getValor2() {
        return valor2;
    }

    public void setValor2(int valor2) {
        this.valor2 = valor2;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

    public void adicao(){
        System.out.printf("Digite o primeiro valor: \n");
        valor1 = teclado.nextInt();
        System.out.printf("Digite o segundo valor: \n");
        valor2 = teclado.nextInt();
        resultado = valor1 + valor2;
        System.out.printf(String.valueOf(resultado));
    }
    public void subtracao(){
        System.out.printf("Digite o primeiro valor: \n");
        valor1 = teclado.nextInt();
        System.out.printf("Digite o segundo valor: \n");
        valor2 = teclado.nextInt();
        resultado = valor1 - valor2;
        System.out.printf(String.valueOf(resultado));
    }
    public void multiplicacao(){
        System.out.printf("Digite o primeiro valor: \n");
        valor1 = teclado.nextInt();
        System.out.printf("Digite o segundo valor: \n");
        valor2 = teclado.nextInt();
        resultado = valor1 * valor2;
        System.out.printf(String.valueOf(resultado));
    }
    public void divisao(){
        System.out.printf("Digite o primeiro valor: \n");
        valor1 = teclado.nextInt();
        System.out.printf("Digite o segundo valor: \n");
        valor2 = teclado.nextInt();
        resultado = valor1 / valor2;
        System.out.printf(String.valueOf(resultado));
    }
}
