public class QueueRunner {
    public static void main(String[] args) {
        MyQueue q = new MyQueue(10);

        q.enQueue(10);
        q.enQueue(20);
        q.enQueue(30);

        q.show();

        q.deQueue();
        q.show();

        q.enQueue(40);
        q.enQueue(50);

        q.show();

        q.enQueue(60);

        q.show();

        System.out.println("Size of the queue is : " + q.getSize());

        System.out.println("Is Queue Full : " + q.isFull());

        System.out.println("Peek element is : " + q.peek());




    }
}
