package questao1.src;

public class Compras extends absObservador{

    @Override
    public void update(Produto produto, int quantidadeAnterior) {
        if (produto.getQuantidade() < 5){
            System.out.println("Compras: estoque baixo de " + produto.getNome() + ": " + produto.getQuantidade() + " unidades");
        }
    }
    
}
