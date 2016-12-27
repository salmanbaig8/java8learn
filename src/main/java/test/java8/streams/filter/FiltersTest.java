package test.java8.streams.filter;

import static java.util.Arrays.asList;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class FiltersTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = new ArrayList<String>();
		names.addAll(asList("hulk","batman","ironman","captain america"));
		
		Predicate<String> p = Predicate
		Stream<String> nameFilter = names.stream();

		
				
		
		

	}

}
