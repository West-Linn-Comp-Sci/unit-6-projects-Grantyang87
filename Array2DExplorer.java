
/**
 * Write a description of class Array2DExplorer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
 import java.util.Random;
public class Array2DExplorer {
    
    public boolean evenRow(int[][] mat, int row) {
        for(int x : mat[row]) {
            if(x % 2 != 0) {
                return false;
            }
        }
        return true;
    }
    public String oddColSum(int[][] nums, int col) {
        int maxValue = 0;
        String max = "";
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if (nums[i][j] > maxValue) {
                    maxValue = nums[i][j];
                }
            }
            return max;
        }
        return max;
    }
    public int[] minRowPractice(int[][] nums) {
        int[] smallestArray = nums[0];
        int smallestVal = nums[0][0];
        for(int[] array : nums) {
            for(int i : array) {
                if(i >= smallestVal) continue;
                smallestArray = array;
                smallestVal = i;
            }
        }
        return smallestArray;
    }
    public int minRowAssignment(int[][] nums, int row) {
        int min = nums[row][0];
        for(int i : nums[row]) {
            if(i < min) min = i;
        }
        return min;
    }
    public int[] colMaxs(int[][] matrix) {
        int[] out = new int[matrix[0].length];
        for(int i = 0; i < matrix[0].length; i++) {
            int max = Integer.MIN_VALUE;
            for(int[] row : matrix) {
                if(row[i] > max) max = row[i];
            }
            out[i] = max;
        }
        return out;
    }
    public int[] allRowSums(int[][] data) {
        int total2 = 0;
        int x[] = new int[data.length];
        for(int i = 0; i < data.length; i++){
            for(int j = 0; j < data[i].length; j++){
                data[i][j] = total2;
                x[i] = x[i] + total2;
            }
        }
        return x;
    }
    public double[] averageCol(int[][] nums) {
        double[] out = new double[nums[0].length];
        for(int i = 0; i < nums[0].length; i++) {
            int sum = 0;
            for(int[] row : nums) {
                sum += row[i];
            }
            out[i] = (double) sum / nums.length;
        }
        return out;
    }
    public int smallEven(int[][] matrix)
    {
        int smallEven = matrix[0][0];
        for(int[] row : matrix)
        {
            for(int i : row)
            {
                if(i < smallEven && i %2 == 0)
                {
                    smallEven = i;
                }
            }
        }
        return smallEven;
    }
    public int biggestRow(int[][] nums) {
        int[] rowSums = allRowSums(nums);
        int largestRowIndex = 0;
        for(int i = 1; i < rowSums.length; i++) {
            if(rowSums[i] > rowSums[largestRowIndex])
            {
                largestRowIndex = i;
            }
        }
        return largestRowIndex;
    }
}