package spoj;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ADFRUITS {

	public static void main(String[] args) {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String[] lineSplit;
	    try{
		String k;
		    while((k=in.readLine())!=null)
		    {
		    	if (k.equals("")) {
					break;
				}
		    	lineSplit=k.split(" ");
		    	System.out.println(findLongestCommonSubsequence(lineSplit[0], lineSplit[1]));
		    }
		    
	    }
	    catch(Exception ex)
	    {
		    
	    }
		
//		Scanner s = new Scanner(System.in);
//		String[] lineSplit;
//		while (s.hasNextLine()) {
//			String string=s.nextLine();
//			if (string.equals("")) {
//				break;
//			}
//			lineSplit=string.split(" ");
//			System.out.println(findLongestCommonSubsequence(lineSplit[0], lineSplit[1]));
//		}
		
		
	/*	String fruit1 = "pear";
		String fruit2 = "peach";
		System.out.println("Result-"+findLongestCommonSubsequence(fruit1, fruit2));
		;*/
	}

	private static String findLongestCommonSubsequence(String fruit1, String fruit2) {
		
		
		int[][] solution = new int[fruit1.length()+1][fruit2.length()+1];
		
		for (int i = 1; i <= fruit1.length(); i++) {

			for (int j = 1; j<= fruit2.length(); j++) {

				if (fruit1.charAt(i-1) == fruit2.charAt(j-1)) {

						solution[i][j] = 1 + solution[i - 1][j - 1];

				}
				else{
					
					solution[i][j] = Math.max(solution[i][j-1], solution[i-1][j]);
					
				}

			}

		}
		
		
		
		int N=fruit1.length();
		int O=fruit2.length();
		int length=solution[N][O];
		 char[] result=new char[length];
		
		while (solution[N][O]!=0) {
			
			if (fruit1.charAt(N-1)==fruit2.charAt(O-1)) {
				result[length-1]=fruit2.charAt(O-1);
				N--;
				O--;
				length--;
			}else{
				if (solution[N][O-1]>solution[N-1][O]) {
					O--;
				}else{
					N--;
				}
				
				
				
			}
			
			
			
			
			
		}
		
		String commonString=new String(result);
		
		
		String finalR=null;
		if (fruit1.substring(0, commonString.length()).equalsIgnoreCase(commonString)) {
			 finalR=fruit2+fruit1.substring(commonString.length(), fruit1.length());
			 return finalR;
		}
		
		if (fruit2.substring(0, commonString.length()).equalsIgnoreCase(commonString)) {
			 finalR=fruit1+fruit2.substring(commonString.length(), fruit1.length());
			 return finalR;
		}
		
		
		
		return finalR;
	}

}
