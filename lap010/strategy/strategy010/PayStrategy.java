package lap010.strategy.strategy010;

public interface PayStrategy {
    boolean pay( int paymentAmount);
    void collectPaymentDetails();
}
