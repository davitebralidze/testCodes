import java.util.Scanner;

public class pineBuilder {

    public static void main(String[] args) {
        //Write you scratch here:


        Scanner scr = new Scanner(System.in);
        System.out.println("Enter number of floors: ");
        int nFloors = scr.nextInt();

        preciseFloorBuilder(nFloors);

    }

    public static void preciseFloorBuilder(int nFloors) {

        for (int preciseFloor = 1; preciseFloor <= nFloors; preciseFloor ++) {
            int lastLine = 1 + (nFloors - 1) * 2;
            int spaceMax = (lastLine - 1) / 2;
            int preciseFloorSignAmount = 1 + (preciseFloor - 1) * 2;
            int preciseFloorSpaceAmount = spaceMax + (preciseFloor - 1) * (-1);

            for (int i = 0; i < preciseFloorSpaceAmount; i++) {
                System.out.print(" ");
            }

            for (int k = 0; k < preciseFloorSignAmount; k++) {
                System.out.print("*");
            }

            System.out.println();

        }
    }

}





