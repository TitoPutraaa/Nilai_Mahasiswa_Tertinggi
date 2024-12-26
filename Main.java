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
            System.out.println("====MENU====");
            System.out.println("1 = Input data");
            System.out.println("2 = Menampilkan data");
            System.out.println("3 = Menampilkan nilai tertinggi");
            System.out.println("4 = keluar program");
            System.out.print("Pilih : ");
            int menu = scan.nextInt();
            boolean dataAda = false;

            switch (menu) {
                case 1:
                    System.out.println("===Input Data===");
                    System.out.print("masukan jumlah data : ");
                    int totalData = scan.nextInt();
                    id = new String[totalData];
                    nama = new String[totalData];
                    nilai = new int[totalData];
                    dataAda = true;
                    inputData(scan, id, nama, nilai);
                        break;
                case 2 :
                    showData(id, nama, nilai, dataAda);
                        break;
                                
                    default:
                        break;
            }
                    
                    
        } while(true);
    }

        static void inputData(Scanner scan, String[] id, String[] nama, int[] nilai) {
            for (int i = 0; i < nama.length; i++) {
                System.out.println("===MAHASISWA KE - " + (i+1));
                System.out.print("ID : ");
                id[i] = scan.next();
                System.out.print("Nama : ");
                nama[i] = scan.nextLine();
                scan.nextLine();
                System.out.print("ID : ");
                nilai[i] = scan.nextInt();
            }
        }

        static void showData(String[] id, String[] nama, int[] nilai, boolean dataAda) {
            if (dataAda) {
                for (int i = 0; i < nama.length; i++) {
                    System.out.println("=== MAHASISWA KE - " + (i=1) + " ===");
                    System.out.println("ID : " + id[i]);
                    System.out.println("Nama: " + nama[i]);
                    System.out.println("Nilai : " + nilai[i]);
                }
            } else {
                System.out.println("=====DATA KOSONG=====");
            }
        }
 
        // note membuat algorima untuk memilih nilia tertinggi
        static void nilaiTertinggi(String[] id, String[] nama, int[] nilai){
            for (int i = 0; i < nama.length; i++) {
                for (int j = 0; j < nama.length; j++) {
                    if (nilai[j] > nilai[i]) {
                        int temp = nilai[j];
                    }
                }
            }
        }

        
}