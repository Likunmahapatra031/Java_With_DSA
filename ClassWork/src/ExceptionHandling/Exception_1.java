package ExceptionHandling;
import java.util.Scanner;

public class Exception_1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a no ");
		 int n=sc.nextInt();
		 int m=sc.nextInt();
	//	   int c =n/m;
		  //      System.out.println("results is "+c);
		        try {
		        	 int c =n/m;
		        	 System.out.println(c);
		        }
          catch(Exception e) {
        	  System.out.println("we faild to divide : resoan ");
        	  System.out.println(e);
          }
           System.out.println("end the program");
	}

}
