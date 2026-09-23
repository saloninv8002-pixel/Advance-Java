import java.util.*;
class Main1{
    public static void main(String args[]){
        List<Integer> numbers=Arrays.asList(1,2,3,4,5,6,7);
        System.out.println(numbers);
        List<Integer> answer=numbers.stream()
        .map(num->num*2)
        .toList();
        System.out.println(answer);

    }
}
