package lib;

public class Nums {
	public static int randomNumber(int min, int max) {
		//randomNumber returns a random integer number between int min and int max
		int range=max-min+1;
		int rand=(int)(Math.random()*range);
		int result=rand+min;
		return result;
	}
	public static int nextPrime(int num){
		// nextPrime returns the next prime number after the int parameter or 0 if 
		//there are no prime numbers greater than the parameter that can be 
		//represented as an int.
		if (num== Integer.MAX_VALUE){
			return 0;
		}
		num=num+1;
		while (!lib.Is.prime(num)){
			if (num== Integer.MAX_VALUE){
				return 0;
			}
			num++;
		}
		
		return num;
	}
	public static double round(double r, int n){
		//returns a double parameter value round to the number of decimal places
		//of second parameter value.
		double m= Math.pow(10, n);
		r=r*m;
		int result= (int)(r+.5);
		double newNumber= result/m;
		return newNumber;
		
}
}