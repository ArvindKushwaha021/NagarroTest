package nagaro.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * This Class finds the sum of 2d Arrays available in map<Integer,
 * List<List<Integer>>. It add only those sum in list where key in map is
 * greater than a particular number.
 * 
 * @author User
 *
 */

public class NagarroTest {

	public static void main(String[] args) {

		int n = 5;
		Map<Integer, List<List<Integer>>> map = getMap();

		List<Integer> sumList = new ArrayList<>();
		map.forEach((k, v) -> {

			if (k > n) {

				Integer sum = v.stream().flatMap(value -> value.stream()).collect(Collectors.toList()).stream()
						.mapToInt(Integer::valueOf).sum();
				sumList.add(sum);

			}
		});

		System.out.println(sumList);

	}

	private static Map<Integer, List<List<Integer>>> getMap() {
		List<Integer> list11 = Arrays.asList(1, 3, 7, 23, 15, 23);
		List<Integer> list12 = Arrays.asList(1, 3, 7, 23, 15, 23);

		List<Integer> lis21 = Arrays.asList(1, 6, 7, 23, 16, 23);
		List<Integer> list22 = Arrays.asList(1, 3, 7, 23, 75, 23);

		List<Integer> lis31 = Arrays.asList(1, 6, 7, 23, 15, 43);
		List<Integer> list32 = Arrays.asList(1, 3, 7, 24, 75, 53);

		List<List<Integer>> list1 = Arrays.asList(list11, list12);
		List<List<Integer>> list2 = Arrays.asList(lis21, list22);

		List<List<Integer>> list3 = Arrays.asList(lis31, list32);

		Map<Integer, List<List<Integer>>> map = new HashMap<>();

		map.put(5, list1);
		map.put(10, list2);
		map.put(20, list3);
		return map;
	}

}
