package questao1.src;

import java.util.List;
import java.util.ArrayList;

public class Auditoria extends absObservador{
    private final List<String> registros = new ArrayList<>();

    @Override
    public void update(Produto produto, int quantidadeAnterior) {
        String registro = produto.getNome() + ": " + quantidadeAnterior + " -> " + produto.getQuantidade() + " unidades";
        registros.add(registro);
        System.out.println("Auditoria: " + registro);
    }

    public List<String> getRegistros(){
        return registros;
    }
}
