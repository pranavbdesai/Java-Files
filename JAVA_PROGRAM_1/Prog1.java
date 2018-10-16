class Stack
   { 
    int Size;        
    double Array[];
    int top=-1;            
   Stack(int s)         
      { 
      Size = s; 
      Array = new double[Size];                           
      }
  synchronized void push(double j) 
   {
      if(top==14) 
          {
           System.out.println("overflow");
           notify();
          }
      Array[++top] = j;       
   }
   synchronized double pop()         
      { 
          if(top<0)
               {
                System.out.println("underflow");
                notify();
               }
         return Array[top--];  
      } 
    boolean isFull()     
      { 
      return (top == Size-1);  
      } 
    boolean isEmpty()    
      { 
       return (top==-1);  
      }
   }  
class StackInsert implements Runnable
{
       Stack q;
       StackInsert(Stack q)
          {
            this.q=q;
            new Thread(this,"StackInsert").start();
          }
        public void run()
         {
           for(int i=0;i<15;i++)
               {
               q.push(i);               
               }   
         }
}
class StackDelete implements Runnable
{
           Stack q;
           StackDelete(Stack q)
            {
              this.q=q;
              new Thread(this,"StackDelete").start();
            }
           public void run()
           {
               while(q.isEmpty()==false)    
                    {                      
                     System.out.println("ELEMENT:"+q.pop());    
                    }   
            }  
}
class Prog1 
{
           public static void main(String s[])
            {
              Stack q=new Stack(15);
              new StackInsert(q);
              new StackDelete(q);
             }
}
 
 