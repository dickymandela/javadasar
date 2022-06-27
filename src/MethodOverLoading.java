public class MethodOverLoading {
    public static void main(String[] args) {

        sayHello();
        sayHello("dicky");
        sayHello("dicky", "mandela");
    }

    static  void sayHello(){
        System.out.println("Hello");
    }
    static  void sayHello(String name){
        System.out.println("Hello " + name);
    }
    static  void sayHello(String name, String lastName){
        System.out.println("Hello " + name + " " + lastName);
    }
}
