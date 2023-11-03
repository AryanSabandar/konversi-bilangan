package AOK;

 import java.util.Scanner;

    public class UbahBilangan {
    

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            while (true) {
                System.out.println("Pilihan konversi:");
                System.out.println("1. Desimal ke Biner");
                System.out.println("2. Desimal ke Oktal");
                System.out.println("3. Desimal ke Heksadesimal");
                System.out.println("4. Biner ke Desimal");
                System.out.println("5. Oktal ke Desimal");
                System.out.println("6. Heksadesimal ke Desimal");
                System.out.println("0. Keluar");

                System.out.print("Masukkan pilihan Anda: ");
                int pilihan = input.nextInt();

                if (pilihan == 0) {
                    break;
                }

                System.out.print("Masukkan bilangan: ");
                String bilangan = input.next();

                switch (pilihan) {
                    case 1:
                        int desimal = Integer.parseInt(bilangan);
                        String biner = Integer.toBinaryString(desimal);
                        System.out.println("Hasil konversi: " + biner);
                        break;
                    case 2:
                        int desimal2 = Integer.parseInt(bilangan);
                        String oktal = Integer.toOctalString(desimal2);
                        System.out.println("Hasil konversi: " + oktal);
                        break;
                    case 3:
                        int desimal3 = Integer.parseInt(bilangan);
                        String heksadesimal = Integer.toHexString(desimal3);
                        System.out.println("Hasil konversi: " + heksadesimal);
                        break;
                    case 4:
                        int desimal4 = Integer.parseInt(bilangan, 2);
                        System.out.println("Hasil konversi: " + desimal4);
                        break;
                    case 5:
                        int desimal5 = Integer.parseInt(bilangan, 8);
                        System.out.println("Hasil konversi: " + desimal5);
                        break;
                    case 6:
                        int desimal6 = Integer.parseInt(bilangan, 16);
                        System.out.println("Hasil konversi: " + desimal6);
                        break;
                    default:
                        System.out.println("Pilihan tidak valid.");
                }
            }
        }
}

    

