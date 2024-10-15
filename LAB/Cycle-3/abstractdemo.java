import java.util.*;
abstract class shape
{
  int x,y;
  abstract void area(double x,double y);
}
class rectangle extends shape
{   
   void area(double x,double y)
  {
     System.out.println("Area of rectangle is:"+(x*y));
  }
}
class circle extends shape
{
  void area(double x,double y)
  {
    System.out.println("Area of circle is:"+(3.14*x*x));
  }
}
class traingle extends shape
{
   void area(double x,double y)
  {
     System.out.println("Area of traingle is:"+(0.5*x*y));
  }
}
 public class abstractdemo
{
  public static void main(String args[])
  {
    rectangle r=new rectangle();
    r.area(2,5);
    circle c=new circle();
    c.area(5,5);
    traingle t=new traingle();
    t.area(2,5);
  }
}
