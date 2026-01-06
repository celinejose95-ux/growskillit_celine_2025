package Assignment;

public class Assignment_OddIndexZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=5678;
		int count=0;
		int newnumber=0;
		while(num>0)
		{
			count++;
			int lastDigit=num%10;
			if(count==2)
			{
				newnumber=lastDigit*10+newnumber;
			}
			else if(count==4)
			{
				newnumber=lastDigit*1000+newnumber;
			}
			num=num/10;
		}
		System.out.println(newnumber);

	}

}
