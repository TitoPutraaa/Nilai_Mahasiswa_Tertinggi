// program menginput nilai dan menampilkan nilai mahasiswa tertinggi
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // add data array variable 
        String[] id = new String[0];
        String[] nama = new String[0];
        int[] nilai = new int[0];

        do{
            // starting menu 
            System.out.println("\n====MENU====");
            System.out.println("1 = Input data");
            System.out.println("2 = Menampilkan data");
            System.out.println("3 = Menampilkan nilai tertinggi");
            System.out.println("4 = keluar program");
            System.out.print("Pilih : ");
            int menu = scan.nextInt();
            System.out.println();

            switch (menu) {
                case 1:
                    System.out.println("===Input Data===");
                    System.out.print("masukan jumlah data : ");
                    int totalData = scan.nextInt();
                    id = new String[totalData];
                    nama = new String[totalData];
                    nilai = new int[totalData];
                    inputData(scan, id, nama, nilai);
                        break;

                case 2 :
                    showData(id, nama, nilai);
                        break;

                case 3 : 
                    nilaiTertinggi(id, nama, nilai);
                        break;
                case 4 :
                    System.out.println("keluar dari program");
                    return;
                    default:
                        System.out.println("masukan pilihan yang benar");
                        break;
            }
                    
                    
        } while(true);
    }

        static void inputData(Scanner scan, String[] id, String[] nama, int[] nilai) {
            for (int i = 0; i < nama.length; i++) {
                System.out.println("MAHASISWA KE-" + (i+1));
                System.out.print("ID : ");
                id[i] = scan.next();
                System.out.print("Nama : ");
                scan.nextLine();
                nama[i] = scan.nextLine();
                System.out.print("Nilai : ");
                nilai[i] = scan.nextInt();
            }
        }

        static void showData(String[] id, String[] nama, int[] nilai) {
            if (nama.length != 0 ) {
                for (int i = 0; i < nama.length; i++) {
                    System.out.println("\nMAHASISWA KE-" + (i+1));
                    System.out.println("ID : " + id[i]);
                    System.out.println("Nama : " + nama[i]);
                    System.out.println("Nilai : " + nilai[i]);             
                }
            } else {
                System.out.println("=====DATA KOSONG=====");
            }
        }
 
        // note membuat algorima untuk memilih nilia tertinggi
        static void nilaiTertinggi(String[] id, String[] nama, int[] nilai){
                int max = 0;
                for (int j = 0; j < nama.length; j++) {
                    if (nilai[max] < nilai[j]) {
                        max = j;
                }
            }
                System.out.println("Mahasiswa dengan nilai tertinggi");
                System.out.println("ID : " + id[max]);
                System.out.println("Nama : " + nama[max]);
                System.out.println("Nilai  : " + nilai[max]);
    }
}