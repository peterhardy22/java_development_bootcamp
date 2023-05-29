package Resources.ArrayLoops;

public class ArrayLoops {
    
    public static void main(String[] args) {
        
        int[] numbers = {22, 24, 26, 29, 30};

        for (int number : numbers) {
            System.out.println(number);
        }
        
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

    }

}
