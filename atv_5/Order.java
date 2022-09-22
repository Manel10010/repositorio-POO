package atv_5;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Order{
    
    private Date momento;
    private OrderStatus status;

    public Order() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date data = new Date();
        this.momento = data;
    }
    public addItem(OrderItem item){
        
    }

    public removeItem(OrderItem item) {

    }

    public double total() {
        
    }
}