import java.util.Arrays;

public class Main {
    
    public static void main(String[] args) {
        Person peter = new Person();
        peter.name = "Peter Hardy";
        peter.nationality = "American";
        peter.dateOfBirth = "02/22/1989";
        peter.passport = new String[]{peter.name, peter.nationality, peter.dateOfBirth};
        peter.seatNumber = 2;

        System.out.println(peter.name);
        System.out.println(peter.nationality);
        System.out.println(peter.dateOfBirth);
        System.out.println(Arrays.toString(peter.passport));
        System.out.println(peter.seatNumber);
    }
}
