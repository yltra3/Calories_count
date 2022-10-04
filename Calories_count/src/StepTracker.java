import java.time.MonthDay;
import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;

public class StepTracker {

    public static void Pull(HashMap<Integer, HashMap<Integer, Integer>> months){
        HashMap<Integer, Integer> temp;
        for(int i = 0; i<12; i++){
            months.put(i, new HashMap<>());
            temp = months.get(i);
            for(int j = 0; j < 30; j++)
                temp.put(j, 0);
        }


    }
    public static void Output(HashMap months) {
        System.out.println(months);
    }
}


