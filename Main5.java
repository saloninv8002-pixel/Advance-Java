import java.util.*;
class Main5{
    public static void main(String args[]){
        List<String> names=Arrays.asList("Saloni","Tanav","Natesh","Vasanthi") ;
        System.out.println(names);
        List<Integer> length=names.stream()
        .map(name->name.length())
        .toList();
        System.out.println(length);
    }
}