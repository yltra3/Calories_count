import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int target = 10000;
        HashMap<Integer, HashMap<Integer, Integer>> months = new HashMap<>();
        StepTracker.Pull(months);
        Scanner sc = new Scanner(System.in);
        printMenu();
        if (sc.hasNextInt()){
            int chose = sc.nextInt();
            while (chose != 0) {
                if (chose == 3) {
                    target = ChangeTarget.ChangeTargetM(target);
                    System.out.println("New daily target: " + target + " steps");
                    printMenu();
                    chose = sc.nextInt();
                }
                else if (chose == 2){
                    System.out.println("А тут мы из базы данных инфу берем и выводим");
                    StepTracker.Output(months);
                    printMenu();
                    chose = sc.nextInt();
                }
                else if (chose == 1){
                    System.out.println("Введите номер месяца");
                    chose = sc.nextInt();
                    int month_number = chose;
                    System.out.println("Введите номер дня");
                    chose = sc.nextInt();
                    int day_number = chose;
                    System.out.println("Введите количество пройденных шагов");
                    chose = sc.nextInt();
                    int steps = chose;
                    setdata.setter(month_number, day_number, steps, months);
                    printMenu();
                    chose = sc.nextInt();
                }
                else {
                    System.out.println("@@@LERT, неверная команда");
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
        System.out.println("Choose action using number of it");
        System.out.println("1: Insert today's count of steps");
        System.out.println("2: Get stats for chosen month");
        System.out.println("3: Change target of steps per day");
        System.out.println("0: Exit");
    }

}
