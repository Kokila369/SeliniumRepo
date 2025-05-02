package week1.day2;

public class IsPrimeNumber {

	public static void main(String[] args) {
		int prime=13;
		int number=0;
		for (int i = 2; i <= prime; i++) {
			if(prime%i==0)
			{
				System.out.println(prime + " is not a prime number.");
				break;
			}
			else if(number == 0)
			{
				System.out.println(prime + " is a prime number.");
				break;
				
			}
		}
	}
}
