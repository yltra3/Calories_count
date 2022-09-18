import java.time.MonthDay;
import java.util.Scanner;
import java.util.HashMap;

public class StepTracker {
    HashMap<Integer, MonthData> monthToData = new HashMap<Integer, MonthData>();

    public StepTracker() {
        for (int i = 0; i < 12; i++) {
            monthToData.put(i, new MonthData());
        }
    }
    static class MonthData {
        HashMap<Integer, Integer> dataToSteps = new HashMap<>();
        public MonthData() {
            for (int i = 0; i < 30; i++) {
                dataToSteps.put(i, 0);
            }
        }
    }
    class InputUserMonthDataSteps {
        private StepTracker stepTracker = new StepTracker();

        public void savingIndicatorsInTheTable(Integer month, Integer data, Integer steps) {
            stepTracker.monthToData
                    .computeIfAbsent(month, m -> new MonthData()) // MonthData для месяца
                    .dataToSteps.put(data, steps);
            System.out.println("В " + (month + 1) + "-м месяце ваша статистика " + stepTracker.monthToData.get(month));
        }
    }
}


