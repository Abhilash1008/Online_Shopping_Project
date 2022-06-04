 

  class MyCalculator
{
 
  int num1;
  int num2;


  MyCalculator(int n1, int n2)  
{
  num1=n1;
  num2=n2;
}

  MyCalculator()               
{
 num1=5;
 num2=8;
}

  void print()
{
  System.out.println("num1=" +num1);
  System.out.println("num2=" +num2);
}

  void add()
{
  int result=num1+num2;
  System.out.println("result=" +  result);
}

  void multiply()
{
   int result=num1*num2;
   System.out.println("result="+ result);
}
}