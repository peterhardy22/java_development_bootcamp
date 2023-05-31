import java.util.Scanner;

public class Grocer {
    public static void main(String[] args) {        
        Scanner scan = new Scanner(System.in);        
        
        String[] store = {"apples", "bananas", "candy", "chocolate", "coffee", "tea"};
        System.out.println("\nWelcome to Java Grocers. ");
        System.out.println("What can I help you find?\n");
        String item = scan.nextLine();
        
        for (int index = 0; index < store.length; index++) {            
            if (store[index].equals(item)) {
                System.out.println("\nWe have that in aisle: " + index);
                break;
            }
        }

        scan.close();
    }
}
