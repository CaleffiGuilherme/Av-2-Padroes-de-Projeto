package questao1.src;

public class Produto extends absObservado{
    private final String nome;
    private int quantidade;

    public Produto(String nome, int quantidade){
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public String getNome(){
        return nome;
    }

    public int getQuantidade(){
        return quantidade;
    }

    public void setQuantidade(int novaQuantidade){
        if (quantidade != novaQuantidade){
            int quantidadeAnterior = quantidade;
            quantidade = novaQuantidade;
            for(absObservador observador : listaObservadores){
                observador.update(this, quantidadeAnterior);
            }
        }
    }

}
