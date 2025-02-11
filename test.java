import java.util.*;

public class test {
    public static void main(String[] args) {
        int standardHeight = 6;
        int[] deviations = {1, 0, -1, -2, 1, 2, 2, 1, 1, -1, 1, 0, -1, -1, 1};
        
        // Count frequency of deviations
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int deviation : deviations) {
            frequencyMap.put(deviation, frequencyMap.getOrDefault(deviation, 0) + 1);
        }

        // Find the most common deviation
        int mostCommonDeviation = 0;
        int maxFrequency = 0;
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                mostCommonDeviation = entry.getKey();
                maxFrequency = entry.getValue();
            }
        }

        System.out.println("The most common height is: " + (standardHeight + mostCommonDeviation));
    }
}