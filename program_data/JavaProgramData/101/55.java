package <missing>;

public class GlobalMembers
{
	/**
	* @file 1000010424_4.cpp
	* @author ???
	* @date 2010?11?17
	* @description
	* ??????:???
	*/



	public static int Main()
	{
		int[] rice = new int[3]; //???-1?0?1??????; 1???
		char[] name = {'A', 'B', 'C'}; //????????
		int[] right = new int[3]; //???????right[i]+rice[i]==1?
		int i;

		for (rice[0] = -1; rice[0] <= 1; rice[0]++)
		{
			for (rice[1] = -1; rice[1] <= 1; rice[1]++)
			{
				if (rice[1] != rice[0])
				{
					for (rice[2] = -1; rice[2] <= 1; rice[2]++)
					{
						if (rice[2] != rice[1] && rice[2] != rice[0])
						{
							right[0] = (rice[1] > rice[0]) + (rice[2] == rice[0]);
							right[1] = (rice[0] > rice[1]) + (rice[0] > rice[2]);
							right[2] = (rice[2] > rice[1]) + (rice[1] > rice[0]);

							if ((rice[0] + right[0]) == 1 && (rice[1] + right[1]) == 1 && (rice[2] + right[2]) == 1)
							{
								for (i = 0; rice[i] != -1; i++)
								{
									;
								}
								System.out.print(name[i]);

								for (i = 0; rice[i] != 0; i++)
								{
									;
								}
								System.out.print(name[i]);

								for (i = 0; rice[i] != 1; i++)
								{
									;
								}
								System.out.print(name[i]);

								System.out.print("\n");
							}
						}
					}
				}
			}
		}

		return 0;
	}
}
