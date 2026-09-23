import java.util.*;
class Main4{
    public static void main(String args[]){
        List<String> names=Arrays.asList("Saloni","Tanav","Natesh","Vasanthi");
        System.out.println(names);
        List<String> ans=names.stream()
        .map(name->name.toUpperCase())
        .toList();
        System.out.println(ans);
    }
}
