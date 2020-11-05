// Straxinja - 5/2020
import java.util.Scanner;

public class FindingPrimeNumbers
{
	public static boolean isPrime(int n){
		boolean x = true;
		for(int i = 2; i <= n/2; i++){
			if(n%i == 0){x = false; break;}
		}
		return x;
	}
	public static void main( String[] args ){
	
	for(int i = 2; i <=100; i++){
		if(isPrime(i)){
			System.out.println(i);	
		}
//else{System.out.println(i);}
	}
	
 }

}
