import java.util.Scanner;

public class StepTracker {

    public static int ChangeTarget(int target){

        Scanner sc = new Scanner(System.in);
        System.out.println("Insert new target of steps per day:");
        if (sc.hasNextInt()) {
            target = sc.nextInt();
            return (target);
        } else {
            System.out.println("Wrong data type, use numbers!");
            return (target);
        }
    }
}
