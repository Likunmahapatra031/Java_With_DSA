import java.util.Scanner;
    class complex1{
    	int real;
    	int img;
    	void input() {
    		Scanner sc=new Scanner (System.in) ;
    		System.out.println("enter real and img no ");
    		real=sc.nextInt();
    		img=sc.nextInt();
    			
    		}
    	void show() {
    		System.out.println(real+"+"+img+"i");
    	}
    	}
    
public class complexNo_in_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     complex1 []arr=new complex1[5];
     for(int i=0;i<5;i++) {
    	 
     arr[i]=new complex1();
       arr[i].input();
       arr[i].show();
	}
	}
}
