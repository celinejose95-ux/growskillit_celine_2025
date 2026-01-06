package Assignment;

public class Assignment_SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=456;
		int digit=0;
		int value=0;
		while(num!=0)
		{
		digit=num%10;//6
		value=value+digit;
		num=num/10;//45
			
		}
		System.out.println(value);
		

	}

}
