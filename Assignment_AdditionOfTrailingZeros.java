package Assignment;

public class Assignment_AdditionOfTrailingZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//if input is 5 then output should be 50
		//if input is 76 then o/p will be 7600
		// we have to number of provide the trailing zeros based on the digits of inputs(input having onbe digit then add one trailing zero)
		int num=567;
		int multiplayer=num;
		int count=0;
		while(num!=0)
		{
			count++;
			num=num/10;
		}
		
		while(count!=0)
		{
			multiplayer=multiplayer*10;
			count--;
		}
		System.out.println(multiplayer);


	}

}
