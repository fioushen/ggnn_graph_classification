package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k; //start[i]????i????????????????????????i??
		int[] height = new int[25];
		int[] start = new int[25];
		int max = 0;
		int h;
		int i;
		int j;
		int q;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (h = 0;h < k;h++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				height[h] = Integer.parseInt(tempVar2);
			}
			start[h] = 1; //????1???start[i]???1,???i????
		}
		for (i = k - 2;i >= 0;i--)
		{ //??????start[i]?start[k-1]???1???????????????????????
			for (j = i + 1;j < k;j++)
			{ //??????????????????
				if (height[j] <= height[i] != 0 && start[j] + 1> start[i])
				{ //?????start[j]+1>start[i]???start[j]??????i????�?????�?????start[i]
					start[i] = start[j] + 1; //start[i\j]??1?????????????????????start[i]
				}
			}
		}
		for (q = 1;q < k;q++)
		{
			if (start[q] > start[max])
			{ //??????????????????????
				max = q;
			}
		}
		System.out.printf("%d",start[max]);
		return 0;
	}
}

