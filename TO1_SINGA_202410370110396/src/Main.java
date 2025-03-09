public class Sapi {
    void bersuara() {
    System.out.printf("MOoooooo\n");
}
    void berjalan(){
        System.out.printf("Sapi sedang berjalan di padang rumput\n");
    }
    void berkembangBiak(){
        System.out.printf("Sapi melahirkan anak sapi\n");
    } }
public class Main {
    public static void main(String[] args) {
        Sapi sapi1 = new Sapi();
        sapi1.bersuara();         sapi1.berjalan();         sapi1.berkembangBiak();
    }
}
