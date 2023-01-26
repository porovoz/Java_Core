package course02.lesson10;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

        // task 1
        Predicate<Integer> isPositiveNumber = new Predicate<Integer>() {
            @Override
            public boolean test(Integer number) {
                return number > 0;
            }
        };
        System.out.println(isPositiveNumber.test(8));
        System.out.println(isPositiveNumber.test(-6));
        System.out.println();

        Predicate<Integer> isPositiveNumber1 = number -> number > 0;
        System.out.println(isPositiveNumber1.test(-18));
        System.out.println(isPositiveNumber1.test(1));
        System.out.println();

        // task 2
        Consumer<String> greeting = new Consumer<String>() {
            @Override
            public void accept(String name) {
                System.out.printf("Hello, %s! \n", name);
            }
        };
        greeting.accept("Nikolay");

        Consumer<String> greeting1 = name -> System.out.println("Hello, " + name + "!");
        greeting1.accept("Vasilisa");
        System.out.println();

        // task 3
        Function<Double, Long> roundLong = new Function<Double, Long>() {
            @Override
            public Long apply(Double number) {
                return Math.round(number);
            }
        };
        System.out.println(roundLong.apply(12.4));
        System.out.println();

        Function<Double, Long> roundLong1 = number -> Math.round(number);
        System.out.println(roundLong1.apply(11.9));
        System.out.println();

        // task 4
        Supplier<Integer> randomInteger = new Supplier<Integer>() {
            @Override
            public Integer get() {
                Random random = new Random();
                return random.nextInt(100);
            }
        };
        System.out.println(randomInteger.get());
        System.out.println();

        Supplier<Integer> randomInteger1 = () -> {
            Random random = new Random();
            return random.nextInt(100);
        };
        System.out.println(randomInteger1.get());
        System.out.println();

        // Task 5
        Function<Integer, Integer> multiplyToTwo = x -> x * 2;
        Function<Integer, Integer> multiplyToThree = x -> x * 3;
        Predicate<Integer> isOdd = x -> x % 2 != 0;
        Function<Integer, Integer> result = ternaryOperator(isOdd, multiplyToTwo, multiplyToThree);
        result.apply(6);
    }

    public static <T, U> Function<T, U> ternaryOperator(
            Predicate<? super T> condition,
            Function<? super T, ? extends U> ifTrue,
            Function<? super T, ? extends U> ifFalse) {
        return t -> {
            U result = condition.test(t) ? ifTrue.apply(t) : ifFalse.apply(t);
            System.out.println(result);
            return result;
        };
    }
}
