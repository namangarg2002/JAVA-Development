public class LaunchClassForNameEx {
    public static void main(String[] args) throws ClassNotFoundException {
        
        // Demo d = new Demo(); 
        // it will print -> Static Block
                        //  Instance block ==> Non static

        Class.forName("Demo");
        // it will print -> Staic Block


    }
}

class Demo{
    static{
        System.out.println("Static Block");
    }

    {
        System.out.println("Instance block ==> Non static");
    }
}
