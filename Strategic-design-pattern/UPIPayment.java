public class UPIPayment implements PaymentStrategy {
    private String upiId;

    public UPIPayment(String upiId) {
        this.upiId = upiId;
    }
    @Override
    public void pay(double amount) {
        System.out.println("prcessing payment of Rs"+amount+" payment with UPI");
    }
    
}