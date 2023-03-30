package ru.netology;

public class Main {
	public static void main(String[] args) {
		BinOps bins = new BinOps();
		String a = "10"; // 2
		String b = "11"; // 3
		String sum = bins.sum(a, b);
		System.out.println(a + " + " + b + " = " + sum );
		String mult = bins.mult(a, b);
		System.out.println(a + " * " + b + " = " + mult );
  }
}
