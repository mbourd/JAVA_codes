/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	    int[] ints = {-9,-1,2,5};
		System.out.println(Main.closest(ints));
	}
	
	public static int closest(int[] ints) {
	    int closestNegative = -9999999;
	    int closestPositive = 9999999;
	    
	    for (int i = 0; i < ints.length; i++) {
	        if (ints[i] < 0) {
	            if (i == 0) {
	                closestNegative = ints[i];
	            } else {
	                closestNegative = ints[i]>closestNegative? ints[i] : closestNegative;
	            }
	        } else {
	            if (i == 0) {
	                closestPositive = ints[i];
	            } else {
	                closestPositive = ints[i]<closestPositive? ints[i] : closestPositive;
	            }
	        }
	    }
	    
	    if (Math.abs(closestNegative) < closestPositive) {
	        return closestNegative;
	    }
	    return closestPositive;
	}
}
