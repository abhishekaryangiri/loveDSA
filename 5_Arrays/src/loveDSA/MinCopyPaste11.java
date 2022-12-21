
/*
 Min copy Paste oper. :
 1. copy all printed char.
 2. paste paste all char. which are already copied
 */
package loveDSA;

public class MinCopyPaste11 {
	public int find (int num)
	{
		int res = 0;
		for( int i=2; i<=num; i++)
		{
			while( num%i == 0)
			{
				res += i;
				num = num/i;
			}
		}
		return res;
	}
public static void main(String[] args) {
	MinCopyPaste11 op = new MinCopyPaste11();
	int n = 40;
	System.out.println("min o/p:  " + op.find(n));
}
}
