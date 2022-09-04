public class Tombol{
    int lebar,tinggi;
    String warna;

    void aksi(){
        System.out.println("ini tombol");
    }

    public static void main(String args[]){
        Tombol login = new Tombol();
        login.lebar=3;
        login.tinggi=3;
        login.warna="merah";
        System.out.println(login.warna);
    }

}
