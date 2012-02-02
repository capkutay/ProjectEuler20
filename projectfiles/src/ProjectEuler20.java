import java.math.BigInteger;
import java.util.Scanner;


public class ProjectEuler20 {
	
	@SuppressWarnings("static-access")
	//Method to compute factorial of the integer entered by the user
	public static BigInteger factorial(Integer n){
		BigInteger product = new BigInteger("1");
		BigInteger iterator = new BigInteger("1");
		BigInteger one = new BigInteger("1");
		//convert Integer n to toString that can be compared to BigInteger values
		BigInteger bigN = new BigInteger(n.toString());
		for(; iterator.compareTo(bigN) <= 0; iterator = iterator.add(one)){
			product = product.multiply(iterator);
		}
		return product; 
	}
	//Computes and returns the sum of the digits in the factorial of integer n
	public static int digitParse(Integer n){
		//Create a BigInteger variable containing the value returned from factorial method
		BigInteger product = factorial(n); 
		BigInteger ten = new BigInteger("10");
		int total = 0;
		while(product.compareTo(ten) > 0){
			total += product.mod(ten).intValue();
			product = product.divide(ten);	
		}
		total += product.intValue();
		return total;
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		Integer input = sc.nextInt();
		int a = digitParse(input);
		System.out.println(a);
	}
}
