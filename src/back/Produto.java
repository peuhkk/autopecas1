package back;

public class Produto {

    public String nome;
    public double preco;
    public int estoque;
    public int id;

    public void addNoEstoque(int quantidade){
        for (int i = 0; i < 100; i++) {
            estoque += quantidade;
        }
    }
}
