class date
{
public static void main(String ar[])
{
int d=10;
int m=10;
int y=2012;
System.out.println("enter the date:" + d +"\t"+m +"\t"+y+"\t" );
	if(m%2==0 && d==30 && m!=12)
	{
		d=31;
		m++;
	}

		else if(m==2 && y%4==0 && d==28)
			{
				d++;
			}
			else if(d==31 && m==12)
				{
					d=1;
					m=1;
					y++;
				}
		else
		{
			d++;
		}



System.out.println("the next date is:"+ d +"\t"+m +"\t"+y+"\t" );
}
}