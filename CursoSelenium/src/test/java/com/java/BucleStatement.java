package com.java;

public class BucleStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// WHILE

		int i = 0;

		while (i < 10) {
			++i;
			System.out.println("El valor de i es " + i);
		}

		// DO-WHILE

		int num = 0;
		int add = 5;
		int count = 0;

		do {
			num += add;
			++count;
		} while (num < 100);
			System.out.println("Num se ha sumado " + count + " veces.");

		// FOR

		for (int j = 0; j < 10; ++j) {
			System.out.println("El valor de j es: " + j);
		}
	}
}
