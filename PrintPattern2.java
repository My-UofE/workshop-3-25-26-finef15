import java.util.Scanner;

public class PrintPattern2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int size;

        // Keep asking until valid input
        while (true) {
            System.out.print("Enter the size: ");
            size = in.nextInt();

            if (size < 1) {
                System.out.println("too small!");
            } else if (size > 5) {
                System.out.println("too big!");
            } else {
                break;  // valid input
            }
        }

        int totalRows = size * 2;

        for (int row = 1; row <= totalRows; row++) {

            int start;

            if (row <= size) {
                start = row;
            } else {
                start = totalRows - row + 1;
            }

            // Print increasing numbers
            for (int i = 0; i < size; i++) {
                System.out.print(start + i);
            }

            // Print decreasing numbers
            for (int i = size - 1; i >= 0; i--) {
                System.out.print(start + i);
            }

            System.out.println();
        }
    }
}