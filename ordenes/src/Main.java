package ordenes.src;
import java.util.Arrays;

import ordenes.src.calculator.OrderCalculator;
import ordenes.src.order.Order;
import ordenes.src.printer.OrderPrinter;
import ordenes.src.repository.OrderRepository;

public class Main {
    public static void main(String[] args) {
        // Crear una orden
        Order order = new Order(Arrays.asList("item1", "item2", "item3"));

        // Calcular el total
        OrderCalculator calculator = new OrderCalculator();
        double total = calculator.calculateTotal(order);
        order.setTotalAmount(total);

        // Imprimir la orden
        OrderPrinter printer = new OrderPrinter();
        printer.printOrder(order);

        // Guardar la orden en la base de datos
        OrderRepository repository = new OrderRepository();
        repository.saveToDatabase(order);
    }
}

