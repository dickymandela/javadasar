public class Switch {
    public static void main(String[] args) {
        var nilai = "A" ;
        String ucapan ;

        switch (nilai){
            case "A":
                System.out.println("nilai anda Sempurna");
                break;
            case "B":
            case "C":
                System.out.println("Nilai anda cukup Baik");
                break;
            case "c":
                System.out.println("nilai anda Cukup");
                break;
            default  :
                System.out.println("anda salah jurusan");
                break;
        }

        switch (nilai){
            case "A" -> System.out.println("nilai anda Sempurna");
            case "B", "C" -> System.out.println("Nilai anda cukup Baik");
            case "D" -> System.out.println("nilai anda Cukup");
            default -> {
                System.out.println("anda salah jurusan");
            }

        }    }
}
