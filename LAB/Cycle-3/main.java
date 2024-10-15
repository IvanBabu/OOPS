 class member
{
   public String name;
   public int age;
   public String phonenumber;
   public String address;
   private double salary;
   
   public member(String name,int age,String phonenumber,String address,double salary)
   {
      this.name=name;
      this.age=age;
      this.phonenumber=phonenumber;
      this.address=address;
      this.salary=salary;
   }
   public void printsalary()
   {
     System.out.println("salary"+salary);
   }
}
 class employee extends member
{
   public employee(String name,int age,String phonenumber,String address,double salary)
   {
      super(name,age,phonenumber,address,salary);
   }
}
 class manager extends member
{
  private String department;
  public manager(String name,int age,String phonenumber,String address,double salary,String department)
  {
     super(name,age,phonenumber,address,salary);
     this.department=department;
   }
}
public class main{
public static void main(String args[])
{


  employee e=new employee("Ivan",19,"8891296271","Home",500000);
  manager m=new manager("Rohan",30,"325874165427","Office",1000000,"CSE");
  e.printsalary();
  m.printsalary();
}
}
   
