public class DCPayment implements PaymentStrategy {
    private String name;
    private String cardNumber;
    private String cvv;
    private String expiryDate;

    public DCPayment(String name, String cardNumber, String cvv, String expiryDate) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.expiryDate = expiryDate;
    }
    @Override
    public void pay(double amount) {
        System.out.println("prcessing Rs"+amount+" payment with Debit Card");
    }
    
}