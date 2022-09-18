import java.util.Scanner;

public class ChangeTarget {
    public static int ChangeTarget(int target){

        Scanner sc = new Scanner(System.in);
        System.out.println("Insert new target of steps per day:");
        while(sc.hasNextInt())
        {
            target = sc.nextInt();
            if (target<0)
                System.out.println("Count of days cannot be lower than 0, try again");
            else
                return (target);
        }
        System.out.println("Wrong data type, use numbers!");
        return (target);}
}
