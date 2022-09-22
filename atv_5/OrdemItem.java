package atv_5;

public class OrdemItem extends Product{
    private int quantity;
    private double price;

    public OrdemItem(int quantity, double price) {
        this.quantity = quantity;
        this.price = price;
    }

    private double subTotal() {
        return quantity*price;
    }
}
