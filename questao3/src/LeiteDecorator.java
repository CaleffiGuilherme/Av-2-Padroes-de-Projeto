package questao3.src;

public class LeiteDecorator extends absCondimentDecorator {
    public LeiteDecorator(iBebida bebida) {
        super(bebida);
    }

    @Override
    public String Descricao() {
        return bebida.Descricao() + ", Leite";
    }

    @Override
    public double Preco() {
        return bebida.Preco() + 1.50;
    }
}
