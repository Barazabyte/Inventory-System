import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int choice;
        int id, quantity;
        double price;
        String productName;

        Store store = new Store();

        do {
            System.out.println("\n");
            System.out.println("+----------------------------------------------+");
            System.out.println("\t WELCOME TO BARAZA'S BANK SYSTEM ");
            System.out.println("+----------------------------------------------+");

            System.out.println("   1. Available Products");
            System.out.println("   2. Add Product");
            System.out.println("   3. Update Product Details");
            System.out.println("   4. Exit");

            System.out.println("+----------------------------------------------+");
            System.out.print(" Choice : ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println(" Available Products:-");
                    store.display();
                    break;

                case 2:
                    System.out.print(" Name : ");
                    productName = input.next();
                    System.out.print(" Price : ");
                    price = input.nextDouble();
                    System.out.print(" Quantity : ");
                    quantity = input.nextInt();
                    store.addProduct(productName, price, quantity);
                    break;

                case 3:
                    System.out.print(" Product Id : ");
                    id = input.nextInt();
                    System.out.print(" Name : ");
                    productName = input.next();
                    System.out.print(" Price : ");
                    price = input.nextDouble();
                    System.out.print(" Quantity : ");
                    quantity = input.nextInt();
                    store.updateProduct(id, productName, price, quantity);
                    break;

            }

        } while(choice != 4);

    }
}