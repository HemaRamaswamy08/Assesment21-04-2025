package assesment1;

import java.util.Scanner;

public class GameStore {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int result = 0;
		int product = 0;

		int choice = 0;
		do {
			System.out.println("1 Call of Warfare   - ₹1500 ");
			System.out.println("2 Speed Racers      - ₹1200 ");
			System.out.println("3. Mystery Mansion   - ₹1000 ");
			System.out.println("4.Pixel Adventure   - ₹800");
			System.out.println("5. Puzzle Mania      - ₹500 ");
			System.out.println("6. Checkout / Exit ");
			System.out.println("Enter above number to choose");
			choice = sc.nextInt();
			if (choice <= 5) {
				System.out.println("How many copies do you like");
				int copy = sc.nextInt();
				System.out.println("Game(s) added to your cart!");
				switch (choice) {
				case 1: {
					product = 1500 * copy;
					break;
				}
				case 2: {
					product = 1200 * copy;
					break;
				}
				case 3: {
					product = 1000 * copy;
					break;
				}
				case 4: {
					product = 800 * copy;
					break;
				}
				case 5: {
					product = 500 * copy;
					break;
				}
				}
				result +=product;
			}
		} while (choice != 6);
		if (choice == 6) {
			System.out.println("Total cost :"+result);
		}

	}

}
