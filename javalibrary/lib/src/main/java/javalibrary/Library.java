/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package javalibrary;

import java.util.Arrays;
import java.util.Random;

public class Library {
    public boolean numbAverage;

    public boolean someLibraryMethod() {
        return true;
    }

    public static int[] roll(int n) {
        int[] arrayRolls = new int[n];

        for (int i = 0; i < n; i++) {
            int dice = new Random().nextInt(5) + 1;
            arrayRolls[i] = dice;
        }
        return arrayRolls;
    }

    public static boolean containsDuplicates(int[] numbs) {
        for (int i = 0; i < numbs.length; i++) {
            for (int j = i + 1; j < numbs.length; j++) {
                if (numbs[i] == numbs[j]) {
                    return true;
                }
            }
        }
        return false;
    }
    public int numbAverage(int[] arr) {
        int sum = Arrays.stream(arr).sum();
        return (sum / arr.length);
    }

    public int[] matSearch(int[][] matrix){
        int avg = 0;
        int[] result = new int[0];

        for (int[] ints : matrix) {
            int sum = Arrays.stream(ints).sum();
            int newAvg = (sum / ints.length);

            if (newAvg < avg) {
                avg = newAvg;
                result = ints;
            }
        }
        return result;
    }

}