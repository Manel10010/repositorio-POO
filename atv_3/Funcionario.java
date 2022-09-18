package atv_3;

public class Funcionario {
    private String nome;
    private double salarioBruto;
    private double imposto;

    public double salarioLiquido() {
        return this.salarioBruto - this.imposto;
    }

    public void status() {
        System.out.printf("Funcionário: " + this.nome + ", R$ %.2f%n", this.salarioLiquido());
    }

    public void aumentarSalario(double porcentagem) {
        this.setSalarioBruto(this.salarioBruto + (this.salarioBruto*porcentagem/100));
    }
    
    //Métodos especiais
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

    
}
