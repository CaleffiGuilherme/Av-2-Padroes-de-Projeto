package questao3.src;

public class Main {
    public static void main(String[] args) {
        iBebida pedido1 = new LeiteDecorator(new Espresso());
        iBebida pedido2 = new CaldaDecorator(new ChantillyDecorator(new Cha()));
        iBebida pedido3 = new LeiteDecorator(new LeiteDecorator(new Espresso()));

        exibirPedido(pedido1);
        exibirPedido(pedido2);
        exibirPedido(pedido3);
    }

    private static void exibirPedido(iBebida pedido) {
        System.out.printf("%s | Total: R$ %.2f%n", pedido.Descricao(), pedido.Preco());
    }
}
