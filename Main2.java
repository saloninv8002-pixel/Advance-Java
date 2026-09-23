import java.util.*;
class Main2{
    public static void main(String args[]){
        List<Integer> numbers=Arrays.asList(1,2,3,4,5);
        System.out.println(numbers);
        List<Integer> answer=numbers.stream()
        .map(num->num*num)
        .toList();
        System.out.println(answer);
    }
}