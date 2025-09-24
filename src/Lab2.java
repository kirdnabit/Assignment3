import java.util.Scanner;

public class Lab2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        while (choice != 4) {
            System.out.print(
                    "1. Count from a number to another\n" +
                            "2. Determine largest number\n" +
                            "3. Type in word\n" +
                            "4. Quit\n" +
                            "Enter option: "
            );
            choice = sc.nextInt();
            System.out.println("");

            switch (choice) {
                case 1:
                    System.out.print("Enter the start point: ");
                    int st_num = sc.nextInt();
                    System.out.print("Enter the end point: ");
                    int en_num = sc.nextInt();
                    System.out.println("Counting from " + st_num + " to " + en_num + "...");
                    if (st_num == en_num) {
                        System.out.println("Start and end are the same!");
                    } else {
                        for (int i = st_num; i <= en_num; i++)
                            System.out.println(i);
                    }
                    System.out.println("Done counting. ");
                    System.out.println("");
                    break;

                case 2:
                    System.out.println("This option will display the largest number entered. Enter 0 when done.");
                    int largest_num = 0;
                    int current = 0;
                    int temp;
                    do {
                        System.out.print("Enter a number (current largest is " + current + "): ");
                        temp = sc.nextInt();
                        if (temp > largest_num) {
                            largest_num = temp;
                            current = temp;
                        }
                    } while (temp != 0);
                    System.out.println("The largest number entered was " + largest_num);
                    System.out.println("");
                    break;

                case 3:
                    sc.nextLine();
                    System.out.print("Type in the word 'Computer': ");
                    String input = sc.nextLine();
                    while (!input.equals("Computer")) {
                        System.out.print("Incorrect. You must type 'Computer': ");
                        input = sc.nextLine();
                    }
                    System.out.println("Correct!");
                    break;

                case 4:
                    System.out.print("Shutting off...");

            }
        }
    }
}