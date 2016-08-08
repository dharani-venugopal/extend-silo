import java.util.Scanner;

public class PowerWithoutPow {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int value = obj.nextInt();
		int number = value;
		int count = 0;
		while (number != 0) {
			number = number / 10;
			count++;
		}
		int sum = 1;
		int temp = 0;
		while (value != 0) {
			sum = 1;
			int value1 = value % 10;
			for (int i = 0; i < count; i++) {
				sum = sum * value1;

			}
			value = value / 10;
			temp = temp + sum;
			
		}
		System.out.println(temp);
	}
}
