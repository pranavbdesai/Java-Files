class nextdate
{
	public static void main(String ar[])
	{
		int dd=24,mm=01,yyyy=90;
		if(dd<=31 || mm<=12)
		{
			if(mm==4|| mm==6||mm==9||mm==11)
			{
				if(dd==30)
				{
					dd=1;
					mm=mm+1;
					System.out.println("next date is"+dd+" "+mm+" "+yyyy);
				}
				else if(dd<30)
				{
					dd=dd+1;
					System.out.println("next date is"+dd+" "+mm+" "+yyyy);
				}
				else
				{
					System.out.println( "date"+" "+dd+" "+"does not exist");
				}
			}
			else if(mm==1||mm==3||mm==5||mm==7||mm==8||mm==10||mm==12)
			{
				if(mm==12)
				{
					if(dd==31)
					{
						dd=1;
						mm=mm+1;
						yyyy=yyyy+1;
						System.out.println("next date is"+dd+" "+mm+" "+yyyy);
					}
					else if(dd<31)
					{
						dd=dd+1;
						System.out.println("next date is"+dd+" "+mm+" "+yyyy);
					}
					else
					{
						System.out.println( "month"+" "+mm+" "+"does not exist");	
					}
				}
				else
				{
					if(dd==31)
					{
						dd=1;
						mm=mm+1;
						System.out.println("next date is"+dd+" "+mm+" "+yyyy);
					}
					else if(dd<31)
					{
						dd=dd+1;
						System.out.println("next date is"+dd+" "+mm+" "+yyyy);	
					}
					else
					{
						System.out.println( "month"+" "+mm+" "+"does not exist");	
					}
				}

			}
			else
			{
				if(yyyy%4==0)
				{
					if(dd<29)
					{
						dd=dd+1;
						System.out.println("next date is"+dd+" "+mm+" "+yyyy);
					}
					else if(dd==29)
					{
						dd=1;
						mm=mm+1;	
						System.out.println("next date is"+dd+" "+mm+" "+yyyy);
					}
					else
					{
						System.out.println( "invalid date");
					}		
				}
				else
				{
					if(dd<28)
					{
						dd=dd+1;
					}
					if(dd==28)
					{
						dd=1;
						mm=mm+1;	
					}	
				}
			System.out.println("next date is"+dd+" "+mm+" "+yyyy);	
			}			
		}
		else
		{
			System.out.println("date is not in valid form");	
		}
		
	}
}