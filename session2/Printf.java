package session2;

public class Printf
{
	public static void main(String[] args)
	{
		int x = 10;
		int y = 12345678;
		System.out.printf("%-5d + %10d = %d%n",x,y,(x+y));

		float val =2.8f;
		System.out.printf("Vlera e val = %.2f%n", val);

		char ch = 'a';
		System.out.printf("Vlera e ch = %C%n",ch);

		boolean ok = true;
		System.out.printf("Eshte OK: %B%n",ok);

		System.out.printf("Emri im eshte %S%n","Fatos");
	}
}

/*
%d - numra te plote
%f - numra me presje dhjetore
%c ose %C - char
%b ose %B - boolean
%s ose %S - String
 */
