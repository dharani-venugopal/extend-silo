import java.util.Scanner;
public class PrintWithoutLoop {
	static int count = 0;
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		long number = obj.nextLong();
		PrintWithoutLoop object = new PrintWithoutLoop();
		object.print(number);
	}
	int value = 0;
	void print(long num) {
		if (num >= count) {
			System.out.println(count++);
			print(num);
		}
	}
}
