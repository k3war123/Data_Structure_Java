
import java.util.List;
import java.util.Scanner;

public class HardwareManagmentSystemLinked {
    //in  here , we create an object of the StoreSingleLinkedList class
    static StoreSingleLinkedList store = new StoreSingleLinkedList();

    public static void main(String[] args) throws Exception {
        //in here we create a scanner object to take item from the user
        Scanner input = new Scanner(System.in);
        //in here we declare some variables
        int choice = 0;
        int item_code;
        String item_name;
        int item_num;
       //in here we create a while loop to display the menu and loop until the user enter 11 and stop the program
        loop:
        while (true) {
            System.out.println("1. Add item to the front");
            System.out.println("2. Add item to the rear");
            System.out.println("3. Add item to specified location");
            System.out.println("4. Remove item from the beginning");
            System.out.println("5. Remove item from the end");
            System.out.println("6. Remove item from specified location");
            System.out.println("7. Display items");
            System.out.println("8. Peek item");
            System.out.println("9. Bubble Sort");
            System.out.println("10. Search for item by code");
            System.out.println("11. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                //in here we create a case to add item to the front
                case 1:
                    System.out.print("Enter item code: ");
                    item_code = input.nextInt();
                    System.out.print("Enter item name: ");
                    item_name = input.next();
                    System.out.print("Enter item number: ");
                    item_num = input.nextInt();
                    store.insertAtBeginning(item_code, item_name, item_num);
                    System.out.println("Item added");
                    //we break the case
                    break;
                case 2:
                    System.out.print("Enter item code: ");
                    item_code = input.nextInt();
                    System.out.print("Enter item name: ");
                    item_name = input.next();
                    System.out.print("Enter item number: ");
                    item_num = input.nextInt();
                    store.addNode(item_code, item_name, item_num);
                    System.out.println("Item added");
                    break;
                case 3:
                    System.out.print("Enter item code: ");
                    item_code = input.nextInt();
                    System.out.print("Enter item name: ");
                    item_name = input.next();
                    System.out.print("Enter item number: ");
                    item_num = input.nextInt();
                    System.out.print("Enter location: ");
                    int location = input.nextInt();
                    store.insertAtPosition(item_code, item_name, item_num, location);
                    System.out.println("Item added");
                    break;
                case 4:
                    store.deleteAtBeginning();
                    break;
                case 5:
                    store.deleteAtEnd();
                    break;
                    //in here we are going to create a case to remove item from the specified location
                case 6:
                    System.out.print("Enter location: ");
                    location = input.nextInt();
                    store.deleteAtPosition(location);
                    break;
                case 7:
                    store.displayAllItems();
                    break;
                case 8:
                    store.peek();
                    break;
                case 9:
                    store.bubbleSort();
                    break;
                    //in here we are going to create a case to search for item by code
                case 10:
                    System.out.print("Enter item code: ");
                    item_code = input.nextInt();
                    store.searchByItemCode(item_code);
                    break;
                case 11:
                    System.out.println("Thank you for using the system");
                    break loop;
                    //in here we are going to create a default and the final case, to display a message if the user enter a wrong choice
                default:
                    System.out.println("Invalid choice");
                    break;

            }
        }
    }
}
