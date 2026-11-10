package questao3.src;

public class ChantillyDecorator extends absCondimentDecorator {
    public ChantillyDecorator(iBebida bebida) {
        super(bebida);
    }

    @Override
    public String Descricao() {
        return bebida.Descricao() + ", Chantilly";
    }

    @Override
    public double Preco() {
        return bebida.Preco() + 2.00;
    }
}
