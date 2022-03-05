import java.io.*;
public class Palindromic_Number
{
	public static void main(String[] args) throws IOException
	{
		InputStreamReader read=new InputStreamReader(System.in);
		BufferedReader in=new BufferedReader(read);
		int n, num, r=0;
		System.out.println("Enter the number to be checked");
		n=Integer.parseInt(in.readLine());
		num=n;
		while(num>0)
		{
			r=(r*10)+(num%10);
			num=num/10;
		}
		if(r==n)
		System.out.println(n+" is a palindrome number");
		else
		System.out.println(n+" is not a palindrome number");
	}
}
