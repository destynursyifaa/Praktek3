package praktek3;

public class Sapi {
    private String Jenis;
    private String Warna;
    private Integer Harga;
    
    void cetakInfo(){
        System.out.println("Jenis \t: "+Jenis+"\nWarna \t: "+Warna+"\nHarga \t: "+Harga);
    }

    public String getJenis() {
        return Jenis;
    }

    public void setJenis(String Jenis) {
        this.Jenis = Jenis;
    }

    public String getWarna() {
        return Warna;
    }

    public void setWarna(String Warna) {
        this.Warna = Warna;
    }

    public Integer getHarga() {
        return Harga;
    }

    public void setHarga(Integer Harga) {
        this.Harga = Harga;
    }
    
    
}
