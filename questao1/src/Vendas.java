package questao1.src;

public class Vendas extends absObservador{

    @Override
    public void update(Produto produto, int quantidadeAnterior) {
        if(quantidadeAnterior == 0 && produto.getQuantidade() > 0){
            System.out.println("Vendas: " + produto.getNome() + " voltou ao estoque: " + produto.getQuantidade() + " unidades");
        }
    }
    
}
