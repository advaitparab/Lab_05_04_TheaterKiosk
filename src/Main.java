import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner AgeInput = new Scanner(System.in);
        System.out.print("Please Enter your age: ");

        int UserAge;
        while ((UserAge = AgeInput.nextInt()) > 0) {

            if (UserAge >= 21)
                System.out.println("\nYou got a wrist band!");
        }

    }
}