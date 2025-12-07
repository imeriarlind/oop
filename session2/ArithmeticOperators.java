package session2;

public class ArithmeticOperators
{
	public static void main(String[] args)
	{
		int x = 5;
		int y = 2;
		System.out.println(x+" + "+y+" = "+(x+y));
		System.out.println(x+" - "+y+" = "+(x-y));
		System.out.println(x+" * "+y+" = "+(x*y));
		System.out.println(x+" / "+y+" = "+(x/y));
		System.out.println(x+" % "+y+" = "+(x%y));
		System.out.println("-----------------------------");
		System.out.printf("%d + %d = %d%n",x,y,(x+y));
		System.out.printf("%d - %d = %d%n",x,y,(x-y));
		System.out.printf("%d * %d = %d%n",x,y,(x*y));
		System.out.printf("%d / %d = %d%n",x,y,(x/y));
		System.out.printf("%d %% %d = %d%n",x,y,(x%y));
	}
}