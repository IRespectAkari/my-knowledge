import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        List<Integer> flist = new LinkedList<>(){{add(1);add(1);add(1);}};
        flist.forEach(System.out::println);
        
        List<User> userList = new LinkedList<>(){{add(new User("11"));add(new User("22"));add(new User("33"));}};

        // メソッド参照を使用しない方法
        userList.stream().map(v -> v.getName()).forEach(e -> System.out.println(e));

        // メソッド参照を使用した方法
        userList.stream().map(User::getName).forEach(System.out::println);

        System.out.println("XXXXXXXX");
    }
    static class User {
        private final String name;
        public User(String n){ this.name = n; }
        public String getName(){ return this.name; }
    }
}
