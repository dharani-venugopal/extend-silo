import java.util.Scanner;

public class firstElement {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("enter the size of array");
		int count = obj.nextInt();
		System.out.println("enter the numbers in array");
		int[] intArray = new int[count];
		for (int i = 0; i < count; i++) {
			intArray[i] = obj.nextInt();
		}
		int value[] = new int[count];
		int k=0;
		int length=0;
		for (int i = 0; i < count; i++) {
			
		for(int j=i+1;j<count;j++){
			if(intArray[i]==intArray[j]){
				value[k]=intArray[i];
				k++;
				break;
			}
		}
		}
		System.out.println(value[k-2]);
		

	}
}
