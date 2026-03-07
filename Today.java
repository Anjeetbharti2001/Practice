import java.util.*;

public class Today {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int avg = 0;

        int[] marks = new int[3];   // array create

        // Store data in array
        for(int i = 0; i < 3; i++){
            System.out.print("Enter mark: ");
            marks[i] = sc.nextInt();
        }

        // Read data and calculate sum
        for(int i = 0; i < 3; i++){
            System.out.println("enter marks:");
            marks[i] = sc.nextInt();
            sum = sum + marks[i];
        }

        avg = sum / 3;

        System.out.println("Average marks: " + avg);
    }
}