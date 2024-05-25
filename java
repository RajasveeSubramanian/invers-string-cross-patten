import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int n=s.length();
		int c=n-1;

		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==j){
					if(i+j==n-1) {
						c--;
					}
					System.out.print(s.charAt(i));
				}
				else if(i+j==n-1 && i!=j ) {
                	System.out.print(s.charAt(c--));
				}
				else {
					System.out.print(" ");
				}
				
				
		}
			System.out.println();
		
 	}
		

	}
}
