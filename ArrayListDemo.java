package Arrays;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println(list);
		list.add(10);
		System.out.println(list);
		System.out.println(list.size());
		list.add(20);
		System.out.println(list);
		System.out.println(list.size());
	}

}
