public class IfStatement {
    public static void main(String[] args) {
        var nilai = 70;
        var absen = 90;

        if (nilai >= 75 && absen >= 75){
            System.out.println("selamat anda lulus");
        }else{
            System.out.println("anda Tidak Lulus");
        }

        if (nilai >= 80 && absen >= 80 ){
            System.out.println("Nilai Anda A");
        } else if (nilai >= 70 && absen >= 70 ){
            System.out.println("Nilai Anda B");
        }else if (nilai >= 60 && absen >= 60 ){
            System.out.println("Nilai Anda C");
        } else {
            System.out.println("Nilai Anda E");
        }
    }
}
