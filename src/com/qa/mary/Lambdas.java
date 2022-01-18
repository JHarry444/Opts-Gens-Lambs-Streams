package com.qa.mary;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Lambdas {

	private static void print(Object s) {
		System.out.println(s);
		;
	}

	public static void main(String[] args) {
		List<Integer> nums = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		Predicate<Integer> isEven = num -> num % 2 == 0;

		nums.stream().filter(isEven).forEach(num -> Lambdas.print(num));
		nums.stream().filter(isEven).forEach(Lambdas::print);

		List<Integer> even = nums.stream().filter(num -> num % 2 == 0).collect(Collectors.toList());
		System.out.println(even);

		Calculation sum = new Calculation() {
			@Override
			public double calculate(double a, double b) {
				return a + b;
			}
		};

		System.out.println("1 + 1 = " + sum.calculate(1, 1));

		Calculation division = (a, b) -> {
			return a / b;
		};

		System.out.println("10 / 5 = " + division.calculate(10, 5));
	}

}
