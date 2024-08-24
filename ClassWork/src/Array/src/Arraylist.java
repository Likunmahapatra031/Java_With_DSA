import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc =new Scanner(System.in);
    ArrayList<Integer> list= new ArrayList<>();
    
    list.add(23);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);
    list.add(6);
    list.add(7);
    list.remove(2);
    System.out.println(list);
	}

}
