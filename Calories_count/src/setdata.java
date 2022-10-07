import java.util.HashMap;

public class setdata {
    public static void setter(int month_number, int day_number, int steps, HashMap<Integer, HashMap<Integer, Integer>> months){
        HashMap<Integer, Integer> temp;
        temp = months.get(month_number);
        temp.remove(day_number);
        temp.put(day_number, steps);
        System.out.println("Data at chosen day was changed!");
    }
}
