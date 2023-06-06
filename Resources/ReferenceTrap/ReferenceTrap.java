package Resources.ReferenceTrap;

import java.util.Arrays;

public class ReferenceTrap {
    
    public static void main(String[] args) {
        // Reference Trap:
        // String[] staffLastYear = {"Tommy", "Joel", "Ellie"};
        // String[] staffThisYear = staffLastYear;
        // staffThisYear[1] = "Abby";
        // System.out.println(Arrays.toString(staffLastYear));
        // System.out.println(Arrays.toString(staffThisYear));

        // Solution:
        // String[] staffLastYear = {"Tommy", "Joel", "Ellie"};
        // String[] staffThisYear = new String[3];
        // for (int index = 0; index < staffThisYear.length; index++) {
        //     staffThisYear[index] = staffLastYear[index];
        // }
        // staffThisYear[1] = "Abby";

        // System.out.println(Arrays.toString(staffLastYear));
        // System.out.println(Arrays.toString(staffThisYear));

        // Better Solution:
        String[] staffLastYear = {"Tommy", "Joel", "Ellie"};
        String[] staffThisYear = Arrays.copyOf(staffLastYear, staffLastYear.length);
        staffThisYear[1] = "Abby";

        System.out.println(Arrays.toString(staffLastYear));
        System.out.println(Arrays.toString(staffThisYear));
    }

}
