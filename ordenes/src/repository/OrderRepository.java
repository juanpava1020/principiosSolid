package ordenes.src.repository;
import ordenes.src.order.Order;

public class OrderRepository {
    public void saveToDatabase(Order order) {
        // Lógica para guardar la orden en la base de datos
        System.out.println("Order has been saved to the database.");
    }
}