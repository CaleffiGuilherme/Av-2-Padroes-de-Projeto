package questao1.src;

public class Main {
    public static void main(String[] args) {
    
        Produto produto = new Produto("Cafe", 10);
        Compras compras = new Compras();
        Vendas vendas = new Vendas();
        Auditoria auditoria = new Auditoria();
        produto.inscrever(compras);
        produto.inscrever(vendas);
        produto.inscrever(auditoria);

        produto.setQuantidade(4);
        produto.setQuantidade(0);
        produto.setQuantidade(8);

        System.out.println("Repetindo 8");
        produto.setQuantidade(8);

        System.out.println("Removendo Compras");
        produto.remover(compras);
        produto.setQuantidade(2);

        System.out.println("Reinscrevendo Compras");
        produto.inscrever(compras);
        produto.setQuantidade(1);

        System.out.println("Total de alterações: " + auditoria.getRegistros().size());


    }
}
