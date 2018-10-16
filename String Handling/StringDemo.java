class StringDemo
{
	public static void main(String ar[])
	{
		String Msg="CDAc Computer Center";
		System.out.println("Length : " + Msg.length());
		System.out.println("Upper case : " + Msg.toUpperCase());
		System.out.println("Lower case : " + Msg.toLowerCase());
		System.out.println("Char At : " + Msg.charAt(3));
		System.out.println("Index Of : " + Msg.indexOf('m'));
		System.out.println("Concat " + Msg.concat(" Shah Mukesh"));
		System.out.println(" Msg "+ Msg);
		System.out.println("Ends With " + Msg.endsWith("ter"));
		System.out.println("Starts With " + Msg.startsWith("DA"));
		byte buf[] = Msg.getBytes();
		System.out.println("Byte " + buf);
		System.out.println("Ends With " + Msg.replace('m','X'));

		StringBuffer Str=new StringBuffer("James Macwan");
		System.out.println("Str " + Str);
		Str.append('C');
		System.out.println("Str " + Str);
		Str.append(2343);
		System.out.println("Str " + Str);
		System.out.println("Char At " + Str.charAt(10));
		Str.delete(12,Str.length());
		System.out.println("Str " + Str);
		Str.insert(5, "CDAC ");
		System.out.println("Str " + Str);
		Str.reverse();
		System.out.println("Str " + Str);

		
	}
}