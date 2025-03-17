import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        double topUp;
        double tarik;
        RekeningBank rekening = new RekeningBank();
        RekeningBank rekening2 = new RekeningBank();

        rekening.nomorRekening = "202410370110396";
        rekening.namaPemilik = "Aditya Saputra";
        rekening.saldo = 1000000000;

        rekening2.nomorRekening = "202410370110391";
        rekening2.namaPemilik = "Yossua Agung B.";
        rekening2.saldo = 20000000;

        rekening.tampilkanInfo();
        rekening2.tampilkanInfo();

        System.out.printf("Masukkan Saldo yang ingin ditambahkan: ");
        topUp = input.nextDouble();
        rekening.setorUang(topUp);

        System.out.printf("Masukkan Saldo yang ingin ditambahkan: ");
        topUp = input.nextDouble();
        rekening2.setorUang(topUp);

        rekening.tampilkanInfo();
        rekening2.tampilkanInfo();

        System.out.printf("Masukkan Nominal yang ingin ditarik: ");
        tarik = input.nextDouble();
        rekening.tarikTunai(tarik);

        System.out.printf("Masukkan Nominal yang ingin ditarik: ");
        tarik = input.nextDouble();
        rekening2.tarikTunai(tarik);
        input.close();
    }
}