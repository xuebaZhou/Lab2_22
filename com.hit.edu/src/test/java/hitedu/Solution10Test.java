package hitedu;

import com.hitedu.Solution10;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution10Test {
    private final Solution10 solution = new Solution10();

    /**
     * 测试目的：
     * 测试两个分数相加后结果为零的情况。
     * 测试用例：
     * 输入表达式为 "-1/2+1/2"。
     * 预期输出为 "0/1"。
     */
    @Test
    public void testZeroResult() {
        String expression = "-1/2+1/2";
        String expectedResult = "0/1";

        String result = solution.fractionAddition(expression);

        assertEquals(expectedResult, result, "测试用例 1 失败");
    }

    /**
     * 测试目的：
     * 测试多个分数相加后结果为正数的情况。
     * 测试用例：
     * 输入表达式为 "-1/2+1/2+1/3"。
     * 预期输出为 "1/3"。
     */
    @Test
    public void testPositiveFractionResult() {
        String expression = "-1/2+1/2+1/3";
        String expectedResult = "1/3";

        String result = solution.fractionAddition(expression);

        assertEquals(expectedResult, result, "测试用例 2 失败");
    }

    /**
     * 测试目的：
     * 测试两个分数相减后结果为负数的情况。
     * 测试用例：
     * 输入表达式为 "1/3-1/2"。
     * 预期输出为 "-1/6"。
     */
    @Test
    public void testNegativeFractionResult() {
        String expression = "1/3-1/2";
        String expectedResult = "-1/6";

        String result = solution.fractionAddition(expression);

        assertEquals(expectedResult, result, "测试用例 3 失败");
    }

    /**
     * 测试目的：
     * 测试多个分数相加后结果大于1的情况。
     * 测试用例：
     * 输入表达式为 "1/2+1/3+1/4"。
     * 预期输出为 "13/12"。
     */
    @Test
    public void testGreaterThanOneResult() {
        String expression = "1/2+1/3+1/4";
        String expectedResult = "13/12";

        String result = solution.fractionAddition(expression);

        assertEquals(expectedResult, result, "测试用例 4 失败");
    }

    /**
     * 测试目的：
     * 测试多个负分数相加的情况。
     * 测试用例：
     * 输入表达式为 "-1/2-1/3-1/4"。
     * 预期输出为 "-13/12"。
     */
    @Test
    public void testMultipleNegativeFractions() {
        String expression = "-1/2-1/3-1/4";
        String expectedResult = "-13/12";

        String result = solution.fractionAddition(expression);

        assertEquals(expectedResult, result, "测试用例 5 失败");
    }

    /**
     * 测试目的：
     * 测试只有一个正分数的情况。
     * 测试用例：
     * 输入表达式为 "5/7"。
     * 预期输出为 "5/7"。
     */
    @Test
    public void testSinglePositiveFraction() {
        String expression = "5/7";
        String expectedResult = "5/7";

        String result = solution.fractionAddition(expression);

        assertEquals(expectedResult, result, "测试用例 6 失败");
    }

    /**
     * 测试目的：
     * 测试只有一个负分数的情况。
     * 测试用例：
     * 输入表达式为 "-3/5"。
     * 预期输出为 "-3/5"。
     */
    @Test
    public void testSingleNegativeFraction() {
        String expression = "-3/5";
        String expectedResult = "-3/5";

        String result = solution.fractionAddition(expression);

        assertEquals(expectedResult, result, "测试用例 7 失败");
    }

    /**
     * 测试目的：
     * 测试分母为1的分数运算情况。
     * 测试用例：
     * 输入表达式为 "2/1+3/1"。
     * 预期输出为 "5/1"。
     */
    @Test
    public void testDenominatorOneResult() {
        String expression = "2/1+3/1";
        String expectedResult = "5/1";

        String result = solution.fractionAddition(expression);

        assertEquals(expectedResult, result, "测试用例 8 失败");
    }
}
