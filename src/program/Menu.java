package program;

import back.Produto;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Produto[] p = new Produto[100];

        String escolha = "menu";
        int busca = 0;

       while(escolha.equals("menu") || escolha.equals("1")) {
            System.out.println("╔══════════════════════════════╗");
            System.out.println("║      SISTEMA DE ESTOQUE      ║");
            System.out.println("╠══════════════════════════════╣");
            System.out.println("║                              ║");
            System.out.println("║  1 -      Menu               ║");
            System.out.println("║  2 -      Cadastro           ║");
            System.out.println("║  3 -      Busca              ║");
            System.out.println("║                              ║");
            System.out.println("╚══════════════════════════════╝");

            escolha = sc.next();
            sc.nextLine();

            if (escolha.equals("2")) {
                for (int i = 0; escolha.equals("2"); i++) {
                    System.out.println("╔══════════════════════════════╗");
                    System.out.println("║       CADASTRE A PEÇA        ║");
                    System.out.println("╚══════════════════════════════╝");

                    System.out.print("Nome da peça: ");
                    p[i].nome = sc.nextLine();
                    System.out.print("Quantidade à adicionar ao estoque: ");
                    p[i].addNoEstoque(sc.nextInt());
                    System.out.print("Valor da peça: ");
                    p[i].preco = sc.nextDouble();
                    System.out.print("Identificação: ");
                    p[i].id = sc.nextInt();
                    sc.nextLine();

                    System.out.println("╔═══════════════════════════════╗");
                    System.out.println("║  Peça cadastrada com Sucesso! ║");
                    System.out.println("╚═══════════════════════════════╝");
                    System.out.println("");
                    System.out.println("====== Informações da peça ======");
                    System.out.println("");
                    System.out.println("Nome: " + p[i].nome);
                    System.out.printf("Valor da peca: R$ %.2f%n", p[i].preco);
                    System.out.println("ID da Peça: " + p[i].id);
                    System.out.println("Estoque atualizado: " + p[i].estoque +" "+ p[i].nome);
                    System.out.println("");
                    System.out.println("=================================");
                    System.out.println("| 1 - Voltar ao menu | 2 - Cadastrar outra peça |");
                    System.out.println("Para cadastrar outro, digite 2");
                    escolha = sc.nextLine();
                }
            }

            if (escolha.equals("3")){
                for (int i = 0 ; escolha.equals("3"); i++){
                System.out.println("DIgite o id: ");
                busca = sc.nextInt();
                sc.nextLine();
                    if (busca == p[i].id) {
                        System.out.println("Nome da peça: " + p[i].nome);
                        System.out.printf("Valor da peça: R$ %.2f%n", p[i].preco);
                        System.out.println("Quantidade em estoque: " + p[i].estoque);
                        System.out.println("");
                        System.out.println("Digite menu para voltar ao menu: ");
                        System.out.println("Digite 3 para buscar novamente: ");
                        escolha = sc.next();
                    } else {
                        System.out.println("Peça não encontrada com esse ID");
                        System.out.println("| 1 - Menu | 3 - Buscar novamente |");
                        escolha = sc.nextLine();
                    }
                }
            }

        }
    }
}