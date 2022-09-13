public class Buah{
    String ukuran,warna;
    int berat;

    public static void main(String args[]){
        Buah apel = new Buah();
        Buah pisang = new Buah();
        Buah mangga = new Buah();
        apel.warna = "merah";
        apel.ukuran = "sedang";
        apel.berat = 200;
        pisang.warna = "kuning";
        pisang.ukuran = "besar";
        pisang.berat = 300;
        mangga.warna = "hijau kekuningan";
        mangga.ukuran = "kecil";
        mangga.berat = 100;

        System.out.println("\nApel");
        System.out.println("\twarna :"+apel.warna);
        System.out.println("\tukuran:"+apel.ukuran);
        System.out.println("\tberat :"+apel.berat+" gr\n");
        System.out.println("Pisang");
        System.out.println("\twarna :"+pisang.warna);
        System.out.println("\tukuran:"+pisang.ukuran);
        System.out.println("\tberat :"+pisang.berat+" gr\n");
        System.out.println("Mangga");
        System.out.println("\twarna :"+mangga.warna);
        System.out.println("\tukuran:"+mangga.ukuran);
        System.out.println("\tberat :"+mangga.berat+" gr\n");
    }
}
