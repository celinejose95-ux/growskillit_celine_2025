package day1;

public class OddEvenCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=12345;
		int evenCount=0;
		int oddCount=0;
		while(num!=0)
		{
			int number=num%10;
			if(number%2==0)
			{
				evenCount++;
			}
			else
			{
				oddCount++;
			}
			num=num/10;
			
		}
		System.out.println("no of evennumbers is:"+evenCount);
		System.out.println("no of oddnumbers is:"+oddCount);

	}

}
