package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * author Süreyya
 */

public class Streams {
    public static void main (String[] args){
        List<String> stringCollection = new ArrayList<>();
        stringCollection.add("aaa2");
        stringCollection.add("bbb2");
        stringCollection.add("cccc2");
        stringCollection.add("dddd2");
        stringCollection.add("eeee2");
        stringCollection.add("aaaa1");

        //Filtering
        stringCollection.stream().filter((s -> s.startsWith("a"))).forEach(System.out::println);

        //Sorting
        stringCollection.stream().sorted().filter(s -> s.startsWith("a")).forEach(System.out::println);

        //Mapping
       stringCollection.stream().map(String::toUpperCase).sorted((a,b)->b.compareTo(a)).forEach(System.out::println);

       //Matching
        boolean anyStartsWithA=stringCollection.stream().anyMatch(s -> s.startsWith("a"));
        System.out.println(anyStartsWithA);

        boolean allStartsWithA=stringCollection.stream().allMatch(s -> s.startsWith("a"));
        System.out.println(allStartsWithA);

        boolean noneStartsWithA=stringCollection.stream().noneMatch(s -> s.startsWith("a"));
        System.out.println(noneStartsWithA);

        //Counting

        long startsWithB= stringCollection.stream().filter(s -> s.startsWith("b")).count();
        System.out.println(startsWithB);

        //reducing
        Optional<String> reduced=stringCollection.stream().sorted().reduce((s, s2) -> s+"#"+s2);
        reduced.ifPresent(System.out::println);

        Arrays.asList("a1", "a2", "b1", "c2", "c1")
                .stream()
                .filter(s -> s.startsWith("c"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);

    }
}
