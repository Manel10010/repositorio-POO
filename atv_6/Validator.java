package atv_6;

public class Validator {
    public static void runValidation(IEntityValidation e) {
        if (e.isValid()) {
            System.out.println("É valido.");
        } else {
            System.out.println("É invalido");
        }
    }
}
