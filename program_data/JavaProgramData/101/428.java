package <missing>;

public class GlobalMembers
{
	public static int MAX(int a, int b, int c)
	{
		int t = 0;
		if (a > b)
		{
			t = a;
		}
		if (c > t)
		{
			t = c;
		}
		return t;
	}

	public static int MIN(int a, int b, int c)
	{
		int t = 0;
		if (a < b)
		{
			t = a;
		}
		if (c < t)
		{
			t = c;
		}
		return t;
	}

	public static int Main()
	{
		int A;
		int B;
		int C;
		int a;
		int b;
		int c;
		int e;
		int f;
		int g;
		char first;
		char second;
		char third;
		for (A = 1; A <= 3; A++)
		{
			for (B = 1; B < 4; B++)
			{
				for (C = 1; C < 4; C++)
				{
					a = (B > A) + (C == A);
					b = (A > B) + (A > C);
					c = (C > B) + (B > A);
					if (((A > B && a < b) || (A < B && a> b)) + ((A> C && a < c) || (A < C && a> c)) + ((B> C && b < c) || (B < C && b> c)) == 3)
					{
						e = MAX(a, b, c);
						g = MIN(a, b, c);
						f = a + b + c - e - g;
					}
				}
			}
		}
		first = 65 + e;
		second = 65 + f;
		third = 65 + g;
		System.out.print(first);
		System.out.print(second);
		System.out.print(third);
		System.out.print("\n");
		return 0;
	}
}
