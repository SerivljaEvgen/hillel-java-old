package homework.task_6_exceptions;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class ArrayValueCalculatorTest {
    //1
    @Test
    void testValidInputArray() {
        String[][] arr = {
                {"1", "2", "3", "4" },
                {"5", "6", "7", "8" },
                {"9", "10", "11", "12" },
                {"13", "14", "15", "16"}
        };
        ArrayValueCalculator arrCalc = new ArrayValueCalculator();
        int result = arrCalc.doCalc(arr);
        assertEquals(136, result);
    }

    // Тест 2 зробив за допомогою ChatGPT, бо не розумів як обробляти винятки

    //fail() - це метод з бібліотеки JUnit, який викликається в unit-тестах, коли очікується, що тест не пройде успішно.
    // Виклик fail() означає, що у теста виявлено невідповідність або помилку, і тест вважається проваленим.

    //2
    @Test
    void testInvalidInputArray() {
        String[][] arr = {
                {"1", "2", "3", "4" },
                {"1", "2", "3", "4" },
                {"5", "6", "7", "8" },
                {"9", "10", "11", "12" },
                {"13", "14", "15", "16"}
        };
        ArrayValueCalculator arrCalc = new ArrayValueCalculator();
        try {
            int result = arrCalc.doCalc(arr);
            fail();
        } catch (ArraySizeException e){
            assertEquals("ArraySizeException: Array should be 4x4", e.getMessage());
        } catch (ArrayDataException e){
            fail();
        }
    }

    //3 - Тест 3 зробив по аналогії з другим.
    @Test
    void testInvalidDataInArray() {
        String[][] arr = {
                {"1", "2", "3", "n"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };
        ArrayValueCalculator arrCalc = new ArrayValueCalculator();
        try {
            int result = arrCalc.doCalc(arr);
            fail();
        } catch (ArraySizeException e) {
            fail();
        } catch (ArrayDataException e) {
            assertEquals("ArrayDataException [0][3]", e.getMessage());
        }
    }

}