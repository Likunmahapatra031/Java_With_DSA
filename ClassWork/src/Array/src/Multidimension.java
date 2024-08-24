import java.util.Arrays;
import java.util.Scanner;
public class Multidimension {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc= new Scanner(System.in);
        
		int[][] arr=new int[3][3];
		System.out.println(arr.length);
		
		for(int row =0; row< arr.length;row++) {
			
			for(int col=0; col<arr[row].length;col++) {
				arr[row][col]=sc.nextInt();	
			}
		}
	
          for(int row =0; row< arr.length;row++) {
			
			for(int col=0; col<arr[row].length;col++) {
				System.out.print(arr[row][col]+" ");
			}
			System.out.println();
			}
		
	}

}
