package ConceptsAndAlgorithms.Chapter8RecursionAndDynamicProgramming;

/*
Triple Step: A child is running up a staircase with n steps and can hop either 1 step, 2 steps, or 3
steps at a time. Implement a method to count how many possible ways the child can run up the
stairs.
 */

import java.util.Arrays;

public class TripleStep {

    //Recursive solution
    public int countWays(int n) {
        if(n < 0) {
            return 0;
        }
        if(n == 0) {
            return 1;
        }

        return countWays(n - 1) + countWays(n - 2) + countWays(n - 3);
    }

    //Memoization solution
    public int countWaysM(int n) {
        int[] ways = new int[n + 1];
        Arrays.fill(ways, -1);

        return countWaysM(n, ways);
    }

    private int countWaysM(int n, int[] ways) {
        if(n < 0) {
            return 0;
        }
        if(n == 0) {
            return 1;
        }
        if(ways[n] > -1) {
            return ways[n];
        }
        ways[n] = countWaysM(n - 1) + countWaysM(n - 2) + countWaysM(n - 3);
        return ways[n];
    }
}
