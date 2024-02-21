package module_11;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Solution2 {
    public static void main(String[] args) {
        List<String> name = new ArrayList<>();
        name.add("Petro");
        name.add("Oleh");
        name.add("Ivan");
        name.add("Pavlo");
        name.add("Olha");
        name.add("Taras");
        name.add("Olena");
        System.out.println(sortStringToUpp(name));
    }

    public static List<String> sortStringToUpp(List<String> name) {
        return name
                .stream()
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }
}
