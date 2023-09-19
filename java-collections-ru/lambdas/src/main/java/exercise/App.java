package exercise;

import java.util.Arrays;

// BEGIN
class App {
    public static List<List<String>> enlargeArrayImage(List<List<String>> image) {
        int height = image.size();
        int width = image.get(0).size();

        List<List<String>> enlarged_image = new ArrayList<>();

        for (int i = 0; i < height; i++) {
            enlarged_image.add(image.get(i));
            enlarged_image.add(image.get(i));
        }

        int enlarged_width = 2 * width;
        for (int i = 0; i < enlarged_image.size(); i++) {
            List<String> row = enlarged_image.get(i);
            row.addAll(row);
        }

        return enlarged_image;
    }
}

    List<List<String>> original_image = new ArrayList<>();
original_image.add(new ArrayList<>(List.of("A", "B")));
        original_image.add(new ArrayList<>(List.of("C", "D")));

        List<List<String>> enlarged_image = App.enlargeArrayImage(original_image);
        for (List<String> row : enlarged_image) {
        System.out.println(String.join("", row));
        }
// END
