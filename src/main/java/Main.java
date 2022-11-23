public class Main {

    public static void main(String[] args) {
        SimpleLinkedList<Integer> test = new SimpleLinkedList<>();
        test.add(123);
        test.add(234);
        test.add(345);
        test.add(456);
        System.out.println(test.size());
    }
}
