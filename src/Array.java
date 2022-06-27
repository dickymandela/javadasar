public class Array {
    public static void main(String[] args) {
        String[] arrayString;
        arrayString = new String[3];
        arrayString[0] = "Dicky";
        arrayString[1] = "Mandela";
        arrayString[2] = "Bandung";


        System.out.println(arrayString[0]);
        System.out.println(arrayString[1]);
        System.out.println(arrayString[2]);

        String[] namaNama = {
                "dicky", "mandela", "bandung"
        };
        System.out.println(namaNama[0]);

        String[][] members = {
                {"dicky", "mandela"},
                {"asep", "sasongko"},
                {"ujang", "gayung"}
        };

        System.out.println(members[0][1]);
        System.out.println(members[1][1]);
    }
}
