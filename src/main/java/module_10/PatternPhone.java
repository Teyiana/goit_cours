package module_10;

import java.io.*;
import java.util.regex.Pattern;

public class PatternPhone {

    private static final Pattern CURVES_PHONE_PATTERN = Pattern.compile("\\((\\d{3})\\) (\\d{3})-(\\d{4})");
    private static final Pattern DASHES_PHONE_PATTERN = Pattern.compile("\\d{3}-\\d{3}-\\d{4}");

    public static void main(String[] args) {

        File file = new File("./src/main/resources/module_10/PatternPhone.txt");

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (CURVES_PHONE_PATTERN.matcher(line).matches()
                        || DASHES_PHONE_PATTERN.matcher(line).matches()) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
