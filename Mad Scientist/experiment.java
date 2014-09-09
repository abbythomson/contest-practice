import java.io.*;  
import java.text.*;
import java.util.*;
 public class experiment {

	public static void main(String[] args) throws FileNotFoundException{
		Scanner input = new Scanner(new File("madscientist.in"));
		int numK = input.nextInt();
		while(numK!=0){
			int[] resultsArray=new int[numK];
			int[] exResults=new int[26];
			for(int i=0;i<numK;i++){
				resultsArray[i]=input.nextInt();
				}
			for (int i=0; i < resultsArray[0]; i++)
			{
				System.out.print("1 ");
			}
			for(int j=1;j<numK;j++){
				int tester=resultsArray[j]-resultsArray[j-1];
				if(tester==0)
					continue;
				for(int y=0;y<tester;y++){
					System.out.print(j+1);
					System.out.print(" ");				
				}
			}
			System.out.println("a");
			numK=input.nextInt();	
		}
		
	}
}
