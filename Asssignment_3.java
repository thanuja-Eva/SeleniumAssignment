package com.HA.Assignment.day1;

public class Asssignment_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum = 0;

		for (int i = 0; i <= 50; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
				sum = sum + i;
			}

		}

		System.out.println(sum);

		if (sum % 2 == 0) {
			System.out.println(sum + "Even number");
		}

		else {
			System.out.println(sum + "Odd number");
		}

	}

}
