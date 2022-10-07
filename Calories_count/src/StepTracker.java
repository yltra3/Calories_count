import java.time.MonthDay;
import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;

public class StepTracker {
    public static void Pull(HashMap<Integer, HashMap<Integer, Integer>> months){

        HashMap<Integer, Integer> temp;
        for(int i = 1; i<13; i++){
            months.put(i, new HashMap<>());
            temp = months.get(i);
            for(int j = 1; j < 31; j++)
                temp.put(j, 0);
        }
    }
    public static void Output(HashMap months) {
        int i = 1;
        while (months.get(i) != null){
            MonthOuter(i);
            System.out.println(months.get(i));
            i++;
        }
    }
    public static void MonthOuter(int i){
        String month = "smth";
        switch (i){
            case (1):
                month = "January";
                break;
            case (2):
                month = "February";
                break;
            case (3):
                month = "March";
                break;
            case (4):
                month = "April";
                break;
            case (5):
                month = "May";
                break;
            case (6):
                month = "June";
                break;
            case (7):
                month = "July";
                break;
            case (8):
                month = "August";
                break;
            case (9):
                month = "September";
                break;
            case (10):
                month = "October";
                break;
            case (11):
                month = "November";
                break;
            case (12):
                month = "December";
                break;
        }
        System.out.println("================\n" + month);
    }

//    @Override
//    public java.lang.String toString() {
//        return "StepTracker{" +
//                "String=" + StepTracker.months1 +
//                '}';
//    }
}


