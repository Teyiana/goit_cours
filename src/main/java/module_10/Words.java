package module_10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Words {
    public static void main(String[] args) {
        Map<String, Integer> wordsMap = readAndCalculateWords("./src/main/resources/module_10/Words.txt");
        List<Map.Entry<String, Integer>> list = toSortedList(wordsMap);
        for (Map.Entry<String, Integer> element : list) {
            System.out.println(element.getKey() + " " + element.getValue());
        }
    }

    private static List<Map.Entry<String, Integer>> toSortedList(Map<String, Integer> wordsMap) {
        List<Map.Entry<String, Integer>> list = new ArrayList<>(wordsMap.entrySet());
        list.sort(new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                int result = Integer.compare(o2.getValue(), o1.getValue());
                if (result == 0) {
                    return o1.getKey().compareTo(o2.getKey());
                }
                return result;
            }
        });
        return list;
    }

    private static Map<String, Integer> readAndCalculateWords(String filePath) {
        Map<String, Integer> wordsMap = new HashMap<>();
        File file = new File(filePath);
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.toLowerCase().split(" ");
                for (String word : words) {
                    if (wordsMap.containsKey(word)) {
                        wordsMap.put(word, wordsMap.get(word) + 1);
                    } else {
                        wordsMap.put(word, 1);
                    }
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return wordsMap;
    }
}

