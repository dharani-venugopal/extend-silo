import java.util.Scanner;
public class Division {
public static void main(String[] args) {
	Scanner obj=new Scanner(System.in);
	int value=obj.nextInt();
	int divider=obj.nextInt();
	int count=0;
	while(value>divider){
		value=value-divider;
		count++;
	}
	System.out.println("quotient"+count);
	System.out.println("remainder"+value);
	
}
}
