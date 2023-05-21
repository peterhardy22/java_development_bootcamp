package Resources.ComparisonOperators;

public class ComparisonOperators {

    public static void main(String[] args) {
        
        int chemistryGrade = 75;
        int biologyGrade = 95;
        System.out.println("Me: Hi Java, did I score better in biology?");
        System.out.println("Java: " + (biologyGrade > chemistryGrade) + "\n");

        double sales = 37.55;
        double costs = 5.55;
        System.out.println("Me: Hi java, did we make money?");
        System.out.println("Java: " + (sales < costs) + "\n");

        int age = 40;
        int retirementAge = 62; 
        System.err.println("Me: Hi Java, am I old enough to retire?");
        System.out.println("Java: " + (age >= retirementAge) + "\n");

    }
    
}
