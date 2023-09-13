package exercise;

import java.util.List;
import java.util.Arrays;

// BEGIN
public class App {
    public static int getCountOfFreeEmails(List<String> emails) {
        int count = 0;

        for (String email : emails) {
            if (isFreeEmailDomain(email)) {
                count++;
            }
        }

        return count;
    }
    private static boolean isFreeEmailDomain(String email) {
        String[] freeDomains = {"gmail.com", "yandex.ru", "hotmail.com"};
        String[] parts = email.split("@");

        if (parts.length == 2) {
            String domain = parts[1].toLowerCase();
            for (String freeDomain : freeDomains) {
                if (domain.equals(freeDomain)) {
                    return true;
                }
            }
        }

        return false;
    }
}
// END
