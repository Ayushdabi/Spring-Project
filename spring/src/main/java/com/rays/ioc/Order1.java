package com.rays.ioc;

public class Order1 {

    private Payment payment;  // Keep it private
    private Inventory inventory;

    // ✅ Setter should be PUBLIC for Spring to inject beans
    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public void bookATicket(int items) {
        int price = 10;

        double totalAmount = items * price;
        double updatedBalance = payment.makePayment(totalAmount);
        double updatedStock = inventory.solad(items);

        System.out.println("Tickets are Booked");
        System.out.println("Total Amount Paid: " + totalAmount);
        System.out.println("Remaining Balance: " + updatedBalance);
        System.out.println("Updated Stock: " + updatedStock);
    }
}
