package com.gaoruishan.androidsample.test;

/**
 * 在Android Studio中进行单元测试和UI测试
 * 1，右键点击Calculator类的声明，选择Go to > Test，然后"Create a new test…"
 * 2，选择JUnit4和"setUp/@Before"
 * 3，右键点击CalculatorTest类，选择Run > CalculatorTest。
 */
public class Calculator {

	public double sum(double a, double b) {
//        return 0;//错误返回
		return a + b;
	}

	public double substract(double a, double b) {
		return a - b;
	}

	public double divide(double a, double b) {
		return a / b;
	}

	public double multiply(double a, double b) {
		return a * b;
	}
}