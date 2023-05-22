package Resources.SwitchStatments;

public class SwitchStatements {

    public static void main(String[] args) {
        
        String weather = "sunny";
        switch (weather) {
            case "sunny": System.out.println("You can wear just a shirt."); break;
            case "cloudy": System.out.println("You should wear a sweater."); break;
            case "rainy": System.out.println("You neeed to wear a raincoat."); break;
            case "snowy": System.out.println("You should wear gloves with your jacket."); break;
            default: System.out.println("You can wear whatever you want.");
        }
    }
}
