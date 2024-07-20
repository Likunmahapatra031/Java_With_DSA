import java.util.Scanner;
class complex{
	int real;
	int img;
	void input(int x,int y ) {
		real=x;
		img=y;
	}
	void show() {
		System.out.println(real+"+"+img);
	}
}
public class Complex_Details {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
      System.out.println("enter real and img no");
      int x=sc.nextInt();
      int y=sc.nextInt();
      complex s=new complex();
      s.input(x, y);
      s.show();
	}

}
