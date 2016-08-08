public class powerSum {
	public static void main(String[] args) {
	int num=122334;
	String name =Integer.toString(num);
	StringBuffer name1=new StringBuffer(name);
	name1=name1.reverse();
	String name2=new String(name1);
	int value=Integer.parseInt(name2);
	double sum=0;
	while(value!=0){
		int rem=value%10;
		value=value/10;
		int temp=value%10;
		double value1=Math.pow(rem,temp);
		sum=sum+value1;
		
	}
	System.out.println(sum);
	}

}