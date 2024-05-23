package lap010.adapter.adapter02;

public class PaymentServiceAdapter implements BankAccount{
    private PaymentService paymentService;

    public PaymentServiceAdapter(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @Override
    public void deposit(double amount) {
        paymentService.receive(amount);
    }

    @Override
    public void withdraw(double amount) {
        paymentService.pay(amount);
    }

    @Override
    public double getBalance() {
        // Assume the payment service doesn't provide balance information
        return 0;
    }
}
