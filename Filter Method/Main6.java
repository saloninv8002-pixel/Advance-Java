import java.util.*;
class Main6{
    public static void main(String args[]){
        List<Integer> numbers=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        System.out.println(numbers);
        List<Integer> ans=numbers.stream()
        .filter(num->num%2==0)
        .toList();
        System.out.println(ans);
    }
}
