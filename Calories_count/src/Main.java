import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int target = 10000;
	    Scanner sc = new Scanner(System.in);
        printMenu();
        if (sc.hasNextInt()){
            int chose = sc.nextInt();
            while (chose != 0) {
                if (chose == 3) {
                    target = StepTracker.ChangeTarget(target);
                    System.out.println("New daily target: " + target + " steps");
                    printMenu();
                    chose = sc.nextInt();
                }
            }
            if (chose == 0){
                System.exit(0);
            }
        } if (!sc.hasNextInt()) {
            System.out.println("Wrong data type, use numbers");
        }


    }
    private static void printMenu(){
        System.out.println("Chose action using number of it");
        System.out.println("1: Insert today's count of steps");
        System.out.println("2: Get stats for chosen month");
        System.out.println("3: Change target of steps per day");
        System.out.println("0: Exit");
    }

}
