public class Weather {
    public static void main(String[] args) {
        double noon = 77;          //temperature at noon in fahrenheit.
        double evening = 61;       //temperature during the evening in fahrenheit
        double midnight = 55;      //temperature at midnight in fahrenheit

        printTemperatures(noon, fahrenheitToCelsius(noon));
        printTemperatures(evening, fahrenheitToCelsius(evening));
        printTemperatures(midnight, fahrenheitToCelsius(midnight));
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (fahrenheit - 32) * 5/9;
        return celsius;
    }

    public static void printTemperatures(double fahrenheit, double celsius) {
        System.out.println("F: " + fahrenheit);
        System.out.println("C: " + celsius);
    }
}