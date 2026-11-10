package questao2.src;

public class TarifaRotativo implements iTarifaStrategy{
    public static final double valor_hora = 12.00;

    @Override
    public double calcular(int minutos) {
        int horas = minutos / 60;
        if (minutos % 60 > 0){
            horas++;
        }

        return horas * valor_hora;
    }
    
}
