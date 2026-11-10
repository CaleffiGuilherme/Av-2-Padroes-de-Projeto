package questao2.src;

public class TarifaMensalista implements iTarifaStrategy{
    public static final double valor_fixo = 250.00;

    @Override
    public double calcular(int minutos) {
        return valor_fixo;
    }
    
}
