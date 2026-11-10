package questao2.src;

public class Tiquete {
    private final String placa;
    private final int minutos;
    private iTarifaStrategy perfil;

    public Tiquete(String placa, int minutos, iTarifaStrategy perfil){
        this.placa = placa;
        this.minutos = minutos;
        setPerfil(perfil);
    }

    public String getPlaca(){
        return placa;
    }

    public int getMinutos(){
        return minutos;
    }

    public void setPerfil(iTarifaStrategy perfil){
        this.perfil = perfil;
    }

    public double calcularValor(){
        return perfil.calcular(minutos);
    }
}
