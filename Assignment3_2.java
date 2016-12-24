import java.util.Scanner;

/*Write a Java statement to assign the value true to the boolean variable same ,
when the String variable S1 has the same contents as the String variable S2 ,
and false otherwise*/

public class Assignment3_2 {

	public static void main(String args[])
	{
		boolean same;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter string 1: ");
		String s1= sc.next();
		System.out.println("Enter string 2: ");
		String s2= sc.next();
		same=s1.equals(s2);
		System.out.println(same);
		
	}
}
