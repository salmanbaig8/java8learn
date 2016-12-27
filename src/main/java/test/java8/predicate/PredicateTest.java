package test.java8.predicate;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class PredicateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Predicate<String> p = Predicate.isEqual("two");
		
		Stream<String> stream1 = Stream.of("one","two","three");
		
		Predicate<String> p1= s-> s.length()>3;
		
		Predicate<String> p3= Predicate.isEqual("three");
		
		stream1.filter(p.or(p3))
			   .forEach(System.out::println);
		//System.out.println(stream2); //Stream doesn't store anything
	}

}
