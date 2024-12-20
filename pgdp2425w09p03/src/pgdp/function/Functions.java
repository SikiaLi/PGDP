package pgdp.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Functions {
	public static <A, B> List<B> map(List<A> toMap, Function<A, B> function) {
		var list = new ArrayList<B>();
		for (A element : toMap){
			list.add(function.apply(element));
		}
		return list;
	}

	public static List<Integer> square(List<Integer> toSquare) {
		Function<Integer, Integer> function = ele -> ele * ele;
		return map(toSquare, function);
	}

	public static <A> List<String> toString(List<A> toString) {
		Function<A, String> function = A -> A.toString();
		return map(toString, function);
	}

	public static <A> List<A> filter(List<A> toFilter, Predicate<A> filter) {
		var list = new ArrayList<A>();

		for (A element : toFilter){
			if (filter.test(element)){
				list.add(element);
			}
		}
		return list;
	}

	public static <A> List<A> filterAny(List<A> toFilter, Predicate<A> filter1, Predicate<A> filter2) {
		/*var list = new ArrayList<A>();
		for (A element : toFilter){
			if (filter1.or(filter2).test(element)){
				list.add(element);
			}
		}
		return list;*/
		return filter(toFilter, filter1.or(filter2));
	}

	public static List<Integer> multiple2or7(List<Integer> numbers) {
		Predicate<Integer> filter1 = element -> element % 2 == 0; // or element & 1 == 0;
		Predicate<Integer> filter2 = element -> element % 7 == 0;

		return filterAny(numbers, filter1, filter2);
	}
}