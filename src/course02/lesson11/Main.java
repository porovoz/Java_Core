package course02.lesson11;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        // Task 1
        List<Integer> integerList = new ArrayList<>();
        integerList.add(11);
        integerList.add(1);
        integerList.add(3);
        integerList.add(45);
        integerList.add(5);
        integerList.add(66);
        integerList.add(7);
        integerList.add(24);
        integerList.add(9);
        integerList.add(10);
        Stream<Integer> integerStream = integerList.stream();
        findMinMax(integerStream, Integer::compareTo,
                (x, y) -> System.out.println("Minimum integer in stream: " + x + "\n" + "Maximum integer in stream: " + y));

        // Task 2
        countEvenNumbers(integerList);
    }

    public static <T> void findMinMax(
            Stream<? extends T> stream,
            Comparator<? super T> order,
            BiConsumer<? super T, ? super T> minMaxConsumer) {
        List<T> arrayList;
        T min = null;
        T max = null;
        arrayList = stream
                .sorted(order)
                .collect(Collectors.toList());
        if (arrayList.size() != 0) {
            min = arrayList.get(0);
            max = arrayList.get(arrayList.size() - 1);
        }
        minMaxConsumer.accept(min, max);
    }

//        public static void countEvenNumbers(List<Integer> list) {
//        List<Integer> countEvenNumbersList = list.stream()
//                .filter(x -> x % 2 == 0)
//                .collect(Collectors.toList());
//        System.out.println("Even number quantity: " + countEvenNumbersList.size());
//    }

    public static void countEvenNumbers(List<Integer> list) {
        System.out.println("Even number quantity: " + list.stream()
                .filter(x -> x % 2 == 0)
                .count());
    }
}
