package Resources.TDarrays;

import java.util.Arrays;

public class TDarrays {
    
    public static void main(String[] args) {
        
        // int[][] grades = new int[3][4];
        int[][] grades = {{72, 74, 78, 76}, 
                        {65, 64, 61, 67}, 
                        {95, 98, 99, 100}};

        for (int index = 0; index < grades.length; index++) {
            switch (index) {
                case 0: System.out.print("\tHarry: "); break;
                case 1: System.out.print("\tRon: "); break;
                case 2: System.out.print("\tHermione: "); break;
            }
            for (int j = 0; j < grades[index].length; j++) {
                System.out.print(grades[index][j] + " ");
            }
            System.out.print("\n");
        }
    }
    
}
