public class LLRunner {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insert(18);
        list.insert(45);
        list.insert(20);
        list.insert(50);
        list.show();

        list.insertAtStart(10);
        list.show();

        // list.insertAtIndex(9, 30);
        // list.show();

        list.deleteAtIndex(5);
        list.show();

    }
}
