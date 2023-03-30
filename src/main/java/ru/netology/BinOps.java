package ru.netology;

public class BinOps {
  public String sum(String a, String b) {
    /*Переведите числа из двоичной записи в
      строках в int, сложите и переведите
      обратно в двоичную запись*/
		int x = Integer.parseInt(a, 2);
		int y = Integer.parseInt(b, 2);

		int sum = x + y;

		String result = Integer.toBinaryString(sum);

		return result;
  }

  public String mult(String a, String b) {
    /*Переведите числа из двоичной записи в
      строках в int, перемножьте и переведите
      обратно в двоичную запись*/
		int x = Integer.parseInt(a, 2);
		int y = Integer.parseInt(b, 2);

		int mult = x * y;

		String result = Integer.toBinaryString(mult);

		return result;
  }
}
