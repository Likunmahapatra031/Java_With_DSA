import java.util.Arrays;
import java.util.Scanner;
public class PassinginFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc= new Scanner(System.in);
  int[] nums= {3,4,5,6};
  System.out.println(Arrays.toString(nums));
   change(nums);
   System.out.println(Arrays.toString(nums));
   
	}
static void change(int[]arr) {
	arr[0]=99;
}
}
