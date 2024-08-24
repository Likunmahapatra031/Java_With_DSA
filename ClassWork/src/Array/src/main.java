import java.util.Scanner;
public class main {

	public static void main(string[] args) {
		Scanner sc= new Scanner(System.in);
		// TODO Auto-generated method stub
             int []arr=new int[5];
             arr[0]=23;
             arr[1]=4;
             arr[2]=2;
             arr[3]=4;
             arr[4]=5;
             System.out.println(arr[4]);
             
           for(int i=0;i<arr.length;i++) {
        	   arr[i]=sc.nextInt();
        	   
           }
           for(int i=0;i<arr.length;i++) {
        	   System.out.println(arr[i]+" ");
           }
             
	}

}
