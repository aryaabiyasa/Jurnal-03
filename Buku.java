public class Buku {
    private String judul;
    private String penulis;
    private int tahun;

    public Buku(String buku, String penulis, int tahun) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahun = tahun;
    }

    public String getBuku() {
        return judul;
    }
    
    public String getPenerbit() {
        return penulis;
    }

    public int getTahun() {
        return tahun;
    }

    @Override
    public String toString() {
        return "Buku [judul=" + judul + ", penulis=" + penulis + ", tahun=" + tahun + "]";
    }
}
