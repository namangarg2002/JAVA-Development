public class DynamicStack {
    int capacity = 2;
    int stack[] = new int[capacity];
    int top = 0;
    public void push(int data){
        if(size() == capacity){
            expand();
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
        shrink();

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


    private void expand() {
        int length = size();
        int newStack[] = new int[capacity*2];

        System.arraycopy(stack, 0, newStack, 0, length);

        stack = newStack;
        capacity *= 2;
    }

    private void shrink() {
        int length = size();
        if(length <= (capacity/2)/2){
            capacity /= 2; 
        }

        int newStack[] = new int[capacity];
        System.arraycopy(stack, 0, newStack, 0, length);
        stack = newStack;
        
    }


}
