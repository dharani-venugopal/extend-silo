import java.util.*;
public class Vowel_consonant {
	public static void main(String args[]){
		System.out.println("enter the character");
		Scanner c=new Scanner(System.in);
		char alpha=c.next().charAt(0);
		if(alpha=='a'&&alpha=='A'&&alpha=='e'&& alpha=='E'&& alpha=='i'&&alpha=='I'&&alpha=='o'&&alpha=='O'&& alpha=='u'&&alpha=='U'){
		System.out.println(" Given character is vowels");
		}
		else{
		System.out.println(" Given character is consonant");
		}
  }
}
