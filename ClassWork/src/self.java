//import java.util.Scanner;

//class comp{
//	int real;
//	int img;
//	void input(){
//		Scanner sc=new Scanner (System.in);
//		System.out.println("enter the real and img");
//	 real=sc.nextInt();
//	 img =sc.nextInt();
//	   
//	}
//	void displa() {
//		System.out.println(real+"+"+img+"i");
//	}
//}
//    class self{
//	  public static void main(String []args) {
//		  comp[]a=new comp[2];
//		  for(int i=0;i<a.length;i++) {
//			  a[i]=new comp();
//			  a[i].input();
//			  a[i].displa();
//		  }
//	  }
//}
//    
//    
  // question 2

//   import java.util.Scanner;
//   class product {
//	   int pid;
//	   int price;
//	   product(){
//		   Scanner sc=new Scanner(System.in);
//		   System.out.println("enter price and pid");
//		   pid=sc.nextInt();
//		   price=sc.nextInt();
//	   }
//	   void display() {
//		   System.out.println(price+" "+pid);
//		   
//	   }
//   }
//     public class self{
//    	 public static void main(String []args) {
//    		 product obj =new product();
//    		 obj.display();
//    	 }
//    	 
//     }
//   
// question 3
//       import java.util.Scanner;
//        class product4{
//        	int pid;
//        	int price;
//        	product4 (int p , int pr){
//        		pid=p;
//        		price=pr;
//        		
//        	}
//        	void input() {
//              System.out.println("price is "+price);
//              System.out.println("pid is "+pid);
//        	}
//        }
//           public class self{
//        	   public static void main(String[]args) {
//        		   Scanner s = new Scanner (System.in);
//        		   System.out.println("enter price and price");
//        		   int x=s.nextInt();
//        		   int y=s.nextInt();
//        		   product4 obj3=new product4(x,y) ;
//        		      obj3.input();
//        	   }
//           }
// question 4
     
class demo{
	static int count=0;
	demo(){
		count++;
	}
	void display() {
		System.out.println(count);
	}
}
	public class self{
		public static void main(String []args) {
			demo ob=new demo();
			ob.display();
			demo ob2=new demo();
			demo ob3=new demo();
			ob3.display();
		}
	}










