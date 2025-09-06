
public class Item {
    //declare the variables
    int item_code;
    String item_name;
    int item_num;
    //we are going to create the constructor.
    public Item(int item_code, String item_name, int item_num) {
        this.item_code = item_code;
        this.item_name = item_name;
        this.item_num = item_num;
    }
    @Override
    public String toString() {
        //to return to the string.
        return "Item code: " + item_code + " Item name: " + item_name + " Item number: " + item_num;
    }
}
