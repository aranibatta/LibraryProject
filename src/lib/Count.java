package lib;

public class Count {
	public static int vowels(String s) {
		//Returns the number of vowels found in the parameter String
		int counter=0;
		String VOWELS= "AaEeIiOoUu";
		for (int i=0; i<s.length(); i++){
			String currentLetter= s.substring(i, i+1);
			for (int t=0; t<VOWELS.length(); t++){
				String currentVowel= VOWELS.substring(t, t+1);
				if (currentLetter.equals(currentVowel)){
				}
			}
		}
		return counter;
	}
	public static int anything(String s, String charactersToCount) {
		//Returns the number of times any character found in the second parameter
		//String is found in the first parameter String.
		int count=0;
		int l=s.length();
		for (int i=0; i<s.length(); i++){
			String letter=s.substring(i, i+l);
			if (charactersToCount.indexOf(letter)>-1){
				count++;
			}

		}
		return count;
	}
}
