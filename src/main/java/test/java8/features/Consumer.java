package test.java8.features;

import static java.util.Arrays.asList;

import java.util.ArrayList;
import java.util.List;

public class Consumer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> names = new ArrayList<String>();

		java.util.function.Consumer<String> c1 = s -> names.add(s);
												//names:add;
		java.util.function.Consumer<String> c2 = s -> System.out.println(s);
												//System.out::println;
		java.util.function.Consumer<String> c3 = c1.andThen(c2);
	}

}
