package com.hitedu;

import java.util.ArrayList;
import java.util.List;


/**
 * @description: 给定一个表示分数加减运算的字符串 expression ，你需要返回一个字符串形式的计算结果。
 * <p>
 * 这个结果应该是不可约分的分数，即最简分数。 如果最终结果是一个整数，例如 2，你需要将它转换成分数形式，其分母为 1。所以在上述例子中, 2 应该被转换为 2/1。
 * <p>
 * <p>
 * <p>
 * 示例 1:
 * <p>
 * 输入: expression = "-1/2+1/2"
 * 输出: "0/1"
 * 示例 2:
 * <p>
 * 输入: expression = "-1/2+1/2+1/3"
 * 输出: "1/3"
 * 示例 3:
 * <p>
 * 输入: expression = "1/3-1/2"
 * 输出: "-1/6"
 * <p>
 * <p>
 * 提示:
 * <p>
 * 输入和输出字符串只包含 '0' 到 '9' 的数字，以及 '/', '+' 和 '-'。
 * 输入和输出分数格式均为 ±分子/分母。如果输入的第一个分数或者输出的分数是正数，则 '+' 会被省略掉。
 * 输入只包含合法的最简分数，每个分数的分子与分母的范围是  [1,10]。 如果分母是1，意味着这个分数实际上是一个整数。
 * 输入的分数个数范围是 [1,10]。
 * 最终结果的分子与分母保证是 32 位整数范围内的有效整数。
 */
public class Solution10 {
    public String fractionAddition(String expression) {
        long x = 0, y = 1; // 总分子，分母
        int index = 0, n = expression.length();

        while (index < n) {
            // 读取分子符号
            long x1 = 0, sign = 1;
            if (expression.charAt(index) == '-' || expression.charAt(index) == '+') {
                sign = expression.charAt(index) == '+' ? 1 : -1;
                index++;
            }

            // 读取分子
            while (index < n && Character.isDigit(expression.charAt(index))) {
                x1 = x1 * 10 + expression.charAt(index) - '0';
                index++;
            }
            x1 = sign * x1;
            index++; // 跳过 '/'

            // 读取分母
            long y1 = 0;
            while (index < n && Character.isDigit(expression.charAt(index))) {
                y1 = y1 * 10 + expression.charAt(index) - '0';
                index++;
            }

            // 更新总分数
            x = x * y1 + x1 * y;
            y *= y1;
        }

        if (x == 0) {
            return "0/1";
        }

        long g = gcd(Math.abs(x), y); // 获取最大公约数

        // 确保分母为正数
        if (y < 0) {
            x = -x;
            y = -y;
        }

        return Long.toString(x / g) + "/" + Long.toString(y / g); // 返回最简分数
    }

    // 计算最大公约数
    public long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}

//我是2211103班的任铄同，我已看完周奕兵的程序代码和测试用例，都没有问题，在这里添加一条注释来进行后续实验
