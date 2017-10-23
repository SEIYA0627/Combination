package combination;

public class Combination_lib {
	public int getFactorial(int n) {
		int f=1,i; 
		for (i=1;i<=n;i++) {
			f=f*i;
		}		
		return f;
	}
		
	
}
