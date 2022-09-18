package atv_4;

public abstract class Formato {
    private String cor;
    public abstract double area();
    
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
}
