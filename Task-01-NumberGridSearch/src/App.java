import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] grid = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("----- 3 x 3 Number Grid -----");

        for (int i = 0; i < grid.length; i++) {

            for (int j = 0; j < grid[i].length; j++) {

                System.out.print(grid[i][j] + " ");
            }

            System.out.println();
        }

        System.out.print("\nEnter a number to search: ");
        int target = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < grid.length; i++) {

            for (int j = 0; j < grid[i].length; j++) {

                if (grid[i][j] == target) {

                    found = true;

                    System.out.println("Number Found at Row " + (i + 1) + " Column " + (j + 1));

                    break;
                }
            }

            if (found) {
                break;
            }
        }

        if (!found) {
            System.out.println("Number Not Found.");
        }

        sc.close();
    }
}