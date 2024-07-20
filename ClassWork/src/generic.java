public class generic{
	<T> void swap(T a,T b) {
		System.out.println(a+"\n"+b);
		T temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println(a+"\n"+b);
		
	}
	public static void main(String[]args) {
		generic obj=new generic();
		obj.swap(10, 18);
        obj.swap("likun", "supi");
        obj.swap(8.2, 1.1);

	}
}