public class AssertionTest {
	static {
		boolean assertsEnabled = false;
		assert assertsEnabled = false; // Intentional side effect!!!
		if (!assertsEnabled)
			throw new RuntimeException("Asserts must be enabled!!!");
	}
	public static void main(String[] args) throws IllegalAccessException, InstantiationException {		
		int score=0;
		int[] testInts={-5,-1,0,1,101,1010101,776535677, -7655};
		for (int testInt:testInts) {
			try {
				int mrBResult=mrBLib.Change.decimalToBinary(testInt);
				int result=lib.Change.decimalToBinary(testInt);
				String method="Change.decimalToBinary("+testInt+")=";
				assert mrBResult==result : "mrBLib."+method+mrBResult+"\nlib."+method+result+"\n";
				score++;
			} catch (AssertionError e) {
				System.out.println(e.getMessage());				
			}	
			try {
				int mrBResult=mrBLib.Change.binaryToDecimal(testInt);
				int result=lib.Change.binaryToDecimal(testInt);
				String method="Change.binaryToDecimal("+testInt+")=";
				assert mrBResult==result : "mrBLib."+method+mrBResult+"\nlib."+method+result+"\n";
				score++;
			} catch (AssertionError e) {
				System.out.println(e.getMessage());				
			}	
			try {
				boolean mrBResult=mrBLib.Is.even(testInt);
				boolean result=lib.Is.even(testInt);
				String method="Change.Is.even("+testInt+")=";
				assert mrBResult==result : "mrBLib."+method+mrBResult+"\nlib."+method+result+"\n";
				score++;
			} catch (AssertionError e) {
				System.out.println(e.getMessage());				
			}	
			try {
				boolean mrBResult=mrBLib.Is.odd(testInt);
				boolean result=lib.Is.odd(testInt);
				String method="Change.Is.odd("+testInt+")=";
				assert mrBResult==result : "mrBLib."+method+mrBResult+"\nlib."+method+result+"\n";
				score++;
			} catch (AssertionError e) {
				System.out.println(e.getMessage());				
			}	
			try {
				boolean mrBResult=mrBLib.Is.palindrome(testInt);
				boolean result=lib.Is.palindrome(testInt);
				String method="Change.Is.palindrome("+testInt+")=";
				assert mrBResult==result : "mrBLib."+method+mrBResult+"\nlib."+method+result+"\n";
				score++;
			} catch (AssertionError e) {
				System.out.println(e.getMessage());				
			}	
			try {
				boolean mrBResult=mrBLib.Is.prime(testInt);
				boolean result=lib.Is.prime(testInt);
				String method="Change.Is.prime("+testInt+")=";
				assert mrBResult==result : "mrBLib."+method+mrBResult+"\nlib."+method+result+"\n";
				score++;
			} catch (AssertionError e) {
				System.out.println(e.getMessage());				
			}	
			try {
				boolean mrBResult=mrBLib.Is.selfDivisor(testInt);
				boolean result=lib.Is.selfDivisor(testInt);
				String method="Change.Is.selfDivisor("+testInt+")=";
				assert mrBResult==result : "mrBLib."+method+mrBResult+"\nlib."+method+result+"\n";
				score++;
			} catch (AssertionError e) {
				System.out.println(e.getMessage());				
			}	
			try {
				boolean mrBResult=mrBLib.Is.binary(testInt);
				boolean result=lib.Is.binary(testInt);
				String method="Change.Is.binary("+testInt+")=";
				assert mrBResult==result : "mrBLib."+method+mrBResult+"\nlib."+method+result+"\n";
				score++;
			} catch (AssertionError e) {
				System.out.println(e.getMessage());				
			}	
			try {
				int mrBResult=mrBLib.Nums.nextPrime(testInt);
				int result=lib.Nums.nextPrime(testInt);
				String method="Change.Nums.nextPrime("+testInt+")=";
				assert mrBResult==result : "mrBLib."+method+mrBResult+"\nlib."+method+result+"\n";
				score++;
			} catch (AssertionError e) {
				System.out.println(e.getMessage());				
			}	
			try {
				int result=lib.Nums.randomNumber(0,testInt);
				String method="Change.Nums.randomNumber(0,"+testInt+")=";
				assert result >=Math.min(0, testInt) && result <=Math.max(0, testInt) : "lib."+method+result+"\n";
				score++;
			} catch (AssertionError e) {
				System.out.println(e.getMessage());				
			}	
		}
		double testDouble=43210.123456;
		for (int place=6; place>=-6; place--) {
			try {
				double mrBResult=mrBLib.Nums.round(testDouble,place);
				double result=lib.Nums.round(testDouble,place);
				String method="Nums.round("+testDouble+","+place+")=";
				assert mrBResult==result : "mrBLib."+method+mrBResult+"\nlib."+method+result+"\n";
				score++;
			} catch (AssertionError e) {
				System.out.println(e.getMessage());				
			}	
		}
		String[] testStrings={"776535677","-11","0","42","4.2","Madam, I'm Adam.",""};
		for (String testString:testStrings) {
			try {
				int mrBResult=mrBLib.Change.stringToInt(testString, -1);
				int result=lib.Change.StringToInt(testString, -1);
				String method="Change.StringToInt("+testString+", -1)=";
				assert mrBResult==result : "mrBLib."+method+mrBResult+"\nlib."+method+result+"\n";
				score++;
			} catch (AssertionError e) {
				System.out.println(e.getMessage());				
			}	
			try {
				String mrBResult=mrBLib.Change.lowerCase(testString);
				String result=lib.Change.lowerCase(testString);
				String method="Change.lowerCase("+testString+")=";
				assert mrBResult.equals(result) : "mrBLib."+method+mrBResult+"\nlib."+method+result+"\n";
				score++;
			} catch (AssertionError e) {
				System.out.println(e.getMessage());				
			}	
			try {
				String mrBResult=mrBLib.Change.upperCase(testString);
				String result=lib.Change.upperCase(testString);
				String method="Change.upperCase("+testString+")=";
				assert mrBResult.equals(result) : "mrBLib."+method+mrBResult+"\nlib."+method+result+"\n";
				score++;
			} catch (AssertionError e) {
				System.out.println(e.getMessage());				
			}	
			try {
				String mrBResult=mrBLib.Change.removeAnything(testString,"17.,'");
				String result=lib.Change.removeAnything(testString,"17.,'");
				String method="Change.removeAnything("+testString+",\"17.,'\")=";
				assert mrBResult.equals(result) : "mrBLib."+method+mrBResult+"\nlib."+method+result+"\n";
				score++;
			} catch (AssertionError e) {
				System.out.println(e.getMessage());				
			}	
			try {
				int mrBResult=mrBLib.Count.anything(testString,"17.,'");
				int result=lib.Count.anything(testString,"17.,'");
				String method="Change.removeAnything("+testString+",\"17.,'\")=";
				assert mrBResult==result : "mrBLib."+method+mrBResult+"\nlib."+method+result+"\n";
				score++;
			} catch (AssertionError e) {
				System.out.println(e.getMessage());				
			}	
			try {
				int mrBResult=mrBLib.Count.vowels(testString);
				int result=lib.Count.vowels(testString);
				String method="Change.vowels("+testString+")=";
				assert mrBResult==result : "mrBLib."+method+mrBResult+"\nlib."+method+result+"\n";
				score++;
			} catch (AssertionError e) {
				System.out.println(e.getMessage());				
			}	
			try {
				boolean mrBResult=mrBLib.Is.anInteger(testString);
				boolean result=lib.Is.anInteger(testString);
				String method="Is.anInteger("+testString+")=";
				assert mrBResult==result : "mrBLib."+method+mrBResult+"\nlib."+method+result+"\n";
				score++;
			} catch (AssertionError e) {
				System.out.println(e.getMessage());				
			}	
			try {
				boolean mrBResult=mrBLib.Is.palindrome(testString);
				boolean result=lib.Is.palindrome(testString);
				String method="Is.palindrome("+testString+")=";
				assert mrBResult==result : "mrBLib."+method+mrBResult+"\nlib."+method+result+"\n";
				score++;
			} catch (AssertionError e) {
				System.out.println(e.getMessage());				
			}	
		}
		System.out.println("Final Score: "+score);
	}
}
