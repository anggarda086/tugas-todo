package latihan_pbo;

// Kelas Anjing
class Anjing {
    // Properti
    private String nama;
    private String ras;
    private int umur;
    private String warnaBulu;

    // Konstruktor
    public Anjing(String nama, String ras, int umur, String warnaBulu) {
        this.nama = nama;
        this.ras = ras;
        this.umur = umur;
        this.warnaBulu = warnaBulu;
    }

    public void gonggong() {
        System.out.println(nama + " sedang menggonggong: guk guk gukkkk");
    }

    public void berlari() {
        System.out.println(nama + " lagi berlari.");
    }

    public void tidur() {
        System.out.println(nama + " lagi tidur.");
    }

    public void ubahWarnaBulu(String warnaBaru) {
        warnaBulu = warnaBaru;
        System.out.println(nama + " merubah warna bulunya menjadi " + warnaBulu);
    }

    public String getNama() {
        return nama;
    }
}

public class Latihan_PBO {
    public static void main(String[] args) {
        // Membuat objek Anjing
        Anjing anjing = new Anjing("Ryan", "Bolognese", 3, "Coklat muda");

        // Memanggil beberapa metode untuk objek Anjing
        anjing.gonggong();
        anjing.berlari();
        anjing.tidur();
        anjing.ubahWarnaBulu("Coklat tua");
        System.out.println("Nama anjing: " + anjing.getNama());
    }
}
