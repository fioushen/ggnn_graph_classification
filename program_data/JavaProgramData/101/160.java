package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int A;
		 int B;
		 int C;
		 String rank = new String(new char[4]);
		 for (A = 1;A <= 3;A++)
		 {
		   for (B = 1;B <= 3;B++)
		   {
				 if (A == B)
				 {
					 continue;
				 }
			  else
			  {
					C = 6 - A - B; //??ABC????
				 if ((B == 1) && (A > B) && (A > C) && ((C == 2) && ((C > B) + (B > A) == 1) && (A > B) || (A == 2) && (B > A) && ((C > B) + (B > A) == 0)))
				 {
								//?B????C????????? 
							 rank = tangible.StringFunctions.changeCharacter(rank, A, 'A'); //???????
						  rank = tangible.StringFunctions.changeCharacter(rank, B, 'B');
						  rank = tangible.StringFunctions.changeCharacter(rank, C, 'C');
						  System.out.print(rank.charAt(1));
						  System.out.print(rank.charAt(2));
						  System.out.print(rank.charAt(3));
				 }
							  //?????ABC???? 
				   if ((C == 1) && (C > B) && (B > A) && ((B == 2) && ((A > B) + (A > C) == 1) && ((A > B) + (B > A) == 0) || (A == 2) && (B > A) && ((A > B) + (A > C) == 0)))
				   {
								   rank = tangible.StringFunctions.changeCharacter(rank, A, 'A');
								rank = tangible.StringFunctions.changeCharacter(rank, B, 'B');
								rank = tangible.StringFunctions.changeCharacter(rank, C, 'C');
								System.out.print(rank.charAt(1));
								System.out.print(rank.charAt(2));
								System.out.print(rank.charAt(3));
				   }
			  }
		   }
		 }
		 return 0;
	}

}

