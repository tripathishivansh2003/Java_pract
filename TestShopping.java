import java.util.Vector;
import java.util.Scanner;

class ShoppingList {
    Vector<String> items = new Vector<>();

    void addItem(String item) {
        items.add(item);
    }

    void addItemAt(int index, String item) {
        items.add(index, item);
    }

    void deleteItem(int index) {
        items.remove(index);
    }

    void displayList() {
        System.out.println("Shopping List:");
        for (String item : items) {
            System.out.println(item);
        }
    }
}

public class TestShopping {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        ShoppingList list = new ShoppingList();

        System.out.println("Enter 5 items:");
        for (int i = 0; i < 5; i++) {
            list.addItem(sc.nextLine());
        }

        list.displayList();
        list.deleteItem(2);
        list.addItemAt(1, "New Item");
        list.addItem("Last Item");
        list.displayList();
    }
}
