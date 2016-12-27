package test.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static java.util.Arrays.asList;

public class ListToStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = new ArrayList<String>();
		names.addAll(asList("hulk","batman","ironman","captain america"));
		
		Stream<String> namesStream = names.stream();
		//namesStream.forEach(n -> System.out.println(n));
		namesStream.forEach(System.out::println);
		
		java.util.function.Consumer<String> c = s -> System.out.println(s);
		

	}

}
