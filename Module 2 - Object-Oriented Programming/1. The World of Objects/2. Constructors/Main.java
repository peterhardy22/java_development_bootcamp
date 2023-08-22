public class Main {
    
    public static void main(String[] args) {
        Car nissan = new Car("Nissan", 10000, 2020, "Green");

        System.out.println("This " + nissan.make + " is worth $" + nissan.price +
        ". It was built in " + nissan.year + ". It is " + nissan.color + ".\n");
    }

}
