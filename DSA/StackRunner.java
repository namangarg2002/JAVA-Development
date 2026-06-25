public class StackRunner {
    public static void main(String[] args) {
        // fixed size Stack
        // Stack nums = new Stack();
        // nums.push(15);
        // nums.show();
        // nums.push(8);
        // nums.show();
        // nums.push(10);
        // nums.show();


        // System.out.println(nums.pop());
        // System.out.println(nums.pop());
        // System.out.println(nums.pop());
        // System.out.println(nums.size());
        // System.out.println(nums.pop());


        // Dynamic Stack;
        DynamicStack nums = new DynamicStack();

        nums.push(15);
        nums.show();

        nums.push(8);
        nums.show();

        nums.push(12);
        nums.show();

        nums.push(19);
        nums.show();

        nums.push(5);
        nums.show();

        nums.push(15);
        nums.show();

        nums.pop();
        nums.show();

        nums.pop();
        nums.show();

        nums.pop();
        nums.show();

        nums.pop();
        nums.show();



    }
}
