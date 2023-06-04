public class Receipt {
    public static void main(String[] args) {

        String[] apples = {"Gala", "Granny Smith", "Macintosh"};
        double[] apple_price = {1.99, 1.49, 1.29};

        System.out.println("Here's your receipt:\n");
        
        for (int index = 0; index < apples.length; index++) {
            System.out.println("\t" + apples[index] + ": $" + apple_price[index]);
        }
    }
}
