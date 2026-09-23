import java.util.*;
class Main3{
    public static void main(String args[]){
        List<Integer> numbers=Arrays.asList(1,2,3,4,5);
        System.out.println(numbers);
        List<Integer> ans=numbers.stream()
        .map(num->num+10)
        .toList();
        System.out.println(ans);
    }
}
