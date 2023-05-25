package Resources.BuiltinFunctions;

public class BuiltinFunctions {

    public static void main(String[] args) {
        
        System.out.println("sunny".length());
        System.out.println("sunny".toUpperCase());
        System.out.println(Math.sqrt(9));
        System.out.println("Java programming".startsWith("Java"));

        String original = "Java is fun!";
        String updatedString = original.replace('v', 'b');
        System.out.println(updatedString);

    }
    
}
