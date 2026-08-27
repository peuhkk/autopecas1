import java.util.Scanner;
import java.util.Locale;

public class Menu {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        String[] nomePeca = new String[100];
        int[] quantidadeAdd = new int[100];
        double[] valorPeca = new double[100];
        int[] idPeca = new int[100];

        String escolha = "1";
        int busca = 0;

       while(escolha.equals("1")) {
            System.out.println("╔══════════════════════════════╗");
            System.out.println("║      SISTEMA DE ESTOQUE      ║");
            System.out.println("╠══════════════════════════════╣");
            System.out.println("║                              ║");
            System.out.println("║  1 -      Menu               ║");
            System.out.println("║  2 -      Cadastro           ║");
            System.out.println("║  3 -      Buscar             ║");
            System.out.println("║  4 -      Sair               ║");
            System.out.println("║                              ║");
            System.out.println("╚══════════════════════════════╝");

            escolha = sc.next();
            sc.nextLine();

            if (escolha.equals("4")){
                break;
            }

            if (escolha.equals("3")){
                while (escolha.equals("3")){
                        System.out.println("Digite o id da peça que deseja buscar: ");
                        busca = sc.nextInt();
                        sc.nextLine();
                        for (int i = 0;!escolha.equals("1") ; i++){
                        if (busca == idPeca[i]){
                            System.out.println("ID: "+ idPeca[i]);
                            System.out.println("Nome da peça: "+ nomePeca[i]);
                            System.out.println("Valor da peça: "+ valorPeca[i]);
                            System.out.println("");
                            System.out.println("Para voltar, digite 1");
                            escolha = sc.nextLine();
                        } else {
                            System.out.println("Peça não encontrada, ou não foi cadastrada!");
                            escolha = "1";
                        }

                    }
                }
            }

            if (escolha.equals("2")) {
                for (int i = 0; escolha.equals("2"); i++) {
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

                    System.out.println("");
                    System.out.println("Para voltar digite 1!");
                    System.out.println("Para cadastrar outro, digite 2");
                    escolha = sc.nextLine();
                }
            }

        }
    }
}