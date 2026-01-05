package day3;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//5 factorial is 5*4*3*2*1 ans 120
		//it is also same as 1*2*3*4*5 ans 120
		int num=5;
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		System.out.println(fact);

	}

}
