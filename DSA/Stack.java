public class Stack {
    int stack[] = new int[5];
    int top = 0;
    public void push(int data){
        if(top == 5 ){
            System.out.println("Stack is full");
            return;
        }
        stack[top] = data;
        top++;
    }
    public int pop(){
        int topElement;
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return -1;
        }
        top--;
        topElement = stack[top];
        stack[top] = 0;

        return topElement;
    }

    public int peek(){
        int topElement;
        topElement = stack[top-1];

        return topElement;
    }
    public int size(){
        return top;
    }
    public boolean isEmpty(){
        return top == 0;
    }
    public void show(){
        for(int n: stack){
            System.out.print(n + " ");
        }
        System.out.println();
    }
}
