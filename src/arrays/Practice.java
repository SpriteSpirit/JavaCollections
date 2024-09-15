package arrays;

import java.util.*;

public class Practice {
    public static void main(String[] args) {
        int[] weights = new int[12];
        weights[0] = 90;
        weights[1] = 85;
        weights[2] = 75;

        String[] months = {
                "Январь", "Февраль", "Март",
                "Апрель", "Май", "Июнь",
                "Июль", "Август", "Сентябрь",
                "Октябрь", "Ноябрь", "Декабрь"
        };


        Map<String, Integer> weightByMonth = new HashMap<>();

        for (int i = 0; i < months.length; i++) {
            weightByMonth.put(months[i], weights[i]);
        }

        System.out.println(weightByMonth);


    }



}
