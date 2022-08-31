public class Buah {
    String ukuran,warna;
    int berat;

    public static void main(String args[]){
        Buah apel = new Buah();
        Buah pisang = new Buah();
        Buah mangga = new Buah();
        apel.warna = "merah";
        apel.ukuran = "sedang";
        pisang.warna = "kuning";
        pisang.ukuran = "besar";
        mangga.warna = "hijau kekuningan";
        mangga.ukuran = "kecil";

        System.out.println("Apel");
        System.out.println(apel.warna);
        System.out.println(apel.ukuran);
        System.out.println("Pisang");
        System.out.println(pisang.warna);
        System.out.println(pisang.ukuran);
        System.out.println("Mangga");
        System.out.println(mangga.warna);
        System.out.println(mangga.ukuran);
    }
}
