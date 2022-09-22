package atv_6;

public class PersonIndividual extends Person{
    private String cpf;

    public PersonIndividual(String cpf) {
        this.cpf = cpf;
    }

    public String toString() {
        return "{INDIVIDUAL}, CPF: " + this.cpf;
    }

    @Override
    public boolean isValid() {
        return CpfValidator.isValidCPF(cpf);
    }
}
