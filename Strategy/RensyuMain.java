package Strategy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class RensyuMain{
    public static void main(String[] args) {
        List<String> list = Arrays.asList("B","C","E","D","A");
        // RensyuList r = new RensyuList(list);

        // 辞書式順序で小さい順
        // RensyuListの実装が行われている
        // list.sort(new Comparator<String>() {
        //     public int compare(String a, String b){
        //         return a.compareTo(b);
        //     }
        // });
        list.sort((a,b)->a.compareTo(b));// ラムダ

        System.out.println(list);

        // 辞書式順序で大きい順
        list.sort(new Comparator<String>() {
            public int compare(String a, String b){
                return b.compareTo(a);
            }
        });
        // list.sort((a,b)->b.compareTo(a));// ラムダ
        System.out.println(list);

        //list.sort(false);
    }

}
