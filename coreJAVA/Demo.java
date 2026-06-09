import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;
import java.util.function.Supplier;
class Calculator
{
    public int add(int n1, int n2)
    {
        int r = n1 + n2;
        return r;
    }
};

class Computer
{
    public void playMusic()
    {
        System.out.println("Music Playing...");
    }

    public String getMeAPen(int cost)
    {
        if(cost >= 10){
            return "Pen";
        }
        
        return "Nothing";
    }

}

class Student {
    // private data members;
    private String name;
    private int age;

    // Setter methods
    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    // Getter methods
    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }
}; 

class Animal {
    String name = "Lion";
}

class Human{
    int eye(int a, int b){
        return a + b;
    }
}

class Male extends Human{

    int eye(int a, int b){
        return a - b;
    }
}

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message){
        super(message);
    }
}

class Voter{

    public void checkAge(int age) throws InvalidAgeException {

        if(age < 18){
            throw new InvalidAgeException(
                "Age must be 18 or above for voting,"
            );
        }

        System.out.println("Eligible for voting");
    }
}

class MyThread implements Runnable{
    @Override
    public void run(){
        for(int i=0; i<10; i++){
            System.out.println(i);

            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

public class Demo {
    public static void main(String a[]){
        // int num1 = 4;
        // int num2 = 5;

        // Calculator calc = new Calculator();

        // int result = calc.add(num1, num2);

        // // int result  = num1 + num2;
        // System.out.println(result);


        // Computer obj = new Computer();

        // obj.playMusic();
        // String result = obj.getMeAPen(2);
        // System.out.println(result);


        // int nums[] = {3, 7, 5};

        // int nums[] = new int[4];
        // nums[0] = 5;
        // nums[1] = 6;
        // nums[2] = 4;
        // nums[3] = 5;

        // for(int i=0; i<4; i++){
        //     System.out.println(nums[i]);
        // }

        // int nums[][] = new int[3][4];

        // for(int i=0; i<3; i++){
        //     for(int j=0; j<4; j++){
        //         nums[i][j] = (int)(Math.random() * 10);
        //     }
        // }

        // for(int i=0; i<3; i++){
        //     for(int j=0; j<4; j++){
        //         System.out.print(nums[i][j]+ " ");
        //     }
        //     System.out.println();
        // }
        // String name = "Naman"; 

        // StringBuffer sb = new StringBuffer("Naman");
        // sb.append("Garg");

        // System.out.println(sb);

        // String str = sb.toString();

        // System.out.println(str);

        // Student stu = new Student();

        // stu.setName("Naman");
        // stu.setAge(23);

        // System.out.println(stu.getName());
        // System.out.println(stu.getAge());


        // Animal an = new Animal();

        // System.out.println(an.hashCode());

        // Male m = new Male();
        // System.out.println(m.eye(5, 3));

        // int age = 17;

        // Voter v = new Voter();

        // try{
        //     v.checkAge(age);
        // }catch(InvalidAgeException e){
        //     System.out.println("Exception Caught" + e.getMessage());
        // }
        // finally{
        //     System.out.println("Finally Block excecuted.");
        // }

        // System.out.println("Program continues ... ");

        // Scanner sc = new Scanner(System.in);
        // // System.out.print("Enter Number: ");
        // // int num = sc.nextInt();

        // // System.out.println("Number is : " + num);

        // // String s = sc.next();
        // // System.out.println(s);

        // int num = sc.nextInt();
        // sc.nextLine();
        // String name = sc.nextLine();

        // System.out.println(num);

        // MyThread t = new MyThread();
        // t.start();

        // Thread t = new Thread(new MyThread());
        // Thread s = t.currentThread();
        // System.out.println(s.getName());

        // t.start();

        // ArrayList list = new ArrayList();
        // list.add("Java");
        // list.add(10);

        // String s = (String)list.get(1);

        // System.out.println(s);

        // List<Integer> list = Arrays.asList(1,2,3,4,5);

        // list.parallelStream()
        //     .forEachOrdered(x -> {
        //         System.out.println(
        //             Thread.currentThread().getName() + " : " + x
        //         );
        //     });

        Supplier<String> s = String::new;

        System.out.println(s.get());
     }
}
