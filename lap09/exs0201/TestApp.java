package lap09.exs0201;

public class TestApp {
    public static void main(String[] args) {
        Mylist l1 = new MyArrayList();
        l1.add("a",0);
        l1.add("b");
        l1.add("c",0);
        l1.add("c",3);
        l1.remove(3);
        System.out.println(l1.size());
        System.out.println(l1);
    }
}
