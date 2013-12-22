package lib;

public class Is {
	public static boolean anInteger(String s) { 
		//returns true if the parameter String can be represented as an integer
		if (s.substring(0,1).equals("-")){
			s= s.substring(1);

		}
		for(int y=0; y<=s.length()-1; y++){
			String l=s.substring(y,y+1);
			int n=lib.Constants.DIGITS.indexOf(l);
			if (n==-1){
				return false;
			}
		}
		return true;
	}
	public static boolean palindrome(int num){
		//returns true only if the parameter int has the same value of the digits
		//that constitute the number are reversed.
		int copyOfNum=num;
		int newNumber=0;
		while (copyOfNum>0){
			int onesDigit=copyOfNum%10;
			copyOfNum= copyOfNum/10;
			newNumber= (newNumber*10)+onesDigit;
		} 
		if (num==newNumber){
			return true;
		} else {
			return false;
		}

	}
	public static boolean palindrome(String v){
		//returns true only if the parameter String is identical if its constituent
		//characters are the same in the reverse order (ignoring spaces, punctuation,
		//and letter case).
		v= Change.upperCase(v);
		v= Change.removeAnything(v, Constants.PUNCTUATION+Constants.DIGITS+" ");
		String p1= "";
		for (int i=0; i<v.length()/2; i++){
			String l=v.substring(i, i+1);
			p1=p1+l;
		}
		return v.substring(v.length()/2+v.length()%2).equals(p1);	
	}
	public static boolean selfDivisor(int num){
		//returns true only if the number can be evenly divided by each of its
		//constituent digits.
		int copyOfNum=num;
		if (copyOfNum==0) {
			return false;
		}
		while (copyOfNum>0){
			int onesDigit=copyOfNum%10;
			copyOfNum= copyOfNum/10;
			if (onesDigit==0){
				return false;
			}
			if (num%onesDigit!=0){
				return false;
			}
		} 

		return true;
	}
	public static boolean prime(int num){
		//returns true only if the number is prime.
		int divisor=2;
		if(num<=1){
				return false;
			}
		while (divisor<num){
			if (num%divisor == 0){
				return false; 
			}
			
			divisor++;
		} 
		return true;
	}
	public static boolean even(int num){
		//returns true only if the number is even.
		if (num%2 == 0){
			return true;
		} else {
			return false;
		}

	}
	public static boolean odd(int num){
		//returns true only if the number is odd.
		return (num%2 !=0);
	}
	public static boolean binary(int num){
		//returns true only if the number can be represented as a binary number
		String newNum= ""+num;
		for (int r=0; r<newNum.length(); r++){
			String d=newNum.substring(r, r+1);
			if ("01".indexOf(d)==-1){
			return false;	
			}
			}
		return true;
	}

}
/* Put your isPalindrome(), isSelfDivisor(), isPalindromic(), and isPrime() methods
 * here and then refactor them so they no longer have the word is in them.
 * i.e. palindrome(), selfDivisor(), etc...
 */


