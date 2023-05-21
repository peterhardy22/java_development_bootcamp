package Resources.LogicalOperators;

public class LogicalOperators {

    public static void main(String[] args) {
        // and = &&
        boolean hasDrivingLiscense = true;
        boolean hasInsurance = true;

        if (hasDrivingLiscense && hasInsurance) {
            System.out.println("You can legally drive.");
        } else {
            System.out.println("You cannot legally drive.");
        }  

        // or = ||
        boolean hasGoodPerformance = true;
        boolean isLongTermEmployee = false;

        if (hasGoodPerformance || isLongTermEmployee) {
            System.out.println("The user is eligible for a promotion.");
        } else {
            System.out.println("The user is not eligible for a promotion.");
        }

        // not = !
        String option = "credit";
        
        boolean notCashOrCredit = !(option.equals("cash") || option.equals("credit"));
        
        if (notCashOrCredit) {
            System.out.println("Please choose another payment option.");
        } else {
            System.out.println("Sold. Pleasure doing business with you!");
        }
        
    } 
}

