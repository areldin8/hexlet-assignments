package exercise;

//import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

// BEGIN
public class TestApp {
    @Test
    public void test_enlargeArrayImage() {
        String[][] original_image = {
                {"A", "B"},
                {"C", "D"}
        };
        String[][] expected_enlarged_image = {
                {"A", "A", "B", "B"},
                {"A", "A", "B", "B"},
                {"C", "C", "D", "D"},
                {"C", "C", "D", "D"}
        };
        assertArrayEquals(App.enlargeArrayImage(original_image), expected_enlarged_image);
    }

    @Test
    public void test_emptyArray() {
        String[][] empty_image = {};
        assertArrayEquals(App.enlargeArrayImage(empty_image), new String[][]{});
    }

    @Test
    public void test_singleRowArray() {
        String[][] single_row_image = {{"A", "B", "C"}};
        String[][] expected_enlarged_image = {{"A", "A", "B", "B", "C", "C"}};
        assertArrayEquals(App.enlargeArrayImage(single_row_image), expected_enlarged_image);
    }
}
// END
