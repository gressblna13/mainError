import java.util.Scanner ;
public class hitungmain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.println("Masukkan gaji bulanan:");
            double gaji = input.nextDouble();

            if (gaji < 0){
                throw new IllegalArgumentException("Gaji Tidak Boleh Negatif");
            }

            double gajiTahunan = gaji * 12;
            System.out.println("gaji tahunan :" + gajiTahunan);
        } catch ( java.util.InputMismatchException e) {
            System.out.println("Input yang anda masukkan tidak valid ");
        }
        catch ( IllegalArgumentException e ){
            System.out.println("kesalahan :" + e.getMessage());
        }
        System.out.println("program selesai");
    }

}
