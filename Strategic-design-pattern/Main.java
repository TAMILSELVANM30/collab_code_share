import java.util.Scanner;

public class Main{
    static void main(String[] args){
 //       System.out.println("Hello World");
        Scanner sc = new Scanner(System.in);
        double amount = 0;
        System.out.println("Enter the amount to pay");
        amount = sc.nextDouble();
        // if(sc.hasNextDouble()){
        //     amount = sc.nextDouble();
        // }
        
        sc.nextLine();
        System.out.println("Select the payment method");
        System.out.println("1. Credit Card");
        System.out.println("2. Debit Card");
        System.out.println("3. GPay");
        System.out.println("Your choice: ");
        int choice = sc.nextInt();
        sc.nextLine();

        PaymentStrategy strategy = null;
        switch (choice) {
            case 1:
                System.out.println("Enter your name");
                String name = sc.nextLine();
                System.out.println("Enter the card number");
                String cardNumber = sc.nextLine();
                
                System.out.println("Enter the CVV");
                String cvv = sc.nextLine();
                System.out.println("Enter the expiry date");
                String expiryDate = sc.nextLine();
                strategy = new CCPayment(name, cardNumber, cvv, expiryDate);
                break;
            case 2:
                System.out.println("Enter your name");
                String name1 = sc.nextLine();
                System.out.println("Enter the card number");
                String cardNumber1 = sc.nextLine();
                
                System.out.println("Enter the CVV");
                String cvv1 = sc.nextLine();
                System.out.println("Enter the expiry date");
                String expiryDate1 = sc.nextLine();
                strategy = new CCPayment(name1, cardNumber1, cvv1, expiryDate1);
                break;// Implement Debit Card payment strategy
                
            case 3:
                System.out.println("Enter your name");
                String name2 = sc.nextLine();
                System.out.println("Enter the card number");
                String cardNumber2 = sc.nextLine();
                
                System.out.println("Enter the CVV");
                String cvv2 = sc.nextLine();
                System.out.println("Enter the expiry date");
                String expiryDate2 = sc.nextLine();
                strategy = new CCPayment(name2, cardNumber2, cvv2, expiryDate2);
                break;
            default:
                System.out.println("Invalid choice");
                sc.close();
                return;
                
        }
        PaymentProcessor processor = new PaymentProcessor(strategy);

        processor.processPayment(amount);
        
    }
}