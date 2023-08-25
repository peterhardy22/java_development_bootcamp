public class Main {
  
    public static void main(String[] args) {
        Person examplePerson = new Person("Rayan Slim", "Canadian", "01/01/1111", 5); 

        examplePerson.setSeatNumber(10);

        System.out.println("Name: " + examplePerson.getName());
        System.out.println("Nationality: " + examplePerson.getNationality());
        System.out.println("Date of Birth: " + examplePerson.getDateOfBirth());
        System.out.println("Seat Number: " + examplePerson.getSeatNumber());

    }

}
