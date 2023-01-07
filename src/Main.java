import com.learning.linkedList.LinkedList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        LinkedList<Integer> list = new LinkedList<Integer>();
        list.Add(2);
        list.Add(12);
        list.Add(76);
        list.Add(999);
        list.Add(45);

        list.RemoveLast();

        for (var el: list) {
            System.out.println(el);
        }
    }
}