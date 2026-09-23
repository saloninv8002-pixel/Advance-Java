import java.util.*;
class Main9{
    public static void main(String args[]){
        List<Integer> numbers=Arrays.asList(1,-2,-3,-4,1,2,3,4,5,6);
        System.out.println(numbers);
        List<Integer>ans=numbers.stream()
        .filter(num->num>=0)
        .toList();
        System.out.println(ans);
    }
}