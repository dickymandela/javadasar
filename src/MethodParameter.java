public class MethodParameter {
    public static void main(String[] args) {
        sayHello("dicky", "mandela");
        sayHello("asep", "baskom");
    }

    static void sayHello (String firstName, String lastName){
        System.out.println("Hello"+" " + firstName + " " + lastName);
    }
}
