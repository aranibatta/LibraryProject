package lib;

public class Change {
	public static int StringToInt(String s, int defaultValue) {
		//returns the int value of the parameter String if it can be represented as a
		//JAVA int, otherwise it returns the value of the second parameter.
		boolean negative=false;
		if (s.length()==0){
			return defaultValue;
		}
		if (s.substring(0,1).equals("-")){
			s= s.substring(1);
			negative=true;
		}
		if(Is.anInteger(s)){
			int num=0;
			for(int i=0; i<s.length(); i++){
				String l=s.substring(i, i+1);
				int digit=Constants.DIGITS.indexOf(l);
				num= num*10;
				num=num+digit;
			}
			if (negative){
				return -num;
			}
			return num;
		} 
		return defaultValue;
	}	
	public static String upperCase(String s) {
		//returns the parameter String with all lowercase letters changed to all
		//uppercase letters.
		String upper= " ";
		for (int i=0; i<s.length(); i++){
			String letter=s.substring(i, i+1);
			if (Constants.LOWER_CASE.indexOf(letter)!=-1){
				int indexLetter= Constants.LOWER_CASE.indexOf(letter);
				String upperLetter= Constants.UPPER_CASE.substring(indexLetter, indexLetter+1);
				upper=upper+upperLetter;
			} else {
				upper=upper+letter;
			}
		}
		return upper;

	}
	public static String lowerCase(String s){
		//returns the parameter String with all uppercase letters changed to all
		//lowercase letters.
		String lower= " ";
		for (int i=0; i<s.length(); i++){
			String letter=s.substring(i, i+1);
			if (Constants.UPPER_CASE.indexOf(letter)!= -1){
				int indexLetter=Constants.UPPER_CASE.indexOf(letter);
				String lowerLetter= Constants.UPPER_CASE.substring(indexLetter, indexLetter+1);
				lower=lower+lowerLetter;
			} else {
				lower=lower+letter;
			}
		}
		return lower;
	}
	public static String removeAnything(String s, String remove){
		//returns the first parameter String with any letters found 
		//in the second parameter removed.
		s="1a2b3c";
		remove="abc";
		String copy="";
		for(int i=0; i<s.length(); i++){
			String letter=s.substring(i, i+1);
			if (remove.indexOf(letter) ==1)
				copy=copy+letter;
		}
		return copy;
	}
	public static int decimalToBinary(int s){
		//Returns the parameter value converted from a decimal number to 
		//a binary number 
		String result="";
		if (s<=0){
			return 0;
		}
		for (int i = 2; s> 0; s/=2){
			result=result + s%2; 
		}
		String p1= "";
		for (int i=0; i<result.length(); i++){
			String l=result.substring(i, i+1);
			p1=p1+l;
		}
		
		return lib.Change.StringToInt(p1, -1);
	
	}
	public static int binaryToDecimal(int s){
		//Returns the parameter value from a binary number to a 
		//decimal number equivalent
		int multiplier= 1;	
		int result=0;
		while(s>0){
			int binaryDigit= s%10;
			result= result+ binaryDigit*multiplier;
			multiplier= multiplier*2; 
			s= s/10;
		} 
		return result;
	}
}
