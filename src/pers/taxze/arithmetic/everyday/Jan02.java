package pers.taxze.arithmetic.everyday;
/**
 * 力扣2022年一月二日每日一题
 * 题目链接：https://leetcode-cn.com/problems/elimination-game/
 来源：力扣（LeetCode）
 */
public class Jan02 {
    public int lastRemaining(int n) {
        if(n == 0 || n == 1){
            return n;
        }
        int num = n;
        int k = 0;//判断是从左往右还是从右往左
        int a0 = 1;
        int d = 1;
        while (num != 1){
            if(num % 2 == 1){
                a0 = a0 + d;
            }else if(num % 2 == 0){
                if (k % 2 == 0){
                    a0 = a0 + d;
                }else {
                    a0 = a0;
                }
            }
            k++;
            d *= 2;
            num /= 2;
        }
        return a0;
    }
}
