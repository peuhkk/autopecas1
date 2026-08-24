import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[]args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("╔══════════════════════════════╗");
        System.out.println("║      SISTEMA DE ESTOQUE      ║");
        System.out.println("╠══════════════════════════════╣");
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
        System.out.println("Valor da peca: "+ valorPeca);
        System.out.println("ID da Peça: " + idPeca);
        System.out.println("Estoque atualizado: "+ quantidadeAdd);
        
    }
}