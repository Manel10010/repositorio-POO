package atv_5;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Order extends OrdemItem{
    
    private Date momento;
    private OrderStatus status;

    public Order(OrderStatus status) {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            Date data = new Date();
            this.momento = data;
            this.status = status;
    }
    public addItem(OrderItem item){
        
    }

    public removeItem(OrderItem item) {

    }

    public double total() {
        
    }
}