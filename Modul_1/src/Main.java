import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String NimTerakhir = "396";
        String NamaMahasiswa = "Aditya Saputra";
        String NimMahasiswa = "202410370110396";
        String Username = "adsaa" + NimTerakhir;
        String password = "aditya" + NimTerakhir;

        System.out.println("Pilih Login: ");
        System.out.println("1.Admin");
        System.out.println("2.Mahasiswa");
        System.out.print("Masukkan pilihan (1/2): ");

        int pilihan = scanner.nextInt();
        scanner.nextLine();

        if (pilihan == 1){
            System.out.print("masukkan username admin: ");
            Username = scanner.nextLine();
            System.out.print("masukkan password: ");
            password = scanner.nextLine();

            if (Username.equals( "adsaa" + 396) && password.equals("aditya" + 396)){
                System.out.println("Login Admin berhasil");
            }else{
                System.out.println("Login Gagal! Username atau password Salah");
            }
        }else if (pilihan == 2){
            System.out.print("Masukkan Nama: ");
            NamaMahasiswa = scanner.nextLine();
            System.out.print("Masukkan Nim: ");
            NimMahasiswa = scanner.nextLine();

            if (NamaMahasiswa.equals("Aditya Saputra") && NimMahasiswa.equals("202410370110396")){
                System.out.println("Login Berhasil");
                System.out.println("Nama: " + NamaMahasiswa);
                System.out.println("Nim: " + NimMahasiswa);
            }else{
                System.out.println("Login Gagal! Nama atau Nim Salah");
            }
        }else {
            System.out.println("Pilihan Tidak Valid");
        }
    }
}