package exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

// BEGIN
public class App {
    public static Map<String, String> genDiff(Map<String, ?> first, Map<String, ?> second) {
        Map<String, String> result = new LinkedHashMap<>();
        // Iterate through keys in the first dictionary
        for (String key : first.keySet()) {
            if (second.containsKey(key)) {
                // Key exists in both dictionaries
                if (first.get(key).equals(second.get(key))) {
                    // Values are the same
                    result.put(key, "unchanged");
                } else {
                    // Values are different
                    result.put(key, "changed");
                }
            } else {
                // Key exists in the first dictionary but not in the second
                result.put(key, "deleted");
            }
        }
        // Iterate through keys in the second dictionary to find added keys
        for (String key : second.keySet()) {
            if (!first.containsKey(key)) {
                // Key exists in the second dictionary but not in the first
                result.put(key, "added");
            }
        }
        return result;
    }
}
//END
