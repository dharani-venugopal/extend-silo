import java.util.Scanner;
public class RemoveChar {
public static void main(String[] args) {
	Scanner obj=new Scanner(System.in);
	String name=obj.next();
	name=name.replaceAll("[^\\d]", "");
	System.out.println(name);
}
}
