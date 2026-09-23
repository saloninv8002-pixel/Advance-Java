import java.util.*;
class Main7{
    public static void main (String args[]){
        List<Integer> numbers=Arrays.asList(1,2,3,4,5,6,7);
        List<Integer> ans=numbers.stream()
        .filter(num->num>5)
        .toList();
        System.out.println(ans);
    }
}