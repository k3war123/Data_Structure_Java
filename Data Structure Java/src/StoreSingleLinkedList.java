public class StoreSingleLinkedList {
    //In here we are going to create a node class with item
    class Node {
        //declare the variables
        Item item;
        Node next;
//we are going to create the constructor.
        public Node(Item item) {
            //we are going to assign the item to the node
            this.item = item;
            this.next = null;
        }
    }
    //we need to create a head and tail node, and we are used in all methods
    Node head = null;
    Node tail = null;
    //we are create a method to addItem to the list.
    public void addNode(int code, String name, int num) {
        //create a new node
        Item item = new Item(code, name, num);
        Node newNode = new Node(item);
        //in here we are make a condition, if the list is empty, head and tail will point to new node
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            //in here new node will be added after tail like that tail's next will point to new node
            tail.next = newNode;
            //new node will become new tail of the list
            tail = newNode;
        }
    }
    // we are going to create a method to display
    public void displayAllItems() {
        //if the list is empty so, we have this kind of code in most of the method this is for checking
        if (head == null) {
            System.out.println("The store is empty");
        } else {
            //store the head node in temp
            Node temp = head;
            //display the items in the list
            while (temp != null) {
                System.out.println(temp.item);
                temp = temp.next;
            }
        }
    }

    public void peek() {
        //check the list is empty or not
        if (head == null) {
            System.out.println("The store is empty");
        } else {
            //for showing the first item in our list
            System.out.println(head.item);
        }
    }
    //now we are going to create a method to let us add the item at the start in our list
    public void insertAtBeginning(int code, String name, int num) {
        //in here create a new node
        Item item = new Item(code, name, num);
        Node newNode = new Node(item);
        //in here if the list is null so head and tail will point to new node
        if (head == null) {
            //in here head will point to new node
            head = newNode;
            //and in the following line tail will point to new node
            tail = newNode;
        } else {
            //in here new node will be added before head so, that next will point to head
            newNode.next = head;
            //and in the following line new node will become new head of the list
            head = newNode;
        }
    }


    public void insertAtPosition(int code, String name, int num, int position) {
        //in here create a new node
        Item item = new Item(code, name, num);
        Node newNode = new Node(item);
        //in here if the list is null so head and tail will point to new node
        if (head == null) {
            //in here head will point to new node
            head = newNode;
            //and in the following line tail will point to new node
            tail = newNode;
        } else {
            //in here store the head node in temp
            Node temp = head;
            //in this following line traverse to the position
            for (int i = 1; i < position - 1; i++) {
                temp = temp.next;
            }
            //in this following line point new node to the next node
            newNode.next = temp.next;
            //in this following line point temp to the new node
            temp.next = newNode;
        }
    }

    public void deleteAtBeginning() {
      //if the list is empty, print the message
        if (head == null) {
            System.out.println("The store is empty");
        } else {
            //store the head node in temp
            Node temp = head;
            //point head to the next node
            head = head.next;
            //display the message
            System.out.println("Item removed");
        }
    }

    public void deleteAtEnd() {
       //if the list is empty, print the message
        if (head == null) {
            System.out.println("The store is empty");
        } else {
            //in this following line store the head node in temp
            Node temp = head;
            //in this following line traverse to the second last node
            while (temp.next.next != null) {
                temp = temp.next;
            }
            //in this following line we are going to point temp to null
            temp.next = null;
            //display the message
            System.out.println("Item removed");
        }
    }

    public void deleteAtPosition(int position) {
        //if the list is empty, print the message
        if (head == null) {
            System.out.println("The store is empty");
        } else {
            //in this following line store the head node in temp
            Node temp = head;
            //in this following line traverse to the position
            for (int i = 1; i < position - 1; i++) {
                temp = temp.next;
            }
            //point temp to the next node
            temp.next = temp.next.next;
            System.out.println("Item removed");
        }
    }

    public void searchByItemCode(int code) {
        //if the list is empty, print the message
        if (head == null) {
            System.out.println("The store is empty");
        } else {
            //in this following line store the head node in temp
            Node temp = head;
            //in this following line traverse to the position
            while (temp != null) {
                //if the item code is equal to the code so, print the item
                if (temp.item.item_code == code) {
                    System.out.println(temp.item);
                }
                //in this following line traverse to the next node
                temp = temp.next;
            }
        }
    }

    public void bubbleSort() {
        //if the list is empty, print the message
        if (head == null) {
            System.out.println("The store is empty");
        } else {
            //store the head node in temp
            Node temp = head;
            //traverse to the position
            while (temp != null) {
                //store the head node in temp2
                Node temp2 = temp.next;
                //we are going to compare the item code
                while (temp2 != null) {
                    //if the item code is greater than the next item code so swap the item.
                    if (temp.item.item_code > temp2.item.item_code) {
                        //in this following line we are going to swap the item.
                        Item item = temp.item;
                        temp.item = temp2.item;
                        temp2.item = item;
                    }
                    //in this following line we are going to traverse to the next node
                    temp2 = temp2.next;
                }
                temp = temp.next;
            }
        }
    }
}
