   

  class MyCalculatorMain
{
   public static void main(String[] args)
{

   MyCalculator m1=new  MyCalculator(2,5);
   MyCalculator m2= new  MyCalculator();

   m1.print();
   m2.print();
   
   m1.add();
   m1.multiply();
   m2.add();
   m2.multiply();
}
}
   
