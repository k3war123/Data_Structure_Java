public class Store {
    int front = -1;
    int rear = -1;
    int size = 0;
    int capacity = 10;
    Item[] allItems;

    public Store(int capacity) {
        allItems = new Item[capacity];
        this.capacity = capacity;
    }
//
    public void enqueue(int code, String name, int num) {
        if (size == capacity) {
            System.out.println("The store is full");
        } else {
            if (front == -1) {
                front = 0;
            }
            rear = (rear + 1) % capacity;//
            allItems[rear] = new Item(code, name, num);
            size++;
        }
    }

    public void dequeue() {
        if (size == 0) {
            System.out.println("The store is empty");
        } else {
            front = (front + 1) % capacity;
            size--;
        }
    }

    public void display() {
        int i;
        if (size == 0) {
            System.out.println("The store is empty");
        } else {
            for (i = front; i != rear; i = (i + 1) % capacity) {

                System.out.println(allItems[i]);

            }
            System.out.println(allItems[i]);
        }
    }

    public void peek() {
        if (size == 0) {
            System.out.println("The store is empty");
        } else {
            System.out.println(allItems[front]);

        }
    }
//_____________________________________________________________________________________






}
