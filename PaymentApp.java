package Assign3;

public class PaymentApp {
    public static void main(String[] args) {

    Order keyboard = new Order();

    keyboard.setItem("keyboard");
    keyboard.setQuantity(10);
    keyboard.setUnitPrice(300);
    keyboard.setPaymentmode(new Maya());
    System.out.println("The Item is " + keyboard.getItem());
    System.out.println("Unit Price is " + keyboard.getUnitPrice());
    System.out.println("Quantity is " + keyboard.getQuantity());

    Order keyboard2 = new Order("keyboard", 10, 300,new GCash());
    Order keyboard3 = new Order("keyboard", 10, 300, new ShopeePay());

        System.out.println("\nPayment Order Details if " + keyboard2.getPaymentmode().getClass().getSimpleName());
        System.out.println("Discount Rate is " + keyboard2.getPaymentmode().determineDiscountRate());
        System.out.println("Payment Amount is: " + keyboard2.getTotalAmount());

        System.out.println("\nPayment Order Details if " + keyboard.getPaymentmode().getClass().getSimpleName());
        System.out.println("Discount Rate is " + keyboard.getPaymentmode().determineDiscountRate());
        System.out.println("Payment Amount is: " + keyboard.getTotalAmount());

        System.out.println("\nPayment Order Details if " + keyboard3.getPaymentmode().getClass().getSimpleName());
        System.out.println("Discount Rate is " + keyboard3.getPaymentmode().determineDiscountRate());
        System.out.println("Payment Amount is: " + keyboard3.getTotalAmount());
    }
}