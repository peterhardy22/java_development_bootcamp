package Resources.ComparisonOperators;

public class ComparisonOperators {

    public static void main(String[] args) {
        
        int chemistryGrade = 75;
        int biologyGrade = 95;
        System.out.println("Me: hi Java, did I score better in biology?");
        System.out.println("Java: " + (biologyGrade > chemistryGrade) + "\n");

        double sales = 37.55;
        double costs = 5.55;
        System.out.println("Me: Hi java, did we make money?");
        System.out.println("Java: " + (sales < costs) + "\n");

        
    }
    
}
