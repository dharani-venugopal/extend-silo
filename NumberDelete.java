import java.util.Scanner;
public class NumberDelete {
public static void main(String[] args) {
	Scanner obj=new Scanner(System.in );
	System.out.println("ENTER THE NUMBER");
	int number=obj.nextInt();
	System.out.println("ENTER THE NO OF DIGITS TO DELETE");
	int deleteDigit=obj.nextInt();
	int i=0;
	int value;
	int[] numArray=new int[10];
	while(number!=0){
		int temp=number%10;
		numArray[i]=temp;
		i++;
		number=number/10;
	}
	for(int j=0;j<i;j++){
		for(int k=j+1;k<i;k++){
			if(numArray[j]>numArray[k])
	    	   {
	    		   value=numArray[j];
	    		  numArray[j]=numArray[k];
	    		  numArray[k]=value;    		   
	    	   }
		}
	}
	for(int j=0;j<i-deleteDigit;j++){
		System.out.println(numArray[j]);
	}
}

}
