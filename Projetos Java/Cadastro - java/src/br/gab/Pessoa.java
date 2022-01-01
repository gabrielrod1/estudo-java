package br.gab;

import java.util.Scanner;

public class Pessoa {
    private String nome;
    private int idade;
    private String genero;
    private String CPF;

    Scanner teclado = new Scanner(System.in);

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

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public void cadastrar(){
        System.out.printf("Digite seu nome: \n");
        nome = teclado.next();
        System.out.printf("Informe sua idade: \n");
        idade = teclado.nextInt();
        System.out.printf("Informe seu CPF: \n");
        CPF = teclado.next();
        System.out.printf("Informe seu genero: \n");
        genero = teclado.next();
    }
    public void mostrarUsuarios(){
        if (nome == null){
            System.out.printf("Nenhum usuario cadastrado.");
        }
        else {
            System.out.printf("Nome: " + nome + "\n");
            System.out.printf("CPF: " + CPF + "\n");
            System.out.printf("Idade: " + idade + "\n");
            System.out.printf("Sexo: " + genero + "\n\n\n");
        }

    }
}
