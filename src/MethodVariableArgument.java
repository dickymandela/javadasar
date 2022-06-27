public class MethodVariableArgument {
    public static void main(String[] args) {
        int[] values = { 80, 80, 80, 80};
        sayCongrats("eko", values);
        sayCongrats("budi", 70, 65, 6, 60);
    }
    static void sayCongrats(String name, int... values){
        var total = 0;
        for (var value : values ){
            total += value;
        }

        var finalValue = total / values.length;
        if (finalValue >= 75){
            System.out.println("selamat " + name + " ,anda lulus");
        }else {
            System.out.println("maaf " + name + " ,anda tidak lulus");

        }
    }
}
