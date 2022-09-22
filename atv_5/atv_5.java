package atv_5;
import java.text.SimpleDateFormat;
import java.util.Date;

public class atv_5 {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date data = new Date();
        String dataFormatada = sdf.format(data);
        System.out.println(dataFormatada);
    }
}
