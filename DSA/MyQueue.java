public class MyQueue {
    int queue[];
    int size = 0;
    int front = 0;
    int rear = 0;

    public MyQueue(int capacity){
        queue = new int[capacity];
    }

    public void enQueue(int data){
        if(size == queue.length){
            System.out.println("Queue Overflow");
            return;
        }
        queue[rear] = data;
        rear = (rear + 1)%queue.length;
        size++;
    }

    public int deQueue(){
        if(size == 0){
            System.out.println("Queue Underflow");
            return -1;
        }
        int frontElement = queue[front];
        queue[front] = 0;
        front = (front+1)%queue.length;
        size--;
        return frontElement;
    }

    public int getSize(){
        return size;
    }

    public int peek(){
        if(size == 0){
            System.out.println("Queue Empty");
            return -1;
        }
        return queue[front];
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public boolean isFull(){
        return size == queue.length;
    }

    public void show(){
        for(int n: queue){
            System.out.print(n + " ");
        }
        System.out.println();
    }
}
