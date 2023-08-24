import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Arrays {
    public static void main(String[] args) {
        //Enter scanner class for input
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n Welcome to the Arrays Demo 8.24.23 \n");
        //Prompt for user name
        System.out.println(" Please enter your name: ");
        String userName = scanner.nextLine();

        System.out.println("\n lets get started " + userName + "\n\n");
// fill the array
        String[] friends = new String[3];
        friends[0] = "Mike";
        friends[1] = "Karen";
        friends[2] = "Kevin";

        System.out.println(friends[1]);
        System.out.println("\n" + friends.length + "\n\n");


        int[] myNumbers = new int[9];

        myNumbers[0] = 1;
        myNumbers[1] = 3;
        myNumbers[2] = 5;
        myNumbers[3] = 7;
        myNumbers[4] = 9;
        myNumbers[5] = 11;
        myNumbers[6] = 13;
        myNumbers[7] = 15;
        myNumbers[8] = 17;

        System.out.println("myNumbers = " + myNumbers[3] + "\n");

        for (int i = 0; i < 9; i++) {
            // Print out my elements.
            System.out.println("\n myNumbers [" + i + "] is: " + myNumbers[i]);
        }
        System.out.println("\n\n");
        System.out.println("This array should be counting by 5's");

        // fill the array with
        int myFiveContainer = 0;
        for (int i = 0; i < 9; i++) {
            myNumbers[i] = myFiveContainer += 5;
            // Print out my elements.
            System.out.println("\n myNumbers [" + i + "] is: " + myNumbers[i]);
            System.out.println("\n\n");
        }




// Video Follow Along
        for (int i = 0; i < 7; i++) {
            for (int j = 1; j < 8; j++) {
                System.out.println("i = " + i + " j = " + j);
            }
            System.out.println("\n ");
        }

        int[][] numberGrid = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {0}

        };
        System.out.println(numberGrid[0][0]);
        System.out.println("\n\n");
        // fill 2D array
        for (int i = 0; i < numberGrid.length; i++) {
            for (int j = 0; j < numberGrid[i].length; j++) {
                System.out.print(numberGrid[i][j]);
            }
            System.out.println("\n ");


        }
        //use to make by 5's 2D array
        for (int i = 0; i < numberGrid.length; i++) {
            for (int j = 0; j < numberGrid[i].length; j++) {
                numberGrid[i][j] = myFiveContainer += 5;

            }
            System.out.println("\n ");
        }
        System.out.println("\n ");
        for (int i = 0; i < numberGrid.length; i++) {
            for (int j = 0; j < numberGrid[i].length; j++) {
                System.out.print(numberGrid[i][j] + " ");
            }
            System.out.println("\n ");
        }
    }
}