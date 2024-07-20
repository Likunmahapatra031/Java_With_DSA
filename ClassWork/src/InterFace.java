import java.util.Scanner;
  interface AnimalEat {
	  void Eat();
	  
  }
  interface AnimalTravel{
	  void Travel ();
	  
  }
   class Abc implements AnimalEat , AnimalTravel{
	   public void Eat() {
		   System.out.println("Animal is eating ");
	   }
	   public void Travel() {
		   System.out.println("Animal traveling ");
	   }
	   
   }
   
public class InterFace {
	public static void main(String[] args) {
		Abc obj=new Abc();
		obj.Eat();
		obj.Travel();

	}

}
