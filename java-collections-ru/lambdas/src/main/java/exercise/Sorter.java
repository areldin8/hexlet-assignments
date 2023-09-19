package exercise;

import java.util.Comparator;
import java.util.Map;
import java.util.List;
import java.time.LocalDate;
import java.util.stream.Collectors;

// BEGIN
public class Sorter {
    public static List<String> takeOldestMans(List<Map<String, String>> userList) {
        Comparator<Map<String, String>> dobComparator = (user1, user2) -> {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            try {
                Date dob1 = dateFormat.parse(user1.get("dob"));
                Date dob2 = dateFormat.parse(user2.get("dob"));
                return dob1.compareTo(dob2);
            } catch (ParseException e) {
                e.printStackTrace();
                return 0;
            }
        };

        List<Map<String, String>> maleUsers = new ArrayList<>();
        for (Map<String, String> user : userList) {
            if ("Male".equalsIgnoreCase(user.get("gender"))) {
                maleUsers.add(user);
            }
        }

        maleUsers.sort(dobComparator.reversed());

        List<String> maleNames = new ArrayList<>();
        for (Map<String, String> maleUser : maleUsers) {
            maleNames.add(maleUser.get("name"));
        }
        return maleNames;
    }
}
// END
