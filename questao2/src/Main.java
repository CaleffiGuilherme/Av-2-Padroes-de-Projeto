package questao2.src;

public class Main {
    public static void main(String[] args) {
        Tiquete tiquete = new Tiquete("OBDC1917", 100, new TarifaRotativo());
        
        System.out.println("Tiquete: " + tiquete.getPlaca() + " | " + tiquete.getMinutos() + " minutos");
        
        System.out.printf("Rotativo: R$ %.2f%n", tiquete.calcularValor());

        tiquete.setPerfil(new TarifaMensalista());
        System.out.printf("Mensalista: R$ %.2f%n", tiquete.calcularValor());

        tiquete.setPerfil(new TarifaConveniado());
        System.out.printf("Conveniado: R$ %.2f%n", tiquete.calcularValor());

    }
}
