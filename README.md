import java.util.Scanner;
public class number {
	 public static void main(String args[]){
     System.out.println("ENTER THE NUMBER");
	 Scanner input=new Scanner(System.in);
	 int number=input.nextInt();
	 if(number!=0){
	     if(number>0){
	      System.out.println("positive number");
	      }
	    else{
	      System.out.println("negative number");
	    }
	  }
	  else{
	  System.out.println("zero");
	  }
	}
}
