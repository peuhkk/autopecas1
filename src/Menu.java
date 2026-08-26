import java.util.Scanner;
import java.util.Locale;

public class Menu {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        byte escolha = 0;

        if (escolha != 2) {
            System.out.println("╔══════════════════════════════╗");
            System.out.println("║      SISTEMA DE ESTOQUE      ║");
            System.out.println("╠══════════════════════════════╣");
            System.out.println("║                              ║");
            System.out.println("║  1 -      Cadastro           ║");
            System.out.println("║  2 -        SAIR             ║");
            System.out.println("║                              ║");
            System.out.println("╚══════════════════════════════╝");

            escolha = sc.nextByte();
            sc.nextLine();

            String[] nomePeca = new String[100];
            int[] quantidadeAdd = new int[100];
            double[] valorPeca = new double[100];
            int[] idPeca = new int[100];

            if (escolha == 1) {
                for (int i = 0; i < 1; i++) {
                    System.out.println("╔══════════════════════════════╗");
                    System.out.println("║       CADASTRE A PEÇA        ║");
                    System.out.println("╚══════════════════════════════╝");

                    System.out.print("Nome da peça: ");
                    nomePeca[i] = sc.nextLine();
                    System.out.print("Quantidade à adicionar ao estoque: ");
                    quantidadeAdd[i] = sc.nextInt();
                    System.out.print("Valor da peça: ");
                    valorPeca[i] = sc.nextDouble();
                    System.out.print("Identificação: ");
                    idPeca[i] = sc.nextInt();
                    sc.nextLine();

                    System.out.println("╔═══════════════════════════════╗");
                    System.out.println("║  Peça cadastrada com Sucesso! ║");
                    System.out.println("╚═══════════════════════════════╝");
                    System.out.println("====== Informações da peça ======");
                    System.out.println("Nome: " + nomePeca[i]);
                    System.out.printf("Valor da peca: R$ %.2f%n", valorPeca[i]);
                    System.out.println("ID da Peça: " + idPeca[i]);
                    System.out.println("Estoque atualizado: " + quantidadeAdd[i]);

                    System.out.println("Você deseja voltar? digite 2");
                    escolha = sc.nextByte();
                }

            }

        }
    }
}