package questao1.src;
import java.util.List;
import java.util.ArrayList;

public abstract class absObservado {
    protected final List<absObservador> listaObservadores = new ArrayList<>();

    public void inscrever(absObservador observador) {
        if (!listaObservadores.contains(observador)) {
            listaObservadores.add(observador);
        }
    }

    public void remover(absObservador observador) {
        listaObservadores.remove(observador);
    }
}
