package br.gab;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
     int opcao = 0;
     Pessoa pessoa = new Pessoa();

     while (opcao !=3){
      System.out.printf("Selecione a opção desejada: \n");
      System.out.printf("1- Cadastrar usuário.\n");
      System.out.printf("2- Ver usuários cadastrados.\n");
      System.out.printf("3- Sair.\n");
         Scanner teclado = new Scanner(System.in);
         opcao = teclado.nextInt();

         switch (opcao) {
             case 1:
             pessoa.cadastrar();
             System.out.printf("As informações digitadas foram: \n");
             pessoa.mostrarUsuarios();
                 break;
             case 2:
             pessoa.mostrarUsuarios();
                 break;
             case 3:
              System.exit(0);
                 break;
         }
     }
    }
}
