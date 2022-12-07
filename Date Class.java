import java.util.*;

public class Main {
	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d);
		System.out.println(d.getTime());
		System.out.println(d.getClass());
		
		//Deprecated Methods
		System.out.println(d.getSeconds());
		System.out.println(d.getMinutes());
		System.out.println(d.getHours());
		System.out.println(d.getDay());
		System.out.println(d.getDate());
		System.out.println(d.getYear());
	}
}