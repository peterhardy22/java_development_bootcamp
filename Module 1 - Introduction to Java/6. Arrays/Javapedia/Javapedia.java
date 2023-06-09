import java.util.Scanner;

public class Javapedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n**********Javapedia**********");
        System.out.println("How many historical figures will you register?");
        //Task 1 – Ask the user: how many historical figures will you register?
        //       – Store the value.
        int figureAmount = scan.nextInt();
        
        //Task 2 – Create a 2D array with a variable number of rows, and 3 values per row.         
        String[][] database = new String[figureAmount][3];

        scan.nextLine();
        //Task 3 - Collect user values for each row.
        for (int i = 0; i < database.length; i++) {
            System.out.println("\n\tFigure " + (i+1)); 
            System.out.print("\t - Name: ");
            database[i][0] = scan.nextLine();
            System.out.print("\t - Date of birth: ");
            database[i][1] = scan.nextLine();
            System.out.print("\t - Occupation: ");
            database[i][2] = scan.nextLine(); 
            System.out.print("\n");
        }

        //Task 4: call print2DArray. 
        System.out.println("These are the values you stored:"); 
        print2DArray(database);

        //Task 5: Let the user search the database by name. 
        System.out.print("\nWho do you want information on? ");
        String choice = scan.nextLine();
        System.out.print("\n");
        for (int i = 0; i < database.length; i++) {
            if (choice.equals(database[i][0])) {
            System.out.println("\t - Name: " + database[i][0]);
            System.out.println("\t - Date of birth: " + database[i][1]);
            System.out.println("\t - Occupation: " + database[i][2]);
            }
        }      
        
        scan.close();
    }

    public static void print2DArray(String[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("\t");
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
        }
    }
}
