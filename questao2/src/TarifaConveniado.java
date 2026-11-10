package questao2.src;

public class TarifaConveniado implements iTarifaStrategy {
    public static final int minutos_gratuitos = 30;
    public static final double valor_hora = 12.00;
    public static final double desconto_percentual = 20.00;

    @Override
    public double calcular(int minutos) {
        if(minutos <= minutos_gratuitos){
            return 0;
        }     

        int minutos_cobrados = minutos - minutos_gratuitos;
        int horas = minutos_cobrados / 60;
        if (minutos_cobrados % 60 > 0){
            horas++;
        }

        double valor = horas * valor_hora;
        double desconto = valor * desconto_percentual / 100;
        return valor - desconto;
    }
    
}
