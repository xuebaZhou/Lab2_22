package com.hitedu;

public class Main {
    public static void main(String[] args) {
        // 创建Solution10类的实例
        Solution10 solution = new Solution10();

        // 测试数据
        String expression1 = "-1/2+1/2";
        String expression2 = "-1/2+1/2+1/3";
        String expression3 = "1/3-1/2";

        // 调用fractionAddition方法并打印结果
        System.out.println(solution.fractionAddition(expression1)); // 输出 "0/1"
        System.out.println(solution.fractionAddition(expression2)); // 输出 "1/3"
        System.out.println(solution.fractionAddition(expression3)); // 输出 "-1/6"
    }
}