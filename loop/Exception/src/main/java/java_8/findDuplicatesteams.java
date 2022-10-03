package java_8;// Java program to find the duplicate
// elements in a Stream using Set

import java.util.*;
import java.util.stream.*;

class GfG {

    public static <T> Set<T>
    findDuplicateInStream(Stream<T> stream) {
        Set<T> items = new HashSet<>();
        return stream.filter(n -> !items.add(n)).collect(Collectors.toSet());
    }

    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(5, 13, 4,21, 13, 27, 2, 59, 59, 34);
        System.out.println(findDuplicateInStream(stream));
    }
}
