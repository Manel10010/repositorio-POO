package atv_4;

public abstract class Formato {
    private Cores cor;
    public abstract double area();
    
    public Formato(Cores cor) {
        this.cor = cor;
    }

    public Cores getCor() {
        return cor;
    }
    public void setCor(Cores cor) {
        this.cor = cor;
    }
}
