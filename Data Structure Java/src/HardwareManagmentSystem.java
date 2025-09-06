
import java.util.List;
import java.util.Scanner;

public class HardwareManagmentSystem {
    static Store store = new Store(10);
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        int choice = 0;
        int item_code;
        String item_name;
        int item_num;

        loop:
        while (true) {
            System.out.println("1. Add item");
            System.out.println("2. Remove item");
            System.out.println("3. Display items");
            System.out.println("4. Peek item");
            System.out.println("5. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter item code: ");
                    item_code = input.nextInt();
                    System.out.print("Enter item name: ");
                    item_name = input.next();
                    System.out.print("Enter item number: ");
                    item_num = input.nextInt();
                    store.enqueue(item_code, item_name, item_num);
                    System.out.println("Item added");
                    break;
                case 2:
                    store.dequeue();
                    break;
                case 3:
                    store.display();
                    break;
                case 4:
                    store.peek();
                    break;
                case 5:
                    System.out.println("Thank you for using the system");
                    break loop;
                case 6:

                    break;
                default:
                    System.out.println("Invalid choice");
                    break;

            }
        }
    }
}
