package com;

public class Pow {

  static int pow(int a, int b) {
    if (b == 0)
      return 1;

    int result = a;
    int power = a;
    int i, j;

    for (i = 1; i < b; i++) {
      for (j = 1; j < a; j++) {
        result += power;
      }
      power = result;
    }

    return result;
  }

  public static void main(String[] args) {
    System.out.println(String.format("Pow function pow(%d, %d) : {%d}" ,2,2, pow(2, 2)));
  }
}
