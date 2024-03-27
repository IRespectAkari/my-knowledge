import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        int[] a = {3, 2, 1, 2, 1};
        Integer[] b = {3, 2, 1, 2, 1};
        double[] c = {3, 2, 1, 2, 1};
        System.out.println("XXXXXXXX");
        // System.out.println("a : " + a);
        // System.out.println("b : " + b);
        // System.out.println("c : " + c);

        Factory.test t1 = Factory.factory(a);
        // Factory.test t2 = Factory.factory(b);
        // List<Integer> list1 = new Factory.test<Integer>(a, "new1");
        // List<Integer> list2 = new Factory.test<Integer>(b, "new2");
        // Factory.test<Integer> list3 = new Factory.test<>(a, "new3");
        // Factory.test<Integer> list4 = new Factory.test<>(b, "new4");
        // t1.set1(a);
        // t1.set2(b);
        // t1.set3(a);
        t1.set(a);
        t1.set(b);
        t1.set("");
        // System.out.println("value1 : " + t1.value1.getClass());
        // System.out.println("value2 : " + t1.value2.getClass());
        System.out.println(t1.getValue1());
        System.out.println(t1.getValue2());
        System.out.println(t1.getValue3());
    }
}
class Factory {
    static <T> test<T> factory(T... a){       return new Factory.test<T>(a, "fac1"); }
    static test<Integer> factory(int... a){   return new Factory.test<Integer>(a, "fac2"); }
    static test<Double> factory(double... a){ return new Factory.test<Double>(a, "fac3"); }

    public static class test<T> extends AbstractList<T> {
        public T value1;
        public T[] value2;
        public Object value3;

        test(T[] t, String by){   disp(t, by); }
        test(int[] i, String by){ disp(i, by); }
        test(double[] i, String by){ disp(i, by); }

        void disp(T[] t, String by){   System.out.println("[" +    by + "] disp<T>  : " + Arrays.toString(t) + " class : " + t.getClass()); }
        void disp(int[] i, String by){ System.out.println("[" +    by + "] int[]    : " + Arrays.toString(i) + " class : " + "int"); }
        void disp(double[] i, String by){ System.out.println("[" + by + "] double[] : " + Arrays.toString(i) + " class : " + "double"); }

        public void set(T t){ this.value1 = t; }
        // public void set(T[] t){ this.value2 = t; }
        // public void set(Object t){ this.value3 = t; }

        String getValue1(){ return "value1 : " + (value1 == null ? "null" : value1.getClass().getName()); }
        String getValue2(){ return "value2 : " + (value2 == null ? "null" : value2.getClass()); }
        String getValue3(){ return "value3 : " + (value3 == null ? "null" : value3.getClass()); }

        public T get(int i){ return (T)new Object(); }
        public int size(){ return -1; }
    }
}
interface Test1 {
    static <T> void f1(T t){    System.out.println("t : " + t); }
    static <T> void f2(T... t){ System.out.println("Arrays.toString(t) : " + Arrays.toString(t)); }
    static <T> void f3(T... t){ System.out.println("t.length     : " + t.length); }
    // static <T> void f4(int index, T... t){ System.out.println(t[index]); }
    static <T> void f5(T t){    System.out.println("t.getClass() : " + t.getClass() + "\""); }
    static <T> void f6(T t){    System.out.println("t.getClass().getName() : " + t.getClass().getName() + "\""); }
}
