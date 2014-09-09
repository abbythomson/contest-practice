import java.io.*; 
import java.text.*;
import java.util.*;
public class magnets {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws FileNotFoundException{
		Scanner input = new Scanner(new File("magnets.in"));
		String phrase=input.nextLine();
		while (!phrase.equals("END"))
		{
			String phraseNoWhitespace=phrase.replace(" ","");
			if (readPhrase(phraseNoWhitespace))
			{
				System.out.println(phrase);
			}
			phrase=input.nextLine();
		}
		
		
	}

	public static boolean readPhrase (String toCheck){
		char[] parts=toCheck.toCharArray();
		
		Arrays.sort(parts);
		int length=parts.length;
		for(int i=0;i<length-1;i++){
			if(parts[i]==parts[i+1]){
				return false;
			}
		}
		return true;
	}
		
	}

