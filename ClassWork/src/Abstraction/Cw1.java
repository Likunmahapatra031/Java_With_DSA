package Abstraction;
import java.util.Scanner;
 abstract class shape{
	   public abstract double area();
	   
 }
   class square extends shape{
	 public   double area() {
		   Scanner sc=new Scanner(System.in);
		   System.out.println("enter side is ");
		   int s=sc.nextInt();
		   return(double)s*s;
		   
	   }
   }
   class rectangle extends shape{
	    public double area() {
           Scanner sc=new Scanner(System.in);
           System.out.println("enter the area");
           int l=sc.nextInt();
           int b=sc.nextInt();
           return(double)l*b;
	}
	   
   }
    class circle extends shape{
    	public double area() {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the radius ");
      int r=sc.nextInt();
      return(double)(Math.PI)*r*r;
    	}
    	
    }
public class Cw1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       shape obj2=new square();
       System.out.println("area of square is "+obj2.area());
       obj2=new rectangle();
       System.out.println("area of rectangle is "+obj2.area());
       obj2=new circle();
       System.out.println("area of circle is "+obj2.area());
	}

}
