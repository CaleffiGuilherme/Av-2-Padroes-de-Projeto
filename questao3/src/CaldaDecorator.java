package questao3.src;

public class CaldaDecorator extends absCondimentDecorator{
    public CaldaDecorator(iBebida bebida){
        super(bebida);
    }
    
    @Override
    public String Descricao() {
        return bebida.Descricao() + ", Calda";
    }

    @Override
    public double Preco() {
        return bebida.Preco() + 1.00;
    }
    
}
