import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        String Admin =  "Aditya396";
        String password = "adsa2501";
        byte pilihan = 0;
        String inputAdmin;

        System.out.println("pilihan : ");
        System.out.println("1.Admin");
        System.out.println("2.Mahasiswa");
        System.out.println("masukkan pilihan(1/2): ");
        pilihan = Scan.nextByte();


        switch (pilihan){
            case 1:
            System.out.println("Masukkan Nama Admin : ");
            inputAdmin = Scan.nextLine();
        }


    }
}