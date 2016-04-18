import java.util.Scanner;

class S3Assignment2
{
   public static void main(String args[])
   {
		int number;
		Scanner in = new Scanner(System.in);

		System.out.println("Enter a number");
		number = in.nextInt();
		
		boolean flag = false;

		for(int i = 2; i< number; i++) {
			
				if(number % i == 0) {
					flag = true;
					break;
				}	
		}
		
		if(flag == true) {
			System.out.println(number + " is not a prime number" );
		}
		else {
			System.out.println(number + " is a prime number" );
		}
	}
}