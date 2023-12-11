import java.util.Scanner;

public class BioskopWithScanner27 {
    public static void main(String[] args) {
        Scanner input27 = new Scanner(System.in);
        int baris, kolom, menu;
        String nama, next;

        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan data penonton");
            System.out.println("3. Exit ");
            System.out.print("Pilih menu input(1/2/3): ");
            menu = input27.nextInt();
            input27.nextLine();

            System.out.println();

            switch (menu) {
                case 1:
                do {
                    System.out.print("Masukkan nama: ");
                    nama = input27.nextLine();
                    System.out.print("Masukkan baris: ");
                    baris = input27.nextInt();
                    System.out.print("Masukkan Kolom: ");
                    kolom = input27.nextInt();
                    input27.nextLine();
    
                    if (baris > penonton.length || kolom > penonton[baris].length || penonton[baris-1][kolom-1] != null) {
                        System.out.println("Nomor baris/kolom tersebut tidak tersedia, pilih nomor lain!");
                        System.out.println();
                        continue;
                    } 

                    penonton[baris-1][kolom-1] = nama;
    
                    System.out.println();
                    System.out.print("Input penonton lainnya? (y/n): ");
                    next = input27.nextLine();
                    System.out.println();
    
                    if (next.equalsIgnoreCase("n")) {
                        break;
                    } 
                } while (true);
                break;
                
                case 2:
                System.out.println("Daftar nama penonton Bioskop:");
                for (int i = 0; i < penonton.length; i++) {
                    System.out.print("Penonton pada baris ke-" + (i+1) + ": ");
                    for (int j = 0; j < penonton[i].length; j++) {
                        if (penonton[i][j] == null) {
                            System.out.print("*** ");
                        } else {
                            System.out.print("[" + penonton[i][j] + "] ");
                        }
                    }
                    System.out.println();
                }
                System.out.println();
                    break;

                case 3:
                    return;

                default:
                    System.out.println("Nomer Menu Salah, Masukkan Nomer lain!");
                    break;
            }
        }
    }
}