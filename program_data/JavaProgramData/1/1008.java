package <missing>;

public class GlobalMembers
{
	/*
	?? - 1090 ????   
	 
	?? 
	???????a?????????????????a = a1 * a2 * a3 * ... * an???1 < a1 <= a2 <= a3 <= ... <= an?????????????????
	a = a???????
	 
	???? 
	?1?????????n?????n???????????1?????????a (1 < a < 32768)
	 
	???? 
	n???????????????????????????????????
	 
	???? 
	2
	2
	20
	 
	???? 
	1
	4
	*/ 

	public static void Main()
	{
		int st = new int(int a,int b); //????st?????????a?=a1?b???????
		int j;
		int n;
		int m;
		int sum;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (j = 1;j <= n;j++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			sum = st(2, m);
			System.out.printf("%d\n",sum);
		}
	}

	public static int st(int a,int b)
	{
		int i;
		int c;
		c = 0;
		if (a == 0)
		{
			c = c + 1;
		}
		else
		{
			for (i = a;i <= Math.sqrt(b);i++)
			{
				if (b % i == 0)
				{
					c = st(i, (b / i)) + c;
				}
			}
			if (i > Math.sqrt(b))
			{
				c = c + 1;
			}
		}
		return c;
	}
}

