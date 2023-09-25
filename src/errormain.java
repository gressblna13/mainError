public class errormain {
    public static int devide(int num1, int num2) {
        if (num2 == 0) {
            throw new ArithmeticException("tidak dapat melakukan pembagian");
        }

        return num1 / num2;
    }

    public static void main(String[] args) {
        try {
            // potensial untuk menghasilkan eksepsi
            int hasilPembagian = devide(10, 2);
            System.out.println("Hasil Pembagian:" + hasilPembagian);
        } catch (ArithmeticException e){
            // Menangani eksepsi jika terjadi AretmeticException (pembagian dari nol)
            System.out.println("Terjadi kesalahan aritmatika :" + e.getMessage());
        }
        System.out.println("selesai.");

    }
}