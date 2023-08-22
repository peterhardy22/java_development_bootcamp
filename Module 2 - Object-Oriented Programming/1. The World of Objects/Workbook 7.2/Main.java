public class Main {
    
    public static void main(String[] args) {
        Person peter = new Person("Peter Hardee", "Danish", "01/11/1981", 11);

        System.out.println("Name: " + peter.name + "\n" + "Nationality: " 
        + peter.nationality + "\n" + "Date of Birth: " + peter.dateOfBirth + 
        "\n" + "Seat Number: " + peter.seatNumber + "\n");
    }

}
