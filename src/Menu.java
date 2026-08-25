import java.util.Scanner;
import java.util.Locale;

public class Menu {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        byte escolha = 0;
        String escolhaSair = " ";

        while (escolhaSair != "sim") {
        System.out.println("╔══════════════════════════════╗");
        System.out.println("║      SISTEMA DE ESTOQUE      ║");
        System.out.println("╠══════════════════════════════╣");
        System.out.println("║                              ║");
        System.out.println("║  1 - BUSCA                   ║");
        System.out.println("║  2 - CADASTRO                ║");
        System.out.println("║  3 - SAIR                    ║");
        System.out.println("║                              ║");
        System.out.println("╚══════════════════════════════╝");

        escolha = sc.nextByte();
        sc.nextLine();
// FASE DE TESTE
            if (escolha == 1) {
                while (escolhaSair != "sim") {
                    System.out.println("Digite o ID para buscar a peça");
                    byte busca = sc.nextByte();
                    sc.nextLine();
                    System.out.println("Deseja sair?");
                    escolhaSair = sc.nextLine();
                }
            }


            if (escolha == 2) {
                System.out.println("╔══════════════════════════════╗");
                System.out.println("║       CADASTRE A PEÇA        ║");
                System.out.println("╚══════════════════════════════╝");

                System.out.print("Nome da peça: ");
                String nomePeca = sc.nextLine();
                System.out.print("Quantidade à adicionar ao estoque: ");
                int quantidadeAdd = sc.nextInt();
                System.out.print("Valor da peça: ");
                double valorPeca = sc.nextDouble();
                System.out.print("Identificação: ");
                int idPeca = sc.nextInt();

                System.out.println("╔═══════════════════════════════╗");
                System.out.println("║  Peça cadastrada com Sucesso! ║");
                System.out.println("╚═══════════════════════════════╝");
                System.out.println("====== Informações da peça ======");
                System.out.println("Nome: " + nomePeca);
                System.out.printf("Valor da peca: R$ %.2f%n", valorPeca);
                System.out.println("ID da Peça: " + idPeca);
                System.out.println("Estoque atualizado: " + quantidadeAdd);
            }
        }
    }
}