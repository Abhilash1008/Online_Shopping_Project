 
   public class MaxTest
{
     MaxTest(int x , int y)
{

   if(x>y)
{
   System.out.println("Max=x" +x);
}
   else

   System.out.println("Max=y" +y);
}

    MaxTest(int a ,int b , int c)
{
   if(a>b && a>c)
{
   System.out.println("Max=a" +a);
}
   else if(b>c && b>a)
{
   System.out.println("Max=b" +b);
}
   else

   System.out.println("Max=c" +c);
}
}