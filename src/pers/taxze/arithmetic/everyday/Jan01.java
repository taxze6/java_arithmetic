package pers.taxze.arithmetic.everyday;
/**
 * 力扣2022年一月一日每日一题
 * 题目链接：https://leetcode-cn.com/problems/convert-1d-array-into-2d-array/description/
 来源：力扣（LeetCode）
 */
public class Jan01 {
    public int[][] construct2DArray(int[] original, int m, int n) {
        if (original.length != m*n)
            return new int[0][0];
        int[][] value = new int[m][n];
        for(int i = 0,pointer = 0;i < m;i++){
            for(int j = 0;j < n;j++){
                value[i][j] = original[pointer++];
            }
        }
        return value;
    }
}
