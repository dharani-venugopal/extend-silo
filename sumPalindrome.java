import java.util.Scanner;


public class SumOfDigitsPalindrome {
public static void main(String[] args) {
	Scanner obj=new Scanner(System.in);
	long number=obj.nextLong();
	long temp=number;
	long sum=0;
	while(number!=0){
		long temp1=number%10;
		sum=sum+temp1;
		number=number/10;
	}
	String name=Long.toString(sum);
	StringBuffer bf=new StringBuffer(name);
	StringBuffer bff=bf.reverse();
	String name1=new String(bff);
	if(name.equalsIgnoreCase(name1)){
		System.out.println("given number's sum is palindrome");
	}
	else{
		System.out.println("given number's sum is not palindrome");
	}
	
}
}