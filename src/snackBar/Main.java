package snackBar;

public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Jane", 45.25);
        Customer customer2 = new Customer("Bob", 33.14);

        VendingMachine machine1 = new VendingMachine("Food");
        VendingMachine machine2 = new VendingMachine("Drink");
        VendingMachine machine3 = new VendingMachine("Office");

        Snack snack1 = new Snack("Chips", 36, 1.75, 1);
        Snack snack2 = new Snack("Chocalate Bar", 36, 1.0, 1);
        Snack snack3 = new Snack("Pretzel", 30, 2.0, 1);
        Snack snack4 = new Snack("Soda", 24, 2.5, 2);
        Snack snack5 = new Snack("Water", 20, 2.75, 2);

        // 1. Customer 1 buys 3 of snack 4.
        // Print Customer 1 Cash on hand.
        // Print quantity of snack 4.
        System.out.println("\nCustomer 1 buys 3 of snack 4:");
        double total1 = snack4.getCost() * 3;
        snack4.setQuantity(snack4.getQuantity() - 3);
        customer1.buySnacks(total1);
        System.out.println("Customer 1 $: " + customer1.getCashOnHand());
        System.out.println("Snack 4 QTY: " + snack4.getQuantity() + "\n");

        // 2. Customer 1 buys 1 of snack 3.
        // Print Customer 1 Cash on hand.
        // Print quantity of snack 3.
        System.out.println("Customer 1 buys 1 of snack 3:");
        double total2 = snack3.getCost() * 1;
        snack3.setQuantity(snack2.getQuantity() - 1);
        customer1.buySnacks(total2);
        System.out.println("Customer 1 $: " + customer1.getCashOnHand());
        System.out.println("Snack 3 QTY: " + snack3.getQuantity() + "\n");

        // 3. Customer 2 buys 2 of snack 4.
        // Print Customer 2 Cash on Hand.
        // Print quantity of snack 4.
        System.out.println("Customer 2 buys 2 of snack 4:");
        double total3 = snack4.getCost() * 2;
        snack4.setQuantity(snack4.getQuantity() - 2);
        customer2.buySnacks(total3);
        System.out.println("Customer 2 $: " + customer2.getCashOnHand());
        System.out.println("Snack 4 QTY: " + snack4.getQuantity() + "\n");

        // 4. Customer 1 finds $10
        // Print Customer 1 Cash on Hand.
        System.out.println("Customer 1 finds $10:");
        customer1.addCash(10);
        System.out.println("Customer 1 $: " + customer1.getCashOnHand() + "\n");

        // 5. Customer 1 buys 1 of snack 2
        // Print Customer 1 Cash on Hand
        // Print quantity of snack 2.
        System.out.println("Customer 1 buys 1 of snack 2:");
        double total4 = snack2.getCost() * 1;
        customer1.buySnacks(total4);
        System.out.println("Customer 1 $: " + customer1.getCashOnHand());
        System.out.println("Snack 2 QTY: " + snack2.getQuantity() + "\n");

        // Add 12 more items to snack 3
        System.out.println("Add 12 more items to snack 3:");
        snack3.setQuantity(snack3.getQuantity() + 12);
        // Print quantity of snack 3
        System.out.println("Snack 3 QTY: " + snack3.getQuantity() + "\n");

        // Custoemr 2 buys 3 of snack 3
        System.out.println("Customer 2 buys 3 of snack 3:");
        double total5 = snack3.getCost() * 3;
        snack3.setQuantity(snack3.getQuantity() - 3);
        customer2.buySnacks(total5);
        // Print Customer 2 Cash on hand
        System.out.println("Customer 2 $: " + customer2.getCashOnHand());
        // Print quantity of snack 3.
        System.out.println("Snack 3 QTY: " + snack3.getQuantity() + "\n");

    }
}

