import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        // Func f = i -> System.out.println(a[0]);
        // System.out.println(method());
        System.out.println("XXXXXXXX");
    }
    public static int method(){
        int[] a = new int[]{1};
        System.out.println("前 stream " + a[0]);
        // java.util.stream.IntStream is = java.util.stream.IntStream.of(1, 1, 1).map(val -> val + a[0]);
        java.util.stream.IntStream is = java.util.stream.IntStream.of(1, 1, 1).map(val -> {
            System.out.println("inStream " + a[0]);
            return val + a[0];
            }
        );
        // new LinkedList<Integer>(){{add(1);add(1);add(1);}}.stream().map(val -> val + a[0]).forEach(System.out::println);
        System.out.println("outStream " + a[0]);
        a[0] = 0;
        System.out.println("last " + a[0]);
        return is.sum();
    }
}
interface Func {
    void F(int i);
}
