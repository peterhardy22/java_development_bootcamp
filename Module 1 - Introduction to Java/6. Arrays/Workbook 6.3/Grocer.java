public class Grocer {
    public static void main(String[] args) {
        String[] aisles = {"apples", "bananas", "candy", "chocolate", "coffee", "tea"};

        System.out.println("\nDo you sell coffee?");
        for (int index = 0; index < aisles.length; index++) {
            if (aisles[index].equals("coffee")) {
                System.out.println("\nWe have that in aisle: " + index); 
                break;           
            }
        }
    }
}
