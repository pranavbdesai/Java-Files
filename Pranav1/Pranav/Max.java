class Max
 {
 public static void main(String []ar)
  { 
    int a=10,b=450,c=89,d=96;
    if(a>b && a>c && a>d)
    { 
     System.out.println(a+ "is max");
    }
    else if(b>c && b>d )
    { 
     System.out.println(b+ "is max");
    }
    else if (c>d)
    { 
     System.out.println(c+ "is max");
    }
    else 
    { 
     System.out.println(d+ "is max");
    }
 }
}