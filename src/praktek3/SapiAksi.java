package praktek3;
public class SapiAksi {
    public static void main(String[] args) {
        Sapi s = new Sapi();
        
        s.setJenis("Sapi Perah");
        s.setWarna("Hitam");
        s.setHarga(4500000);

        
        s.cetakInfo();
        
        System.out.println("Jenisnya \t: ");
        System.out.println(s.getJenis());
        System.out.println("Warnanya \t: ");
        System.out.println(s.getWarna());
        System.out.println("Harganya \t: ");
        System.out.println(s.getHarga());
    }
}
