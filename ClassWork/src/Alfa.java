import java.util.Scanner;
  class student1{
	  String name;
	  int rollno;
	  double mark;
	  void display() {
		  Scanner sc=new Scanner(System.in);
		  System.out.println("enter the details ");
		  name =sc.nextLine();
		  rollno=sc.nextInt();
		  mark=sc.nextDouble();
	  }
	  void out() {
		  System.out.println("the name is "+name);
		  System.out.println("rollno is "+rollno);
		  System.out.println("mark is "+mark);
	  }
  }
  
public class Alfa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        student1 obj1=new student1();
          student1 obj2=new student1();
          obj1.display();
          obj1.out();
          obj2.display();
          obj2.out();
          
	}

}
