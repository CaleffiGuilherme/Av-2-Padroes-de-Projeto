package questao3.src;

public abstract class absCondimentDecorator implements iBebida {
    protected final iBebida bebida;

    public absCondimentDecorator(iBebida bebida){
        this.bebida = bebida;
    }
}
