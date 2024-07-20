package inheritance;
import java.util.Scanner;
 class person {
    String name;
    int id;
    person(String n,int i){
    	
    	 this.name =n;
    	this.id=id;
    }
 }
    
    class employee extends person{
    	double salary;
    	employee(String name,int id,double salary){
    		super(name ,id);
    		this.salary=salary;
    	}
    void display() { 	
   System.out.print(name+id+salary);
   
    }
    }
    public class Super{
	public static void main(String[] args) {
		
      Scanner sc=new Scanner(System.in);
      
      System.out.println("enter the name  ");
      String name =sc.next();
       sc.nextLine();
       System.out.println("enter the id ");
       int id=sc.nextInt();
      System.out.println("enter the salary  ");
      double salary=sc.nextDouble();
      employee obj1=new employee(name,id,salary);
      obj1.display();
      
          
	}

}
