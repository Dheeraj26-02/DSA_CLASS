package Streams;
import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class Implementation {
    static void main() {
        //Arrays
        String fruits[] = {"Apple", "Banana", "Orange"};
        Arrays.stream(fruits).forEach(fruit -> System.out.println(fruit));

        //List
        List<String> fruitsList = List.of("Apple", "Banana", "Orange");
        fruitsList.stream().forEach(fruit-> System.out.println(fruit));

        //Filter
        fruitsList.stream().filter(f->f.endsWith("e")).forEach(fruit-> System.out.println(fruit));

        //Reduce
        List<Integer> numbers=List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        int sum=numbers.stream().reduce(0,(a,b)->a+b);
        System.out.println(sum);


        //Apply
        BinaryOperator<Integer> multi=(a, b)->a*b;
        int pro=multi.apply(4,5);
        System.out.println(pro);

        //Optional
        List<Integer> nums=List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        //List<Integer> nums=new ArrayList<>();
        Optional<Integer> newSum=nums.stream().reduce((a,b)->a+b);
        System.out.println(newSum);
        if(newSum.isPresent()){
            System.out.println(newSum.get());
        }
        else{
            System.out.println(0);
        }



        //Max
        List<Integer> nums1=List.of( 12,2,4, 5, 6, 44, 8, 9,3);
        Optional<Integer> max=nums1.stream().max(Integer::compareTo);
        max.ifPresent(System.out::println);


        //Min
        List<Integer> nums2=List.of( 12,2,4, 5, 6, 44, 8, 9,3);
        Optional<Integer> min=nums2.stream().min(Integer::compareTo);
        min.ifPresent(System.out::println);


        //Collect
        List<String> words=List.of( "Hello", "World");
        List<String> collectdWords=words.stream().collect(Collectors.toList());
        System.out.println(collectdWords);


        //Sort
        List<Integer> nums3=List.of( 12,2,4, 5, 6, 44, 8, 9,3);
        List<Integer> sortedList=nums3.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(sortedList);

        //Distinct
        List<Integer> nums4=List.of( 3,2,8, 44, 6, 44, 8, 9,3);
        List<Integer> distinctList=nums4.stream().distinct().collect(Collectors.toList());
        System.out.println(distinctList);



        //Map
        List<String> words1=List.of( "Hello", "World","Hi","Bye");
        List<String> upperList=words1.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(upperList);



        //Practice Question
        List<String> l=List.of("1","2","3","4");
        l.stream().map(Integer::parseInt).map(num->Math.pow(num,2)).reduce(Double::sum).map(Double::intValue).ifPresent(System.out::println);
    }
}
