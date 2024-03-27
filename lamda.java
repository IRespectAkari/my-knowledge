import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        // String str = "";
        Func f = (str) -> {
            System.out.println(str);
        };
        Func F = str -> System.out.println("none F : " + str);
        f.F("strs");
        F.F("strs");

        Func[] Fary = new Func[]{
            str -> System.out.println("Array 0 : " + str),
            str -> System.out.println("Array 1 : " + str),
        };
        for(Func ff : Fary) ff.F("test");

        List<Func> Flist = new LinkedList<>();
        Flist.add(str -> System.out.println("List 0 : " + str));
        Flist.add(str -> System.out.println("List 1 : " + str));
        for(Func fff : Flist) fff.F("listTest");

        System.out.println(
            java.util.stream.LongStream
            .range(1,1_000_000_000L) //１から１億まで
            .parallel() //マルチコアを活かして並列処理で
            .mapToDouble((n)->((n&1)>0?1.0: -1.0)/n)
            //log2のテーラ展開の項を計算し
            .reduce(0.0,(s,y)->s+y) //合計する
        );

        System.out.println("XXXXXXXX");
    }
}
interface Func {
    void F(String str);
}
