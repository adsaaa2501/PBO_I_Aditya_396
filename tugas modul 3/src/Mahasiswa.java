public class Mahasiswa extends User {

    public Mahasiswa(String nama, String nim) {
        super(nama, nim);
    }

    @Override
    public boolean login() {
        return getNama().equals("Aditya Saputra") && getNim().equals("202410370110396");
    }

    @Override
    public void displayInfo() {
        System.out.println("Login berhasil sebagai Mahasiswa.");
        System.out.println("Nama: " + getNama());
        System.out.println("NIM: " + getNim());
    }
}
