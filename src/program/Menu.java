package program;

import back.Produto;

import java.util.Scanner;
import java.util.Locale;

public class Menu {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String[] produto = new String[100];
        Produto p = new Produto();

        String escolha = "menu";
        int busca = 0;

       while(escolha.contains("menu")) {
            System.out.println("╔══════════════════════════════╗");
            System.out.println("║      SISTEMA DE ESTOQUE      ║");
            System.out.println("╠══════════════════════════════╣");
            System.out.println("║                              ║");
            System.out.println("║  1 -      Menu               ║");
            System.out.println("║  2 -      Cadastro           ║");
            System.out.println("║  4 -      Sair               ║");
            System.out.println("║                              ║");
            System.out.println("╚══════════════════════════════╝");

            escolha = sc.next();
            sc.nextLine();

           if (escolha.equals("4")){
               break;
           }

            if (escolha.equals("1")) {
                for (int i = 0; escolha.equals("1"); i++) {
                    System.out.println("╔══════════════════════════════╗");
                    System.out.println("║       CADASTRE A PEÇA        ║");
                    System.out.println("╚══════════════════════════════╝");

                    System.out.print("Nome da peça: ");
                    p.nome = sc.nextLine();
                    System.out.print("Quantidade à adicionar ao estoque: ");
                    p.stock = sc.nextInt();
                    System.out.print("Valor da peça: ");
                    p.preco = sc.nextDouble();
                    System.out.print("Identificação: ");
                    p.id = sc.nextInt();
                    sc.nextLine();

                    System.out.println("╔═══════════════════════════════╗");
                    System.out.println("║  Peça cadastrada com Sucesso! ║");
                    System.out.println("╚═══════════════════════════════╝");
                    System.out.println("====== Informações da peça ======");
                    System.out.println("Nome: " + p.nome);
                    System.out.printf("Valor da peca: R$ %.2f%n", p.preco);
                    System.out.println("ID da Peça: " + p.id);
                    System.out.println("Estoque atualizado: " + p.stock);

                    System.out.println("");
                    System.out.println("Para voltar digite 1!");
                    System.out.println("Para cadastrar outro, digite 2");
                    escolha = sc.nextLine();
                }
            }

        }
    }
}