/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package javalibrary;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    @Test void someLibraryMethodReturnsTrue() {
        Library classUnderTest = new Library();
        assertTrue(classUnderTest.someLibraryMethod(), "someLibraryMethod should return 'true'");
    }
    @Test void rollDice(){
        Library classUnderTest = new Library();
        assertEquals(classUnderTest.roll(5).length, 5);
    }
    @Test void testForDuplicates() {
        Library classUnderTest = new Library();
        int[] testArr1 = {1,2,3,4,5,6};
        int[] testArr2 = {1,2,3,3,5,6};
        int[] testArr3 = {1,3,4,5,6,6};
        int[] testArr4 = {1,2,5,4,3,6};

        assertFalse(classUnderTest.containsDuplicates(testArr1));
        assertTrue(classUnderTest.containsDuplicates(testArr2));
        assertTrue(classUnderTest.containsDuplicates(testArr3));
        assertFalse(classUnderTest.containsDuplicates(testArr4));
    }
    @Test void testAverage() {
        Library classUnderTest = new Library();
        int[] testArr5 = {23,45,56,34};
        int[] testArr6 = {45,56,78,67};

        assertEquals(39.0, classUnderTest.numbAverage(testArr5));
        assertEquals(61.0, classUnderTest.numbAverage(testArr6));
    }
    @Test void smallArr(){
        Library classUnderTest = new Library();
        int[][] mat = {
                {1,2,3,4,5,7,8,7,6},
                {8,7,6,5,5,4,3,3},
                {9,8,7,56,6,5,4,56,54,6},
                {8,7,6,5,6,5,4,5}
        };

        int[] answ = {8,7,6,5,6,5,4,5};
        assertEquals(answ, classUnderTest.matSearch(mat));
    }
}