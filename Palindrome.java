package assesment1;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number to check Palindrome or not");
		int num = sc.nextInt();
		int temp = num;
		int result = 0;
		int remainder = 0;
		while (temp != 0) {
			remainder = temp % 10;
			result = result * 10 + remainder;
			temp = temp / 10;

		}
		if (result == num) {
			System.out.println(num + " is a Palindrome ");
		} else {
			System.out.println(num + " is not a Palindrome");
		}
		sc.close();

	}
}
