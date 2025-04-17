public class Mahasiswa {
    private String[][] dataMahasiswa = {
            {"Aditya Saputra", "202410370110396"},
            {"Mario Maulana", "202410370110399"}
    };

    public boolean login(String inputNama, String inputNim) {
        for (String[] mhs : dataMahasiswa) {
            if (mhs[0].equals(inputNama) && mhs[1].equals(inputNim)) {
                System.out.println("Login Mahasiswa BERHASILLL!\n");
                displayInfo(mhs[0], mhs[1]);
                return true;
            }
        }
        System.out.println("Nama atau NIM Mahasiswa SALAHHH!\n");
        return false;
    }

    public void displayInfo(String nama, String nim) {
        System.out.println("=== Informasi Mahasiswa ===");
        System.out.println("Nama: " + nama);
        System.out.println("NIM : " + nim + "\n");
    }
}
