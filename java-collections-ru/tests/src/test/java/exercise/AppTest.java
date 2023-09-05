package exercise;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void testTake() {
        // BEGIN
        List<Integer> inputList = Arrays.asList(1, 2, 3, 4, 5);
        int n = 3;

        List<Integer> result = YourClass.take(inputList, n);

        List<Integer> expected = Arrays.asList(1, 2, 3);
        assertEquals(expected, result);
    }
    @Test
    void testTakeWithEmptyList() {
        List<Integer> inputList = Arrays.asList();
        int n = 3;

        List<Integer> result = YourClass.take(inputList, n);

        assertTrue(result.isEmpty());
    }

    @Test
    void testTakeWithNegativeN() {
        List<Integer> inputList = Arrays.asList(1, 2, 3, 4, 5);
        int n = -2;

        assertThrows(IllegalArgumentException.class, () -> {
            YourClass.take(inputList, n);
        });
    }

    @Test
    void testTakeWithNGreaterThanListSize() {
        List<Integer> inputList = Arrays.asList(1, 2, 3, 4, 5);
        int n = 10;

        List<Integer> result = YourClass.take(inputList, n);

        assertEquals(inputList, result);
    }

    @Test
    void testTakeWithNullInput() {
        List<Integer> inputList = null;
        int n = 3;

        assertThrows(NullPointerException.class, () -> {
            YourClass.take(inputList, n);
        });
    }
        // END
    }

