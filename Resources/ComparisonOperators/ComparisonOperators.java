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

        String word = "hello";
        String secondWord = "hello";
        System.out.println("Me: Are the two words the same?");
        System.out.println("Java: " + (word.equals(secondWord)) + "\n");

        String thirdWord = "hello";
        String fourthWord = "goodbye";
        System.out.println("Me: Are the two words the different?");
        System.out.println("Java: " + !thirdWord.equals(fourthWord) + "\n");
    }
    
}
