package <missing>;

public class GlobalMembers
{
	/*
	 * ???? .cpp
	 *
	 *  Created on: 2012-11-27
	 *      Author:??
	 *      ???????a?????????????????a = a1 * a2 * a3 * ... * an?
	 *      ??1 < a1 <= a2 <= a3 <= ... <= an?????????????????a = a???????
	 */

	public static int answer = 0; //???????
	public static void f(int n, int N)
	{
		if (n < N)
		{
			N = n; //????????????
		}
		if (N == 1)
		{
			answer++; //??????
			return;
		}
		while (N > 1)
		{
			if (n % N == 0)
			{
				f(n / N, N); //?????,?????
			}
			N--; //??????
		}
	}

	public static int Main()
	{
		int n;
		int a;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0 ; i < n ; i++)
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			f(a, a); //????
			System.out.print(answer);
			System.out.print("\n");
			answer = 0; //????
		}
		return 0;
	}

}

