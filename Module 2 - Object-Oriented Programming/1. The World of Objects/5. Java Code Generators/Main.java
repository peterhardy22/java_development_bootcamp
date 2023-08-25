public class Main {
    
public static void main(String[] args) {
    Car myCar = new Car(100);
    System.out.println("The fuel level for this car is " + myCar.getFuelLevel());

    int fuel = myCar.getFuelLevel();
    System.out.println("The fuel level for this car is " + fuel);

    myCar.setFuelLevel(50);  
    System.out.println("The fuel level for this car is " + myCar.getFuelLevel());
}

}
