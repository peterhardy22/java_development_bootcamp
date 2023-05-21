package Resources.LogicalOperators;

public class LogicalOperators {

    public static void main(String[] args) {
    
        boolean hasDrivingLiscense = true;
        boolean hasInsurance = true;

        if (hasDrivingLiscense && hasInsurance) {
            System.out.println("You can legally drive.");
        } else {
            System.out.println("You cannot legally drive.");
        }  
    } 
}

