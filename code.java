//code to find a string match
import java.util.Scanner;
public class TestClass { 

	public static void search(String tx, String pa) 
	{ 
		int m = pat.length(); 
		int n = txt.length(); 

		
		for (int i = 0; i <= n - m; i++) { 

			int j; 

			for (j = 0; j < m; j++) 
				if (tx.charAt(i + j) != pa.charAt(j)) 
					break; 

			if (j == M)
				System.out.println("Pattern starts at posn " + (i+1)); 
		} 
	} 

	public static void main(String[] args) 
	{ 	Scanner sc=new Scanner(System.in);
		String tx=sc.nextLine() ;
     System.out.println("Text: "+tx);
		String pat=sc.nextLine() ; 
     System.out.println("Pattern: "+pa);
		search(tx, pa); 
	} 
} 

