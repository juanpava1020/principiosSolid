package metodoDePago.src;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();

        // Procesar pago con tarjeta de crédito
        PaymentMethod creditCardPayment = new CreditCardPayment();
        processor.processPayment(creditCardPayment);

        // Procesar pago con PayPal
        PaymentMethod payPalPayment = new PayPalPayment();
        processor.processPayment(payPalPayment);
    }
}

