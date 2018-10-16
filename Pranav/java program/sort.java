class sort
{
	public static void main(String ar[])
	{
		int count=0;
		
		int a [] = new int[ar.length];
		System.out.println("the length is"+ar.length);
		for(int i=0;i<a.length;i++)
		{
			a[i] = Integer.parseInt(ar[i]);
				
			System.out.println("\n\t  "+(i+1) +"\t"+ a[i]);
		}
		System.out.println("the length is"+a.length);

			for(int i=0;i<a.length;i++)
			{
				for(int j=0;j<a.length-1;j++)
				{
					if(a[j]>a[j+1])
					{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					}
				}
			}
				for(int i=0;i<ar.length;i++)
				{
				System.out.println("\n\t  "+(i+1) +"\t"+ a[i]);
				}
		
					for(int i=0;i<ar.length-1;i++)
					{
						if(a[i]==a[i+1])
						{
						count++;
						}
			System.out.println("the element"+a[i]+" is repeated::"+count+"\t\t"+"times");
}

			
		
	}

}	
				
	