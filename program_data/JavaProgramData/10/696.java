package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int k;
		int[] i = new int[26];
		int[] a = new int[26];
		int[] b = new int[26];
		int x = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i[0] = 0;i[0] < 25;i[0]++)
		{
			b[i[0]] = 0;
		}
		for (i[0] = 0;i[0] < k;i[0]++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i[0]] = Integer.parseInt(tempVar2);
			}
		}
		for (i[0] = 0;i[0] < k;i[0]++)
		{
			b[0] = a[i[0]];
			for (i[1] = i[0] + 1;i[1] <= k;i[1]++)
			{
			if ((b[1] = a[i[1]]) <= b[0])
			{
				for (i[2] = i[1] + 1;i[2] <= k;i[2]++)
				{
				if ((b[2] = a[i[2]]) <= b[1])
				{
				for (i[3] = i[2] + 1;i[3] <= k;i[3]++)
				{
				if ((b[3] = a[i[3]]) <= b[2])
				{
				for (i[4] = i[3] + 1;i[4] <= k;i[4]++)
				{
				if ((b[4] = a[i[4]]) <= b[3])
				{
				for (i[5] = i[4] + 1;i[5] <= k;i[5]++)
				{
				if ((b[5] = a[i[5]]) <= b[4])
				{
				for (i[6] = i[5] + 1;i[6] <= k;i[6]++)
				{
				if ((b[6] = a[i[6]]) <= b[5])
				{
				for (i[7] = i[6] + 1;i[7] <= k;i[7]++)
				{
				if ((b[7] = a[i[7]]) <= b[6])
				{
				for (i[8] = i[7] + 1;i[8] <= k;i[8]++)
				{
				if ((b[8] = a[i[8]]) <= b[7])
				{
				for (i[9] = i[8] + 1;i[9] <= k;i[9]++)
				{
				if ((b[9] = a[i[9]]) <= b[8])
				{
				for (i[10] = i[9] + 1;i[10] <= k;i[10]++)
				{
				if ((b[10] = a[i[10]]) <= b[9])
				{
				for (i[11] = i[10] + 1;i[11] <= k;i[11]++)
				{
				if ((b[11] = a[i[11]]) <= b[10])
				{
				for (i[12] = i[11] + 1;i[12] <= k;i[12]++)
				{
				if ((b[12] = a[i[12]]) <= b[11])
				{
				for (i[13] = i[12] + 1;i[13] <= k;i[13]++)
				{
				if ((b[13] = a[i[13]]) <= b[12])
				{
				for (i[14] = i[13] + 1;i[14] <= k;i[14]++)
				{
				if ((b[14] = a[i[14]]) <= b[13])
				{
				for (i[15] = i[14] + 1;i[15] <= k;i[15]++)
				{
				if ((b[15] = a[i[15]]) <= b[14])
				{
				for (i[16] = i[15] + 1;i[16] <= k;i[16]++)
				{
				if ((b[16] = a[i[16]]) <= b[15])
				{
				for (i[17] = i[16] + 1;i[17] <= k;i[17]++)
				{
				if ((b[17] = a[i[17]]) <= b[16])
				{
				for (i[18] = i[17] + 1;i[18] <= k;i[18]++)
				{
				if ((b[18] = a[i[18]]) <= b[17])
				{
				for (i[19] = i[18] + 1;i[19] <= k;i[19]++)
				{
				if ((b[19] = a[i[19]]) <= b[18])
				{
				for (i[20] = i[19] + 1;i[20] <= k;i[20]++)
				{
				if ((b[20] = a[i[20]]) <= b[19])
				{
				for (i[21] = i[20] + 1;i[21] <= k;i[21]++)
				{
				if ((b[21] = a[i[21]]) <= b[20])
				{
				for (i[22] = i[21] + 1;i[22] <= k;i[22]++)
				{
				if ((b[22] = a[i[22]]) <= b[21])
				{
				for (i[23] = i[22] + 1;i[23] <= k;i[23]++)
				{
				if ((b[23] = a[i[23]]) <= b[22])
				{
				for (i[24] = i[23] + 1;i[24] <= k;i[24]++)
				{
				if ((b[24] = a[i[24]]) <= b[23])
				{
				for (i[25] = i[24] + 1;i[25] <= k;i[25]++)
				{
				if ((b[25] = a[i[25]]) <= b[24])
				{
					;
				}
				}
				}
				}
				}
				}
				}
				}
				}
				}
				}
				}
				}
				}
				}
				}
				}
				}
				}
				}
				}
				}
				}
				}
				}
				}
				}
				}
				}
				}
				}
				}
				}
				}
				}
				}
				}
				}
				}
				}
				}
				}
				}
				}
				}
				}
				}
				}
			}
			}
		}
		for (i[0] = 0;i[0] < 25;i[0]++)
		{
			if (b[i[0]] == 0)
			{
			System.out.printf("%d",i[0] - 1);
			break;
			}
		}
	}

}

