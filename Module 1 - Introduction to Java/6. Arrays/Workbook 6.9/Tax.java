import java.util.Arrays;

public class Tax {
    public static void main(String[] args) {
        double[] price = {1.99, 2.99, 3.99, 4.99};
        double[] taxedPrice = new double[price.length];
        
        for (int index = 0; index < price.length; index++) {
            taxedPrice[index] = price[index] * 1.13;
        }
        
        System.out.println("The original prices are: " + Arrays.toString(price));
        System.out.println("The prices after tax are: " + Arrays.toString(taxedPrice));

    }
}
