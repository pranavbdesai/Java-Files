class Box
{
	public static void main(String ar[])
	{	
		double width=Double.parseDouble(ar[0]);
		double length=Double.parseDouble(ar[1]);
		double depth=Double.parseDouble(ar[2]);

		double volume,area;
		volume=width*length*depth;
		area=width*length;
		System.out.println("\nWidth :"+width+"\nLength :"+length+"\nDepth :"+depth+"\nVolume Of Box :"+volume+"\nArea :"+area);		
	}	
}