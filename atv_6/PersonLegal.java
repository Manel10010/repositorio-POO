package atv_6;

public class PersonLegal extends Person{
    private String cnpj;

    public PersonLegal(String cnpj) {
        this.cnpj = cnpj;
    }

    public String toString() {
        return "{INDIVIDUAL}, CPF: " + this.cnpj;
    }

    @Override
    public boolean isValid() {
        return CnpjValidator.isCNPJ(cnpj);
    }
}
