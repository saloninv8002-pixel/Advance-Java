import java.util.*;
class Main8{
    public static void main(String args[]){
        List<String> name=Arrays.asList("Saloni","Tanav","Vasu","Natesh");
        System.out.println(name);
        List<String> ans=name.stream()
        .filter(n->n.startsWith("A"))
        .toList();
        System.out.println(ans);
    }
}